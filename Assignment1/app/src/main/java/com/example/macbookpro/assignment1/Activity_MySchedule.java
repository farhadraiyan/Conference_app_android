package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Activity_MySchedule extends AppCompatActivity {




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
                Intent speak=new Intent(getApplicationContext(), SpeakersActivity.class);
                startActivity(speak);
                return true;
            case R.id.ml_map:
                Intent imap=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=160+kendal+avenue+Toronto"));
                startActivity(imap);
            default:return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__my_schedule);

        LinearLayout l1=(LinearLayout) findViewById(R.id.layh1);
        LinearLayout l2=(LinearLayout) findViewById(R.id.layh2);
        LinearLayout l3=(LinearLayout) findViewById(R.id.layh3);
        LinearLayout l4=(LinearLayout) findViewById(R.id.layh4);
        LinearLayout l5=(LinearLayout) findViewById(R.id.layh5);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i =new Intent(getApplicationContext(), My_Activity_details.class);
                TextView title1=(TextView) findViewById(R.id.tv_title_mysch);
                String title1_str=(String) title1.getText();
                      i.putExtra("title",title1_str);
                        startActivity(i);


            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), My_Activity_details.class);
                TextView title2=(TextView) findViewById(R.id.tv_title_mysch2);
                String title1_str=(String) title2.getText();
                i.putExtra("title",title1_str);
                startActivity(i);


            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), My_Activity_details.class);
                TextView title3=(TextView) findViewById(R.id.tv_title_mysch3);
                String title1_str=(String) title3.getText();
                i.putExtra("title",title1_str);
                startActivity(i);


            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), My_Activity_details.class);
                TextView title4=(TextView) findViewById(R.id.tv_title_mysch4);
                String title1_str=(String) title4.getText();
                i.putExtra("title",title1_str);
                startActivity(i);


            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), My_Activity_details.class);
                TextView title5=(TextView) findViewById(R.id.tv_title_mysch5);
                String title1_str=(String) title5.getText();
                i.putExtra("title",title1_str);
                startActivity(i);


            }
        });




//        lv_mychedule=(ListView) findViewById(R.id.lv_myschedule);
//        list.add("My Workshop\n" +
//                "Date: 27-10-2018\n" +
//                "Time: 10:00am - 12:00pm\n" +
//                "Location: George Brown college, Toronto");
//        list.add("My Workshop\n" +
//                "Date: 27-10-2018\n" +
//                "Time: 10:00am - 12:00pm\n" +
//                "Location: George Brown college, Toronto");
//
//        adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1, list);
//        lv_mychedule.setAdapter(adapter);
    }


}
