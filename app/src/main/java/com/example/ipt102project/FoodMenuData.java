package com.example.ipt102project;

import android.graphics.drawable.Drawable;

public class FoodMenuData {



    private String FoodMenu_foodname;
    private int imgID;
    private double FoodMenu_foodprice;

    public FoodMenuData(String FoodMenu_foodname , Drawable imgID, double FoodMenu_foodprice){
        this.FoodMenu_foodname = FoodMenu_foodname;
        this.imgID = imgID;
        this.FoodMenu_foodprice = FoodMenu_foodprice;
    }


    public String getFoodMenu_foodname() {
        return FoodMenu_foodname;
    }

    public void setFoodMenu_foodname(String foodMenu_foodname) {
        FoodMenu_foodname = foodMenu_foodname;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public double getFoodMenu_foodprice() {
        return FoodMenu_foodprice;
    }

    public void setFoodMenu_foodprice(double foodMenu_foodprice) {
        FoodMenu_foodprice = foodMenu_foodprice;
    }
}
