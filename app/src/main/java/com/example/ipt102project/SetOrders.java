package com.example.ipt102project;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Data;

import android.os.Bundle;

import java.util.ArrayList;

public class SetOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_orders);


        //  FoodMenuData(String FoodMenu_foodname, int imgID, double FoodMenu_foodprice)
        FoodMenuData[] myListData = new FoodMenuData[] {

                new FoodMenuData("Chocolate" , android.R.drawable.btn_star, 12.2),
                new FoodMenuData("Mango" , android.R.drawable.btn_plus, 15.23),
                new FoodMenuData("Milktea Flavor" , android.R.drawable.btn_dialog, 15.23),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView_FoodMenu);
        FoodMenuAdapter adapter = new FoodMenuAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}