package com.example.sanjay;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanjay.ui.main.SectionsPagerAdapter;
import com.example.sanjay.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    TextView tv;


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.c1:
                tv.setText("New group ");
                Toast.makeText(this, "New group", Toast.LENGTH_SHORT).show();
                break;

            case R.id.c2:
                tv.setText("New Broadcast ");
                Toast.makeText(this, "New Broadcast", Toast.LENGTH_SHORT).show();
               break;

            case R.id.c3:
                tv.setText("Linked devices ");
                Toast.makeText(this, "Linked devices", Toast.LENGTH_SHORT).show();
                break;

            case R.id.c4:
                tv.setText("Starred messages");
                Toast.makeText(this, "Starred messages", Toast.LENGTH_SHORT).show();
              break;
            case R.id.c5:
                tv.setText("Payments");
                Toast.makeText(this, "Payments", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c6:
                tv.setText("Settings");
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
               break;

        }
        return super.onOptionsItemSelected(item);
    }

}