package com.example.aniumation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Aniumation2Activity extends AppCompatActivity {

    TextView txtAns;
    AppCompatButton btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniumation2);
        id();

    }

    private void id() {
        txtAns = findViewById(R.id.txtAns);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);

        btn1.setOnClickListener(a -> {
            txtAns.startAnimation(move);
        });
    }
}