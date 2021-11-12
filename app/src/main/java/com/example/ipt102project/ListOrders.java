package com.example.ipt102project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.shawnlin.numberpicker.NumberPicker;

import org.w3c.dom.Text;

public class ListOrders extends AppCompatActivity {

    TextView textView_TotalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_orders);

        Intent intent = getIntent();

        String ChocoMaltAdded, JavaChipAdded, GreenAppleAdded, TaroAdded;
        double ChocoMaltTotal, JavaChipTotal, GreenAppleTotal, TaroTotal;
        boolean ChocoMaltChecked, JavaChipChecked, GreenAppleChecked, TaroChecked;
        int ChocoMaltQty, JavaChipQty, GreenAppleQty, TaroQty;

//        int ChocoMaltImg;

        ChocoMaltAdded = getIntent().getExtras().getString("ChocoMaltAdded");
        ChocoMaltTotal = getIntent().getExtras().getDouble("ChocoMaltTotal");
        ChocoMaltChecked = getIntent().getExtras().getBoolean("ChocoMaltChecked");
        ChocoMaltQty = getIntent().getExtras().getInt("ChocoMaltQty");

        JavaChipAdded = getIntent().getExtras().getString("JavaChipAdded");
        JavaChipTotal = getIntent().getExtras().getDouble("JavaChipTotal");
        JavaChipChecked = getIntent().getExtras().getBoolean("JavaChipChecked");
        JavaChipQty = getIntent().getExtras().getInt("JavaChipQty");

        GreenAppleAdded = getIntent().getExtras().getString("GreenAppleAdded");
        GreenAppleTotal = getIntent().getExtras().getDouble("GreenAppleTotal");
        GreenAppleChecked = getIntent().getExtras().getBoolean("GreenAppleChecked");
        GreenAppleQty = getIntent().getExtras().getInt("GreenAppleQty");

        TaroAdded = getIntent().getExtras().getString("TaroAdded");
        TaroTotal = getIntent().getExtras().getDouble("TaroTotal");
        TaroChecked = getIntent().getExtras().getBoolean("TaroChecked");
        TaroQty = getIntent().getExtras().getInt("TaroQty");

//        ChocoMaltImg = getIntent().getExtras().getInt("img_ChocoMalt");

//        ListOrdersData(String FoodMenu_foodname, int imgID, double FoodMenu_foodprice, double SubtotalValue, boolean itemHasPearls, int quantity);


            ListOrdersData[] myListData = new ListOrdersData[]{
                    new ListOrdersData(
                            "Chocomalt Cream Puff",
                            50.00,
                            ChocoMaltTotal,
                            ChocoMaltChecked, ChocoMaltQty),
                    new ListOrdersData(
                            "Java Chip Frappe",
                            60.00,
                            JavaChipTotal,
                            JavaChipChecked, JavaChipQty),
                    new ListOrdersData(
                            "Green Apple Fruit Tea",
                            40.00,
                            GreenAppleTotal,
                            GreenAppleChecked, GreenAppleQty),
                    new ListOrdersData(
                            "Taro Rock Salt Cheese",
                            30.00,
                            TaroTotal,
                            TaroChecked, TaroQty)
            };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView_FoodMenu);
        ListOrdersAdapter adapter = new ListOrdersAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        textView_TotalValue = findViewById(R.id.textView_TotalValue);

        double Ordertotal = ChocoMaltTotal + JavaChipTotal + GreenAppleTotal + TaroTotal;

        textView_TotalValue.setText(Double.toString(Ordertotal));


    }
}

// TODO : SEND INTENT DATA TO RECYCLERVIEW