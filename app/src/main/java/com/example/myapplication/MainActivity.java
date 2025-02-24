package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener {
    ImageView image1;
    private SeekBar sk;
    private Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @SuppressLint("CutPasteId")
    private void initViews() {
        image1 = findViewById(R.id.imageView);
        sw = findViewById(R.id.switch1);
        sk = findViewById(R.id.seekBar);

        sw.setOnCheckedChangeListener(this);
        sk.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        float translationX = progress * 2;
        image1.setTranslationX(translationX);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            image1.setImageResource(R.drawable.sad);
        } else {
            image1.setImageResource(R.drawable.happy);
        }
    }
}
