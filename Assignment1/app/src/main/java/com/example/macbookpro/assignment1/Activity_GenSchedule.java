package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Activity_GenSchedule extends BasicActivity {




    ListView lv_genSchedule;
    List<String> list=new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__gen_schedule);
        lv_genSchedule=(ListView) findViewById(R.id.lv_genSchedule);
        //add items to the list view
        list.add("Date: 27-10-2018\n" +
                "Time: 10:00am - 12:00pm\n" +
                "Node.js and angular workshop\n" +
                "Location: George Brown college, Toronto\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 11-11-2018\n" +
                "Time: 9:00 - 11:00am\n" +
                "Data structure and algorithms workshop\n" +
                "Location: George Brown college, Toronto\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 21-11-2018\n" +
                "Time: 10:00 am - 2:00pm\n" +
                "PHP workshop for advance programmers\n" +
                "Location: York conference hall, York\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 29-11-2018" +
                "Time: 5:00 pm - 8:00pm\n" +
                "Android app developments \n" +
                "Location: Centre for IT, Toronto\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 13-12-2018\n" +
                "Time: 9:00 am - 11:00am\n" +
                "Javascript workshop for Beginners\n" +
                "Location: Scarborough IT centre, Scarborough\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 15-01-2019\n" +
                "Time: 5:00 pm - 7:00mm\n" +
                "Data structure and algorithms workshop\n" +
                "Location: Scarborough IT centre, Scarborough\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 29-01-2019\n" +
                "Time: 5:00 pm - 7:00mm\n" +
                "Python workshop for advance programmer\n" +
                "Location: Centre for It, Toronto\n"+
                "Description: \n"+
                "Attendences:");
        list.add("Date: 29-02-2019\n" +
                "Time: 3:00 pm - 7:00mm\n" +
                "Machine Learning \n" +
                "Location: Centre for It, Toronto\n"+
                "Description: \n"+
                "Attendences:");

        adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1, list);
        lv_genSchedule.setAdapter(adapter);
        //to make each list item interactive to send another activity

        lv_genSchedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String listViewVal=list.get(position);

                    Intent myIntent = new Intent(view.getContext(), ConferenceDetails.class);
                    myIntent.putExtra("data", listViewVal);
                    startActivityForResult(myIntent, 0);

            }
        });


    }
}
