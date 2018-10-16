package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class ConferenceDetails extends AppCompatActivity {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conference_details);

        //get all textview
        TextView tvDate=(TextView)  findViewById(R.id.tv_confd_date);
        TextView tvTime=(TextView)  findViewById(R.id.tv_confd_time);
        TextView tvTitle=(TextView)  findViewById(R.id.tv_confd_title);
        TextView tvLocation=(TextView)  findViewById(R.id.tv_confdet_location);
        TextView tvdesc=(TextView)  findViewById(R.id.tv_confdet_descript);
        TextView tvattend=(TextView)  findViewById(R.id.tv_confdet_attendences);

        //get the data from gen schedule
        Intent intent =getIntent();
        String texts=intent.getExtras().getString("data");
        //split the data by line
        helperclass hepler=new helperclass();
        String[] splittedArray=hepler.strSplitter(texts);
        tvDate.setText(splittedArray[0]);
        tvTime.setText(splittedArray[1]);
        tvTitle.setText(splittedArray[2]);
        tvLocation.setText(splittedArray[3]);
        tvdesc.setText(splittedArray[4]);
        tvattend.setText(splittedArray[5]);

    }
}
