package com.example.android.task_two_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("APPLE");
        titles.add("ASUS");
        titles.add("DELL");
        titles.add("HP");
        titles.add("LENEVO");
        titles.add("APPLE");
        titles.add("ASUS");
        titles.add("DELL");
        titles.add("HP");
        titles.add("LENEVO");
        titles.add("APPLE");
        titles.add("ASUS");
        titles.add("DELL");
        titles.add("HP");
        titles.add("LENEVO");
        titles.add("APPLE");
        titles.add("ASUS");
        titles.add("DELL");
        titles.add("HP");
        titles.add("LENEVO");

        images.add(R.drawable.apple);
        images.add(R.drawable.asus);
        images.add(R.drawable.dell);
        images.add(R.drawable.hp);
        images.add(R.drawable.lenovo);
        images.add(R.drawable.apple);
        images.add(R.drawable.asus);
        images.add(R.drawable.dell);
        images.add(R.drawable.hp);
        images.add(R.drawable.lenovo);
        images.add(R.drawable.apple);
        images.add(R.drawable.asus);
        images.add(R.drawable.dell);
        images.add(R.drawable.hp);
        images.add(R.drawable.lenovo);
        images.add(R.drawable.apple);
        images.add(R.drawable.asus);
        images.add(R.drawable.dell);
        images.add(R.drawable.hp);
        images.add(R.drawable.lenovo);


        adapter = new Adapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
            }
}