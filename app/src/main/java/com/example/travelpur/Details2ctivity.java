package com.example.travelpur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Details2ctivity extends AppCompatActivity {
    Button backbutton;
    Button Bookingbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2ctivity);


        backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Back",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });

        Bookingbutton=findViewById(R.id.Move);
        Bookingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Booking proceed",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Details2ctivity.this,bookedActivity.class);
                startActivity(intent);
            }
        });

        TextView text =(TextView)  findViewById(R.id.textView10);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        getSupportActionBar().hide();
    }
}