package com.example.iguest.quizdroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Questions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        // get data that was passed from first activity
        Intent launch = getIntent();
        String topic = launch.getStringExtra("topic");



        /*Intent nextActivity = new Intent(MainActivity.this, Overview.class); // cannot use just this cuz this refers to the listener, not the outer this

        // add data to be passed to next activity
        nextActivity.putExtra("topic", "Marvel Super Heroes");


        if (nextActivity.resolveActivity(getPackageManager()) != null) {
            startActivity(nextActivity); // opens a new activity
        }
        // code still runs asynchronously

        finish(); // kill this instance self (this activity)*/
    }
}
