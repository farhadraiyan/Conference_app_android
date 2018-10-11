package com.example.macbookpro.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Activity_GenSchedule extends AppCompatActivity {
    ListView lv_genSchedule;
    List<String> list=new ArrayList<String>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__gen_schedule);

        setContentView(R.layout.activity__gen_schedule);
        lv_genSchedule=(ListView) findViewById(R.id.lv_genSchedule);
        //add items to the list view

        list.add("Conference for javascript programmers");
        list.add("Conference for javascript programmers");
        list.add("Conference for javascript programmers");
        list.add("Conference for javascript programmers");
        list.add("Conference for javascript programmers");
        list.add("Conference for javascript programmers");
        adapter =new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
        lv_genSchedule.setAdapter(adapter);
    }
}
