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

public class Activity_GenSchedule extends AppCompatActivity {

    //this function for menu list in main activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.schedule_menu,menu);
        return true;
    }

    //this method to make my menu item interactive

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.ml_mySchedule:
                Intent i =new Intent(getApplicationContext(), Activity_MySchedule.class);
                startActivity(i);
                return true;
            case R.id.ml_generalSchedule:
                Intent igen=new Intent(getApplicationContext(), Activity_GenSchedule.class);
                startActivity(igen);
                return true;
            case R.id.ml_attendees:
                Intent iAttn=new Intent(getApplicationContext(), AttendeesList.class);
                startActivity(iAttn);
                return true;
            case R.id.ml_Twitters:
                Intent itwt=new Intent(getApplicationContext(), Twitters.class);
                startActivity(itwt);
                return true;
            case R.id.ml_speakers:
                Intent speak=new Intent(getApplicationContext(), Activity_Speakers.class);
                startActivity(speak);
                return true;
            case R.id.ml_map:
                Intent imap=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=160+kendal+avenue+Toronto"));
                startActivity(imap);
            default:return super.onOptionsItemSelected(item);

        }
    }


    ListView lv_genSchedule;
    List<String> list=new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__gen_schedule);
        lv_genSchedule=(ListView) findViewById(R.id.lv_genSchedule);
        //add items to the list view
        list.add("Node.js and angular workshop\n" +
                "Date: 27-10-2018\n" +
                "Time: 10:00am - 12:00pm\n" +
                "Location: George Brown college, Toronto");
        list.add("Data structure and algorithms workshop\n" +
                "Date: 11-11-2018\n" +
                "Time: 9:00 - 11:00am\n" +
                "Location: George Brown college, Toronto");
        list.add("PHP workshop for advance programmers\n" +
                "Date: 21-11-2018\n" +
                "Time: 10:00 am - 2:00pm\n" +
                "Location: York conference hall, York");
        list.add("Android app developments \n" +
                "Date: 29-11-2018" +
                "Time: 5:00 pm - 8:00pm\n" +
                "Location: Centre for IT, Toronto");
        list.add("Javascript workshop for Beginners\n" +
                "Date: 13-12-2018\n" +
                "Time: 9:00 am - 11:00am\n" +
                "Location: Scarborough IT centre, Scarborough");
        list.add("Data structure and algorithms workshop\n" +
                "Date: 15-01-2019\n" +
                "Time: 5:00 pm - 7:00mm\n" +
                "Location: Scarborough IT centre, Scarborough");
        list.add("Python workshop for advance programmer\n" +
                "Date: 29-01-2019\n" +
                "Time: 5:00 pm - 7:00mm\n" +
                "Location: Centre for It, Toronto");
        list.add("Machine Learning \n" +
                "Date: 29-02-2019\n" +
                "Time: 3:00 pm - 7:00mm\n" +
                "Location: Centre for It, Toronto");

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
