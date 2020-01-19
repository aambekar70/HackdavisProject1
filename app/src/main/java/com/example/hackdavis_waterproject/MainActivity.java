package com.example.hackdavis_waterproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondPage();
            }
        });
    }

    public void openSecondPage(){
        EditText pants = (EditText) findViewById(R.id.pants);
        EditText shirts = (EditText) findViewById(R.id.shirts);
        EditText dresses = (EditText) findViewById(R.id.dresses);
        EditText skirts = (EditText) findViewById(R.id.jackets);

        int num1 = Integer.parseInt(pants.getText().toString());
        int num2 = Integer.parseInt(shirts.getText().toString());
        int num3 = Integer.parseInt(dresses.getText().toString());
        int num4 = Integer.parseInt(skirts.getText().toString());


        int clothes[] = {num1, num2, num3, num4};

        Intent intent = new Intent(getBaseContext(), Second_Page.class);
        intent.putExtra("clothes", clothes);

        startActivity(intent);
    }

}
