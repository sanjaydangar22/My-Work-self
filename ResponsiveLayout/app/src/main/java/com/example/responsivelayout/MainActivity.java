package com.example.responsivelayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input  = findViewById(R.id.EmailField);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = input.getText().toString();
                if(Text.isEmpty()) {
                    alert("Enter Credenials First");
                }
                else{
                    alert(Text);
                }
            }
        });
    }
    private void alert(String message){
        final AlertDialog dlg = new AlertDialog.Builder(MainActivity.this)
                .setTitle("You Entered Nothing")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create();
        dlg.show();
    }
}