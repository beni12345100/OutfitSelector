package com.example.admin.outfitselector.app.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

import com.example.admin.outfitselector.app.BOs.Clothes.*;
import com.example.admin.outfitselector.app.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {
    public static ClothingCategories categories;
    private static final String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         categories = new ClothingCategories();

    }
    public void startBuilding(View view) {
        Intent intent = new Intent(this, SelectClothingCategory.class);
        startActivity(intent);
    }
    public void viewClothingItems(View view) {
        Intent intent = new Intent(this, ListClothes.class);
        startActivity(intent);
    }
    public void viewAccessories(View view) {
        Intent intent = new Intent(this, ListAccessories.class);
        startActivity(intent);
    }

    private String readFromFile() {

        String ret = "";

        try {
            InputStream inputStream = openFileInput("jacket.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                String[] arr = new String[3];

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    arr = receiveString.split("¦");
                    categories.getJackets().add(new Jacket(arr[1], arr[2], arr[3]));
                }

                inputStream.close();

            }
        }
        catch (FileNotFoundException e) {
            Log.e(TAG, "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e(TAG, "Can not read file: " + e.toString());
        }

        return ret;
    }


}
