package com.ex.cardviewusingrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList
        ArrayList personname = new ArrayList<>(Arrays.asList("Gruha","Aditya","Rahul","Neelima","Divya"));
        ArrayList studentname = new ArrayList<>(Arrays.asList("Pawan","Sai","Satyasai","Rama","Venu"));
        ArrayList qulification = new ArrayList<>(Arrays.asList("B.tch","B.sc","B.sc","B.sc","B.sc"));
        ArrayList mobile = new ArrayList<>(Arrays.asList("9874561230","9875641230","8794561230","9654781230","9440123478"));
        ArrayList enquridate = new ArrayList<>(Arrays.asList("2019-07-15","2019-07-10","2019-07-05","2019-07-05","2019-07-05"));
        ArrayList nfd = new ArrayList<>(Arrays.asList("2019-07-15","2019-07-10","2019-07-05","2019-07-05","2019-07-05"));
        ArrayList course = new ArrayList<>(Arrays.asList("Php","Java","Android","Word press","SEO"));

        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,personname,studentname,qulification,mobile,
                                                        enquridate,nfd,course);
        recyclerView.setAdapter(customAdapter);

    }
}
