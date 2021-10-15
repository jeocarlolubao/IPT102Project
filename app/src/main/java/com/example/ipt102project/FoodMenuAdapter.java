package com.example.ipt102project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodMenuAdapter extends RecyclerView.Adapter<FoodMenuAdapter.Viewholder>{

    private ArrayList<FoodMenu> data;
    private FoodMenu model;
    private Context context;

    public FoodMenuAdapter(ArrayList<FoodMenu> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        // 1. Declare your Views here

        public TextView textView_foodName;
        public ImageView imageView_foodImage;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            // 2. Define your Views here

            textView_foodName = (TextView) itemView.findViewById(R.id.textView_foodName);
            imageView_foodImage = (ImageView) itemView.findViewById(R.id.imageView_foodImage);

        }

    }


        @Override
        public  FoodMenuAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_set_orders, parent, false);

            return new Viewholder(itemView);
        }

        @Override
        public void onBindViewHolder(Viewholder holder, int position) {

            model = data.get(position);

            // 3. set the data to your Views here

            /**
             *
             The format to set data should be like this example:
             --------------------------------------
             holder.txvName.setText(model.getName());
             *
             */

            holder.textView_foodName.setText("Food #1");
            holder.textView_foodName.setText("Food #2");
            //TODO: APPEND IMAGE FOR RECYCLERVIEW

        }



    @Override
    public int getItemCount() {
        return data.size();
    }

}