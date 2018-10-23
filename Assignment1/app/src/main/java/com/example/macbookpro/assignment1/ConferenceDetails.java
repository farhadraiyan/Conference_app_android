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

public class ConferenceDetails extends BasicActivity {



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
