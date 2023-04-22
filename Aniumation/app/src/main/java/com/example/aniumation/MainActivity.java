package com.example.aniumation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button, button2;
    Animation uptodown, downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imagecar);
        button = findViewById(R.id.up);
        button2 = findViewById(R.id.down);

        uptodown = AnimationUtils.loadAnimation(getApplicationContext()
                , R.anim.upt2down);

        downtoup = AnimationUtils.loadAnimation(getApplicationContext()
                , R.anim.down2up);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(downtoup);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(uptodown);
            }
        });
    }
}