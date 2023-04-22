package com.example.trial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView imgClc, imgAge, imgCurr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output();

    }

    private void output() {
        imgClc = findViewById(R.id.imgClc);
        imgAge = findViewById(R.id.imgAge);
        imgCurr = findViewById(R.id.imgCurr);

        imgClc.setOnClickListener(c -> {
            openCalculator();
        });
        imgAge.setOnClickListener(c -> {
            openAge();
        });
        imgCurr.setOnClickListener(c -> {
            openCurrency();
        });

    }

    public void openCalculator() {
        Intent intent = new Intent(this, calculator.class);
        startActivity(intent);
    }

    public void openAge() {
        Intent intent = new Intent(this, Age.class);
        startActivity(intent);
    }
    public void openCurrency() {
        Intent intent = new Intent(this, currency.class);
        startActivity(intent);
    }
}