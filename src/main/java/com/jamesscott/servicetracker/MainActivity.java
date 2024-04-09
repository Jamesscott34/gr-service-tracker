package com.jamesscott.servicetracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        // Find buttons by their IDs
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonDates = findViewById(R.id.buttonDates);
        Button buttonView = findViewById(R.id.buttonVisit);
        Button buttonReports = findViewById(R.id.buttonReports);
        Button buttonEmail = findViewById(R.id.buttonEmail);
        Button buttonJobs = findViewById(R.id.buttonJobs);
        Button buttonJobsCustomer = findViewById(R.id.buttonJobsCustomer);
        Button buttonWorkList = findViewById(R.id.buttonWorkList);


        // Set onClick listeners for each button
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the NewCustomerActivity
                startActivity(new Intent(MainActivity.this, NewCustomer.class));
            }
        });

        buttonDates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the DatesActivity
                startActivity(new Intent(MainActivity.this, DatesActivity.class));
            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the ViewActivity
                startActivity(new Intent(MainActivity.this, ViewActivity.class));
            }
        });

        buttonReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the ReportsActivity
                startActivity(new Intent(MainActivity.this, ReportsActivity.class));
            }
        });

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the DatesActivity
                startActivity(new Intent(MainActivity.this, EmailActivity.class));
            }
        });

        buttonJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the DatesActivity
                startActivity(new Intent(MainActivity.this, JobsActivity.class));
            }
        });

        buttonJobsCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the DatesActivity
                startActivity(new Intent(MainActivity.this, JobWorkActivity.class));
            }
        });

        buttonWorkList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the DatesActivity
                startActivity(new Intent(MainActivity.this, WorkListActivity.class));
            }
        });
    }
}
