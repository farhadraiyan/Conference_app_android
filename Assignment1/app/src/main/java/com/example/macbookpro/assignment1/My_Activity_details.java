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

public class My_Activity_details extends BasicActivity {


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
