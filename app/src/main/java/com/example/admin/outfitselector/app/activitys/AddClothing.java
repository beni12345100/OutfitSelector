package com.example.admin.outfitselector.app.activitys;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import 	android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.provider.MediaStore;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.os.Environment;
import 	android.graphics.BitmapFactory;

import com.example.admin.outfitselector.app.BOs.Clothes.*;

import com.example.admin.outfitselector.app.R;

/**
 * Created by admin on 28.09.2016.
 */
public class AddClothing extends AppCompatActivity {
    private static final String TAG = AddClothing.class.getName();
    private ImageView mImageView;
    private File bildDatei;
    private String brand;
    private String description;
    private String dateiPfad;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addclothing);
        spinner = (Spinner) findViewById(R.id.accessory_spinner);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.clothing_categorys, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
        mImageView = (ImageView) findViewById(R.id.mImageView);
        brand="";
        description="";

    }
    private void writeToFileJacket(String data) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("jacket.txt", Context.MODE_APPEND));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e(TAG, "File write failed: " + e.toString());
        }
    }


    public void save(View view) {
        EditText e = (EditText) this.findViewById(R.id.in_brand);
        brand = e.getText().toString();
        EditText et = (EditText) this.findViewById(R.id.in_brand);
        if(dateiPfad == null)
            return;
        description = et.getText().toString();


        if(spinner.getSelectedItem().toString().equals("Jacket")){
            MainActivity.categories.getJackets().add(new Jacket(brand, description, dateiPfad));
            writeToFileJacket(brand +"¦"+description+"¦"+dateiPfad);
        }else if(spinner.getSelectedItem().toString().equals("Sweatshirt")){
            MainActivity.categories.getSweatshirts().add(new Sweatshirt(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Hoddie")){
            MainActivity.categories.getHoodies().add(new Hoddie(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("T-Shirt")){
            MainActivity.categories.getTshirts().add(new Tshirt(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Shirt")){
            MainActivity.categories.getShirts().add(new Shirt(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Polo Shirt")){
            MainActivity.categories.getPoloShirts().add(new PoloShirt(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Jeans")){
            MainActivity.categories.getJeans().add(new Jeans(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Pants")){
            MainActivity.categories.getPants().add(new Pants(brand, description, dateiPfad));
        }else if(spinner.getSelectedItem().toString().equals("Shorts")){
            MainActivity.categories.getShorts().add(new Shorts(brand, description, dateiPfad));
        }
        finish();


    }
    public void takePicture(View view) {
        try {
            int check = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (check != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new
                        String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return;
            }
        }catch(Exception exception){}
        try {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            bildDatei = bildDateiErzeugen();
            intent.putExtra(MediaStore.EXTRA_OUTPUT,
                    Uri.fromFile(bildDatei));
            startActivityForResult(intent, 1); // 1 = beliebige ID
        } catch (IOException e) {

        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            dateiPfad = bildDatei.getAbsolutePath();
            Bitmap bitmap = BitmapFactory.decodeFile(dateiPfad, options);
            mImageView.setImageBitmap(bitmap);
        }
    }
    private File bildDateiErzeugen() throws IOException {
        String dateiName = "CameraSimple_" + System.currentTimeMillis()
                + ".jpg";
        File dir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        return new File(dir, dateiName);
    }
}
