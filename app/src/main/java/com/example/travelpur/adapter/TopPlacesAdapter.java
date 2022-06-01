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

import com.example.travelpur.Details2ctivity;
import com.example.travelpur.R;
import com.example.travelpur.model.RecentsData;
import com.example.travelpur.model.TopPlacesData;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {
    Context context;
    List<TopPlacesData> topPlacesDataList;

    public TopPlacesAdapter(Context context, List<TopPlacesData> topPlacesDataList) {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item, parent , false);

        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int  position) {
        holder.countryName.setText(topPlacesDataList.get(position).getCountryName());
        holder.PlaceName.setText(topPlacesDataList.get(position).getPlaceName());
        holder.price.setText(topPlacesDataList.get(position).getPrice());
        holder.PlaceImage.setImageResource(topPlacesDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Details2ctivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }

    public  static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{

        ImageView PlaceImage;
        TextView PlaceName,countryName,price;


        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            PlaceImage= itemView.findViewById(R.id.place_image);
            PlaceName= itemView.findViewById(R.id.place_name);
            countryName= itemView.findViewById(R.id.country_name);
            price= itemView.findViewById(R.id.price);

        }
    }
}
