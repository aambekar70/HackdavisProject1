package com.example.hackdavis_waterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Third_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__page);

        Intent intent3 = getIntent();

        TextView result = (TextView) findViewById(R.id.result);

        int t = intent3.getIntExtra("total", 0);
        result.setText(t + "");
    }
}
