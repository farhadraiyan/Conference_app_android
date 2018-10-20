package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class My_Activity_details extends AppCompatActivity {

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
//    for four activity onclick
    public void speakerActivity(View v)
    {
        Intent i =new Intent(getApplicationContext(), SpeakersActivity.class);
        startActivity(i);
    }
    public void sponsorsActivity(View v)
    {
        Intent i =new Intent(getApplicationContext(), Sponsors.class);
        startActivity(i);
    }
    public void attendeesActivity(View v)
    {
        Intent i =new Intent(getApplicationContext(), AttendeesList.class);
        startActivity(i);
    }
    public void twitterActivity(View v)
    {
        Intent i =new Intent(getApplicationContext(), Twitters.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__details);

        Intent intent =getIntent();
        String texts=intent.getExtras().getString("title");

        TextView title=(TextView) findViewById(R.id.tv_title_detail);
        title.setText(texts);

        TextView desc=(TextView) findViewById(R.id.tv_description);
        desc.setText("Join us at our Downtown Toronto campus for a free evening of learning how to build " +
                "your own " +
                "chatbot (think Microsoft’s clippy or Apple’s Siri)! Led by members of the Lighthouse " +
                "Labs team, come learn the basics of how to use bots and Application Program Interfaces " +
                "(API) with JavaScript. A seamless continuation of our JavaScript Essentials workshop, our " +
                "instructor and mentors will take you through the steps of making a chat application capable " +
                "of answering simple questions.\n" +
                "\n" +
                "If you’ve completed our online JavaScript Essentials course, or attended one of our " +
                "JavaScript workshops, then you’re all set. If not, be sure to check out our free online " +
                "course here to learn the fundamentals of JavaScript before joining us for this workshop. " +
                "Some coding experience is recommended.");


    }
}
