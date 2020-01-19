package com.example.hackdavis_waterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__page);

        Button second_button = (Button) findViewById(R.id.second_button);
        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity();
            }
        });


    }

    public void openThirdActivity(){
        int shirts_water = 713;
        int dresses_water = 1854;
        int pants_water = 2140;
        int skirts_water = 1310;

        Intent intent = getIntent();
        int[] clothes = intent.getIntArrayExtra("clothes");

        EditText shirts_time = (EditText) findViewById(R.id.shirts_time);
        EditText skirts_time = (EditText) findViewById((R.id.skirts_time));
        EditText pants_time = (EditText) findViewById((R.id.pants_time));
        EditText dresses_time = (EditText) findViewById(R.id.dresses_time);

        int p_time = Integer.parseInt(pants_time.getText().toString());
        int pants = clothes[0];
        int sh_time = Integer.parseInt(shirts_time.getText().toString());
        int shirts = clothes[1];
        int d_time = Integer.parseInt(dresses_time.getText().toString());
        int dresses = clothes[2];
        int sk_time = Integer.parseInt(skirts_time.getText().toString());
        int skirts = clothes[3];

        Intent intent2 = new Intent(Second_Page.this, Third_Page.class);

        int counter = 0;
        double total = (pants*pants_water) + (shirts*shirts_water) + (dresses*dresses_water) + (skirts*skirts_water);
        double expected, saved;
        expected = ((pants/3)*p_time*pants_water)+ ((shirts/3)*sh_time*shirts_water) + ((skirts/3)*sk_time*skirts_water) + ((dresses/3)*d_time*dresses_water);
        saved = expected - total;
        if(saved < 0){
            saved = 0;
        }

        if(p_time <= 3){
            counter++;
        }
        if(sh_time <= 3){
            counter++;
        }
        if(d_time <= 3){
            counter++;
        }
        if(sk_time <= 3){
            counter++;
        }

        intent2.putExtra("total", total);
        intent2.putExtra("saved", saved);
        intent2.putExtra("counter", counter);


        startActivity(intent2);

    }
}
