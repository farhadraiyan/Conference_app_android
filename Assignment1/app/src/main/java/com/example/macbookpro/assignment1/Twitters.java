package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Twitters extends BasicActivity {



    ListView lv_twitters;
    List<String> list=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitters);


        for(int i=1;i<15;i++)
        {
            list.add("Twitters "+i);
        }
        lv_twitters=(ListView) findViewById(R.id.lv_twitters);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv_twitters.setAdapter(adapter);
    }
}
