package com.jamesscott.servicetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {

    private DBHandler dbHandler; // Declare DBHandler instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcustomer);

        // Initialize DBHandler
        dbHandler = new DBHandler(this);

        // Initialize UI elements
        Spinner spinnerContractCustomers = findViewById(R.id.spinnerContractCustomers);
        Spinner spinnerContractReports = findViewById(R.id.spinnerContractReports);
        Spinner spinnerJobs = findViewById(R.id.spinnerJobs);
        Spinner spinnerJobReports = findViewById(R.id.spinnerJobsReport); // Adjusted line

// Populate spinners with data from the database
        populateContractCustomersSpinner(spinnerContractCustomers);
        populateReportsSpinner(spinnerContractReports);
        populateJobsCustomersSpinner(spinnerJobs); // Adjusted method name
        populateJobReportsSpinner(spinnerJobReports); // Add this line

        Button homeButton = findViewById(R.id.buttonHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity
                Intent intent = new Intent(ViewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void populateJobsCustomersSpinner(Spinner spinnerJobs) {
        // Retrieve job customers from the database
        ArrayList<String> jobCustomersList = dbHandler.getAllJobs();

        // Create ArrayAdapter and set it to the spinner
        ArrayAdapter<String> customersAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, jobCustomersList);
        spinnerJobs.setAdapter(customersAdapter); // Corrected line
    }


    // Method to populate the contract customers spinner
    private void populateContractCustomersSpinner(Spinner spinnerCustomers) {
        // Retrieve contract customers from the database
        ArrayList<String> contractCustomersList = dbHandler.getAllContracts();

        // Create ArrayAdapter and set it to the spinner
        ArrayAdapter<String> customersAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, contractCustomersList);
        spinnerCustomers.setAdapter(customersAdapter);
    }



    // Method to populate the reports spinner
    private void populateReportsSpinner(Spinner spinnerReports) {
        // Retrieve reports from the database
        ArrayList<String> reportsList = dbHandler.getAllReports();

        // Create ArrayAdapter and set it to the spinner
        ArrayAdapter<String> reportsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, reportsList);
        spinnerReports.setAdapter(reportsAdapter);
    }

    // Method to populate the job reports spinner
    private void populateJobReportsSpinner(Spinner spinnerJobReports) {
        // Retrieve job reports from the database
        ArrayList<String> jobReportsList = dbHandler.getAllJobReports();

        // Create ArrayAdapter and set it to the spinner
        ArrayAdapter<String> jobReportsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, jobReportsList);
        spinnerJobReports.setAdapter(jobReportsAdapter);
    }
}
