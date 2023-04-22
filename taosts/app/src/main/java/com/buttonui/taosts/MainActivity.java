package com.buttonui.taosts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showmse(View v){
        StyleableToast.makeText(this,"this is custom toast",R.style.exm).show();
    }
}