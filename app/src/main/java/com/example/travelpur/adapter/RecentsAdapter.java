package com.example.travelpur.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travelpur.DetailsActivity;
import com.example.travelpur.R;
import com.example.travelpur.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecentsViewsHolder> {
    Context context;
    List<RecentsData> recentsDataList;

    public RecentsAdapter(Context context, List<RecentsData> recentsDataList) {
        this.context = context;
        this.recentsDataList = recentsDataList;
    }

    @NonNull
    @Override
    public RecentsViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.recents_row_item, parent , false);

        return new RecentsViewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewsHolder holder, int  position) {
        holder.countryName.setText(recentsDataList.get(position).getCountryName());
        holder.PlaceName.setText(recentsDataList.get(position).getPlaceName());
        holder.price.setText(recentsDataList.get(position).getPrice());
        holder.PlaceImage.setImageResource(recentsDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(context, DetailsActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }

    public  static final class RecentsViewsHolder extends RecyclerView.ViewHolder{

        ImageView PlaceImage;
        TextView PlaceName,countryName,price;


        public RecentsViewsHolder(@NonNull View itemView) {
            super(itemView);
            PlaceImage= itemView.findViewById(R.id.place_image);
            PlaceName= itemView.findViewById(R.id.place_name);
            countryName= itemView.findViewById(R.id.country_name);
            price= itemView.findViewById(R.id.price);

        }
    }
}
