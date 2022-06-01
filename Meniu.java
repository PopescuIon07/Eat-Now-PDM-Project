package com.example.proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Meniu extends AppCompatActivity {

    private RecyclerView menuList;
    private List<Item> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);
        menuList = findViewById(R.id.menuItemsList);
        menuList.setLayoutManager(new LinearLayoutManager(this));
        createMenuItems();
        menuList.setAdapter(new MyAdapter(menuItems));
    }


    private void createMenuItems(){ //this method will create objects MenuItem
        Item menuItem = new Item("French Beef stake", "EUR 25.00", R.drawable.image1);
        Item menuItem2 = new Item("Senegalese Mix", "EUR 35.00", R.drawable.image2);
        Item menuItem3 = new Item("Cote D'Azur Burger", "EUR 15.00", R.drawable.image3);
        Item menuItem4 = new Item("Vietnam Super Rice", "EUR 13.50", R.drawable.image4);
        Item menuItem5 = new Item("Italian Cotellete", "EUR 18.50", R.drawable.image5);
        Item menuItem6 = new Item("Fat sandwich", "EUR 11.50", R.drawable.image6);
        Item menuItem7 = new Item("Super French Mixture", "EUR 22.50", R.drawable.image7);
        Item menuItem8 = new Item("The Cameroonian Smart Drink", "EUR 14.55", R.drawable.image8);
        Item menuItem9 = new Item("The french Saucisses", "EUR 14.50", R.drawable.image9);
        Item menuItem10 = new Item("The mixture of pleasure", "EUR 13.50", R.drawable.image10);
        menuItems.add(menuItem);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
        menuItems.add(menuItem5);
        menuItems.add(menuItem6);
        menuItems.add(menuItem7);
        menuItems.add(menuItem8);
        menuItems.add(menuItem9);
        menuItems.add(menuItem10);
    }

}