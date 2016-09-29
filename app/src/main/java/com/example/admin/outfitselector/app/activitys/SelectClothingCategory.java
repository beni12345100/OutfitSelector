package com.example.admin.outfitselector.app.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.admin.outfitselector.app.BOs.Clothes.ClothingCategories;
import com.example.admin.outfitselector.app.BOs.Clothes.ClothingItems;
import com.example.admin.outfitselector.app.R;
import com.example.admin.outfitselector.app.application.CheckBoxClick;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.ListView;


/**
 * Created by admin on 28.09.2016.
 */
public class SelectClothingCategory extends AppCompatActivity {

    String[] categories = {"Jackets", "Sweatshirts", "Hoddies", "T-Shirts", "Shirts", "Polo Shirts", "Jeans", "Pants", "Shorts"};
    ListView listview;
    public static ArrayList<ClothingItems> selectedClothingCategories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectclothingcategory);
        selectedClothingCategories = new ArrayList<ClothingItems>();
        listview = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, categories);
        listview.setAdapter(adapter);
        listview.setItemsCanFocus(false);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listview.setOnItemClickListener(new CheckBoxClick());
    }
    public void next(View view) {
        Intent intent = new Intent(this, SelectClothes.class);
        startActivity(intent);
    }

}
