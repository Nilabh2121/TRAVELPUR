package com.example.travelpur;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    Button backbutton;
    private Button move;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Back",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });

        move=findViewById(R.id.Move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Booking proceed",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(DetailsActivity.this,bookedActivity.class);
                startActivity(intent);
            }
        });

        TextView text =(TextView)  findViewById(R.id.textView10);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        getSupportActionBar().hide();
    }
}