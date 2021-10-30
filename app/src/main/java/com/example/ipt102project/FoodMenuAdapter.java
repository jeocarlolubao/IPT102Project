package com.example.ipt102project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class FoodMenuAdapter extends RecyclerView.Adapter<FoodMenuAdapter.ViewHolder> {
    private FoodMenuData[] listdata;

    public FoodMenuAdapter(FoodMenuData[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.activity_foodmenu_recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final FoodMenuData myListData = listdata[position];
        holder.foodName.setText(listdata[position].getFoodMenu_foodname());
        holder.foodPrice.setText(String.valueOf(listdata[position].getFoodMenu_foodprice()));
        holder.foodImage.setImageResource(listdata[position].getImgID());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodImage;
        public TextView foodName;
        public TextView foodPrice;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            // SET IMAGES
            this.foodImage = (ImageView) itemView.findViewById(R.id.imageView_FoodMenu_foodimage);
            // SET FOOD NAMES
            this.foodName = (TextView) itemView.findViewById(R.id.textView_FoodMenu_foodname);
            // SET FOOD PRICE
            this.foodPrice = (TextView) itemView.findViewById(R.id.textView_FoodMenu_foodprice);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout_FoodMenuRelativeLayout);
        }
    }


}
