package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Activity_MySchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__my_schedule);
    }

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
            case R.id.ml_speakers:
                return true;
            case R.id.ml_map:
                Intent imap=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=160+kendal+avenue+Toronto"));
                startActivity(imap);
            default:return super.onOptionsItemSelected(item);

        }
    }
}
