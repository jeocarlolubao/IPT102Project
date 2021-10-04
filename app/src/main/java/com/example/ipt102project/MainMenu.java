package com.example.ipt102project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
}