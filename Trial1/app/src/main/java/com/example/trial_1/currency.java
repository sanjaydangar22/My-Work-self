package com.example.trial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class currency extends AppCompatActivity {

    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency);
button();

        final TextView txt =(TextView) findViewById(R.id.a);
        final EditText input =(EditText) findViewById(R.id.i);
        final Button btn =(Button) findViewById(R.id.b);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(input.getText().toString());
                amount = amount*75;
                txt.setText(amount+"");
            }
        });
    }

    private void button() {
        imgBack= findViewById(R.id.imgBack);

        imgBack.setOnClickListener(b -> {
            back();
        });
    }

    public void back() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}