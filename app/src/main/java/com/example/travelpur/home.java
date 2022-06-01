package com.example.travelpur;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.travelpur.adapter.RecentsAdapter;
import com.example.travelpur.adapter.TopPlacesAdapter;
import com.example.travelpur.model.RecentsData;
import com.example.travelpur.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Taj Mahal", "Agra", "From $200", R.drawable.tajmahal));
        recentsDataList.add(new RecentsData("Kashmir Hills", "Sonmarg", "From $300", R.drawable.kashmirhills));
        recentsDataList.add(new RecentsData("Hawa mahal", "Jaipur", "From $250", R.drawable.hawamahal));
        recentsDataList.add(new RecentsData("Qutub Minar", "Delhi", "From $140", R.drawable.qutubminar1));
        recentsDataList.add(new RecentsData("Naulakha Temple", "Deoghar", "From $100", R.drawable.naulakhatemple));

        setRecentRecycler(recentsDataList);


        List<TopPlacesData> topPlacesDataList= new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("India Gate","Delhi","$130-$250",R.drawable.indiagate));
        topPlacesDataList.add(new TopPlacesData("Golden Temple","Amritsar","$180-$280",R.drawable.goldentemple));
        topPlacesDataList.add(new TopPlacesData("Pushkar","Rajasthan","$300-$400",R.drawable.pushkar));
        topPlacesDataList.add(new TopPlacesData("Ganga River","Prayagraj","$80-$200",R.drawable.gangaprayagraj));
        topPlacesDataList.add(new TopPlacesData("Red Fort","Delhi","$120-$300",R.drawable.redfort));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","Sonmarg","$200-$300",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);

    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(LayoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
        getSupportActionBar().hide();
    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(LayoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
        getSupportActionBar().hide();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
    }
}