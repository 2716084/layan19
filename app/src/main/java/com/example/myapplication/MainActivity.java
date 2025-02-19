package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener , CompoundButton.OnCheckedChangeListener {
ImageView image1 ;
ImageView image2;;
private  SeekBar sk;
private int seekBarProgress;
private Switch sw;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @SuppressLint("CutPasteId")
    private void initViews() {
        image1=findViewById(R.id.imageView);
        image2=findViewById(R.id.imageView);
        sw=findViewById(R.id.switch1);
        sk=findViewById(R.id.seekBar);
        sw.setOnCheckedChangeListener(this);


    }



    @Override
    public void onClick(View v) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {




    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            image1.setImageResource(R.drawable.sad);
        }
        else {
            image1.setImageResource(R.drawable.happy);
        }
    }
}