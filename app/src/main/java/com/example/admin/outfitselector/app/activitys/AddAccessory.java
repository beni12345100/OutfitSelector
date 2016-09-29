package com.example.admin.outfitselector.app.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.admin.outfitselector.app.R;

/**
 * Created by admin on 28.09.2016.
 */
public class AddAccessory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addaccessory);
        Spinner dropdown = (Spinner) findViewById(R.id.accessory_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.accessory_categorys, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        dropdown.setAdapter(adapter);
    }
    public void save(View view) {
        Intent intent = new Intent(this, ListAccessories.class);
        startActivity(intent);
    }
}
