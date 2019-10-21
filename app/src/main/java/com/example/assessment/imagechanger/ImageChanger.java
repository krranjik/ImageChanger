package com.example.assessment.imagechanger;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class ImageChanger extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_changer);

        radioButton1 = findViewById(R.id.rbAn);
        radioButton2 = findViewById(R.id.rbAn2);
        radioButton3 = findViewById(R.id.rbAn3);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbAn :
                imageView.setImageResource(R.drawable.androida);
                break;
            case R.id.rbAn2 :
                imageView.setImageResource(R.drawable.androidb);
                break;
            case R.id.rbAn3 :
                imageView.setImageResource(R.drawable.abdroidc);
                break;
        }
    }
}