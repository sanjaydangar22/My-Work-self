package com.example.manu_sub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.i1:
                tv.setText("Data Structure ");
                Toast.makeText(this, "Data structure", Toast.LENGTH_SHORT).show();
                break;

            case R.id.i2:
                tv.setText("Oprating System ");
                Toast.makeText(this, "Oprating system", Toast.LENGTH_SHORT).show();
                break;

            case R.id.i3:
            tv.setText("Algebra ");
            Toast.makeText(this, "Algebra", Toast.LENGTH_SHORT).show();
            break;

            case R.id.i4:
            tv.setText("Trig");
            Toast.makeText(this, "Tring", Toast.LENGTH_SHORT).show();
            break;

        }
        return super.onOptionsItemSelected(item);
    }
}