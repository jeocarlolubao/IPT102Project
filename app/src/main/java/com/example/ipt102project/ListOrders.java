package com.example.ipt102project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ListOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_orders);

        Intent intent = getIntent();

        String ChocoMaltAdded, JavaChipAdded, GreenAppleAdded, TaroAdded;
        double ChocoMaltTotal, JavaChipTotal, GreenAppleTotal, TaroTotal;
        boolean ChocoMaltChecked;
        int ChocoMaltQty;

        int ChocoMaltImg;

        ChocoMaltAdded = getIntent().getExtras().getString("ChocoMaltAdded");
        JavaChipAdded = getIntent().getExtras().getString("JavaChipAdded");
        GreenAppleAdded = getIntent().getExtras().getString("GreenAppleAdded");
        TaroAdded = getIntent().getExtras().getString("TaroAdded");

        ChocoMaltTotal = getIntent().getExtras().getDouble("TaroTotal");

        ChocoMaltChecked = getIntent().getExtras().getBoolean("ChocoMaltChecked");

        ChocoMaltQty = getIntent().getExtras().getInt("ChocoMaltQty");

        ChocoMaltImg = getIntent().getExtras().getInt("img_ChocoMalt");

//        ListOrdersData(String FoodMenu_foodname, int imgID, double FoodMenu_foodprice, double SubtotalValue, boolean itemHasPearls, int quantity);


            ListOrdersData[] myListData = new ListOrdersData[]{
                    new ListOrdersData(
                            "Chocomalt Cream Puff",
                            ChocoMaltImg,
                            50.00,
                            ChocoMaltTotal,
                            ChocoMaltChecked, ChocoMaltQty)

            };

//            new ListOrdersData("Chocomalt Cream Puff", R.id.imageView_ChocoMalt, 50.00, ChocoMaltTotal, ChocoMaltChecked, ChocoMaltQty)





        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView_FoodMenu);
        ListOrdersAdapter adapter = new ListOrdersAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

// TODO : SEND INTENT DATA TO RECYCLERVIEW