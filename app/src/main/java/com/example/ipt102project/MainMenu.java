package com.example.ipt102project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ornach.nobobutton.NoboButton;

public class MainMenu extends AppCompatActivity {


    //DECLARE ALL COMPONENTS
    NoboButton NoboButton_CreateOrder;
    NoboButton NoboButton_OrdersMade;
    NoboButton NoboButton_About;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        NoboButton_CreateOrder = findViewById(R.id.NoboButton_CreateOrder);
        NoboButton_OrdersMade = findViewById(R.id.NoboButton_OrdersMade);
        NoboButton_About = findViewById(R.id.NoboButton_About);

        NoboButton_CreateOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoFoodMenu = new Intent(MainMenu.this, FoodMenu.class);
                MainMenu.this.startActivity(movetoFoodMenu);
                MainMenu.this.finish();


            }
        });



    }
}