package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_resetPassword extends AppCompatActivity {

    public  void mySchedule(View view)
    {
        Intent i =new Intent(getApplicationContext(), Activity_MySchedule.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }
}
