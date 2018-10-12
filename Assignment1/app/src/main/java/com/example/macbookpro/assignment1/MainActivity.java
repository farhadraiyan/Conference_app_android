package com.example.macbookpro.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //this method to go to reset password activity
    public void resetPassword(View view)
    {
        Intent i =new Intent(getApplicationContext(), Activity_resetPassword.class);
        startActivity(i);
    }
    //this method for myschedule activity
    public void mySchedule(View view)
    {
        Intent i=new Intent(getApplicationContext(), Activity_MySchedule.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image view
        ImageView imageV=findViewById(R.id.imgV_logo);
        imageV.setImageResource(R.drawable.conference);
    }


}
