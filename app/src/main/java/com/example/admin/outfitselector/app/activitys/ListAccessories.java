package com.example.admin.outfitselector.app.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.admin.outfitselector.app.R;

/**
 * Created by admin on 28.09.2016.
 */
public class ListAccessories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaccessories);

    }
    public void newAccessory(View view) {
        Intent intent = new Intent(this, AddAccessory.class);
        startActivity(intent);
    }
}
