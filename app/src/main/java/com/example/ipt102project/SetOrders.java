package com.example.ipt102project;

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

        FoodMenu model = new FoodMenu();
        ArrayList<FoodMenu> list = new ArrayList<FoodMenu>();

        model.setTextView_foodName("some dummy data");
        model.setImageView_foodImage("some dummy data");

        list.add(model);

        RecyclerView recycler_view = (RecyclerView) findViewById(R.id.recycler_view_SetOrders);


        // use this if you want the RecyclerView to look like a vertical list view
        recycler_view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        FoodMenuAdapter adapter = new FoodMenuAdapter(list, this);
        recycler_view.setAdapter(adapter);
    }
}