package com.example.hackdavis_waterproject;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.john.waveview.WaveView;


public class Water_Page extends AppCompatActivity {
    private SeekBar seekbar;
    private WaveView waveView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        float x = 1;

        Intent water_Intent = getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water__page);


        seekbar = (SeekBar)findViewById(R.id.seekbar_id);
        waveView = (WaveView) findViewById(R.id.wave_view);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                waveView.setProgress(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }
}