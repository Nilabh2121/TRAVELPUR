package com.example.travelpur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bookedActivity extends AppCompatActivity {
    Button homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked21);

        homebutton =findViewById(R.id.homebutton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Travel Again",Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().hide();
    }
}