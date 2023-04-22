package com.buttonui.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] name = {"volkswgon","Audi","BMD","Lamborghini"};
    private  int[] images ={R.drawable.logo,R.drawable.logo1,R.drawable.logo2,R.drawable.logo3};

    private List<persons> personsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvw);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        preparethelist();
        RecylerAdapter adapter =new RecylerAdapter(personsList);
        recyclerView.setAdapter(adapter);
    }
    private  void  preparethelist(){
        int count =0;
        for(String name : name){
            persons person = new persons(name,images[count]);
            personsList.add(person);
            count++;
        }

    }
}