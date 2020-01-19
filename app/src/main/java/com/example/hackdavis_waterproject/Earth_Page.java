package com.example.hackdavis_waterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Earth_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth__page);

        TextView resource = (TextView) findViewById(R.id.resource);

        resource.setText("https://www.thredup.com/fashionfootprint/");
    }
}
