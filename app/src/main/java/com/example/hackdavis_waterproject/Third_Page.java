package com.example.hackdavis_waterproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Third_Page extends AppCompatActivity {

    ImageButton water_droplet_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__page);

        Intent intent3 = getIntent();

        double t = intent3.getDoubleExtra("total", 0);
        double s = intent3.getDoubleExtra("saved", 0);
        int counter = intent3.getIntExtra("counter", 0);

        TextView result = (TextView) findViewById(R.id.result);
        TextView saved_water = (TextView) findViewById(R.id.saved_water);
        TextView sustainable_clothing = (TextView) findViewById(R.id.sustainable_clothing);



        result.setText((int)t + "");
        saved_water.setText((int)s + "");
        sustainable_clothing.setText(counter + "");


        ImageButton water_droplet = (ImageButton) findViewById(R.id.water_droplet);
        ImageButton earth = (ImageButton) findViewById(R.id.earth);
        water_droplet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWaterPage();
            }
        });

        earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEarthPage();
            }
        });



    }

    public void openEarthPage(){
        Intent intent_earth = new Intent(getBaseContext(), Earth_Page.class);
        startActivity(intent_earth);
    }

    public void openWaterPage(){
        Intent intent_water = new Intent(getBaseContext(), Water_Page.class);
        startActivity(intent_water);
    }
}
