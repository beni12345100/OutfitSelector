package com.example.admin.outfitselector.app.application;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

import com.example.admin.outfitselector.app.activitys.MainActivity;
import com.example.admin.outfitselector.app.activitys.SelectClothingCategory;

/**
 * Created by admin on 28.09.2016.
 */
public class CheckBoxClick implements OnItemClickListener {

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub
        CheckedTextView ctv = (CheckedTextView) arg1;
        if (ctv.isChecked()) {
            if (ctv.getText().equals("Jackets")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getJackets());
            } else if (ctv.getText().equals("Sweatshirts")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getSweatshirts());
            } else if (ctv.getText().equals("Hoddies")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getHoodies());
            } else if (ctv.getText().equals("T-Shirts")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getTshirts());
            } else if (ctv.getText().equals("Shirts")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getShirts());
            }else if (ctv.getText().equals("Polo Shirts")) {
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getPoloShirts());
            } else if (ctv.getText().equals("Jeans")){
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getJeans());
            } else if (ctv.getText().equals("Pants")){
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getPants());
            } else if(ctv.getText().equals("Shorts")){
                SelectClothingCategory.selectedClothingCategories.addAll(MainActivity.categories.getShorts());
            }
        }
    }
}
