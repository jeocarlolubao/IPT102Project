package com.example.ipt102project;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SetOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_orders);


        //  FoodMenuData(String FoodMenu_foodname, int imgID, double FoodMenu_foodprice)
        FoodMenuData[] myListData = new FoodMenuData[] {
                //TODO: FIX THIS SHIT TO SEE IMAGES
                new FoodMenuData("Food1" , getResources().getDrawable(R.drawable.only_milktea), 12.2),
                new FoodMenuData("Food2" , getResources().getDrawable(R.drawable.only_milktea), 15.23),
                new FoodMenuData("Food3" , getResources().getDrawable(R.drawable.only_milktea), 15.23),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView_FoodMenu);
        FoodMenuAdapter adapter = new FoodMenuAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}