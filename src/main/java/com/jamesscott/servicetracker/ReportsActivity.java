package com.jamesscott.servicetracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReportsActivity extends AppCompatActivity {

    private EditText editTextCustomer, editTextCompany, editTextDate, editTextVisitPurpose,
            editTextFindings, editTextRecommendations, editTextFollowUp, editTextMaterialsUsed, editTextSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reports);

        // Initialize UI elements
        editTextCustomer = findViewById(R.id.editTextCustomer);
        editTextCompany = findViewById(R.id.editTextCompany);
        editTextDate = findViewById(R.id.editTextDate);
        editTextVisitPurpose = findViewById(R.id.editTextVisitPurpose);
        editTextFindings = findViewById(R.id.editTextFindings);
        editTextRecommendations = findViewById(R.id.editTextRecommendations);
        editTextFollowUp = findViewById(R.id.editTextFollowUp);
        editTextMaterialsUsed = findViewById(R.id.editTextMaterialsUsed);
        editTextSign = findViewById(R.id.editTextSign);

        // Button Home
        Button buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity
                Intent intent = new Intent(ReportsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // Button Add
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click to perform an action
                saveReport(); // Call method to save the report data
            }
        });
    }

    // Method to save report data
    private void saveReport() {
        // Retrieve data from EditText fields
        // Retrieve data from EditText fields
        String customer = editTextCustomer.getText().toString();
        String company = editTextCompany.getText().toString();
        String visitPurpose = editTextVisitPurpose.getText().toString();
        String date = editTextDate.getText().toString();
        String finding = editTextFindings.getText().toString();
        String recommendation = editTextRecommendations.getText().toString();
        String followUp = editTextFollowUp.getText().toString();
        String materials = editTextMaterialsUsed.getText().toString();
        String sign = editTextSign.getText().toString();

        // Insert data into the database
        long result = insertReport(customer, date, visitPurpose, finding, recommendation, followUp, materials, sign);

        // Clear fields after insertion
        clearFields();

        // Show toast message based on insertion result
        if (result != -1) {
            Toast.makeText(this, "Report Data Saved", Toast.LENGTH_SHORT).show();
            clearFields();
        } else {
            Toast.makeText(this, "Failed to Save Report Data", Toast.LENGTH_SHORT).show();
        }
    }

    // Method to insert report into the database
    private long insertReport(String customer, String date, String visitPurpose, String findings, String recommendations,
                              String followUp, String materialsUsed, String sign) {
        // Get instance of database handler
        DBHandler dbHandler = new DBHandler(this);

        // Retrieve the customer ID based on the customer name
        long customerId = dbHandler.getCustomerIdByName(customer);
        if (customerId != -1) {
            // Insert report data into the database
            return dbHandler.insertContractCustomerReport(customerId, visitPurpose, date, findings, recommendations, followUp, materialsUsed, sign);
        } else {
            // Handle case where customer ID is not found
            return -1; // Return -1 to indicate failure
        }
    }

    // Method to clear EditText fields
    private void clearFields() {
        editTextCustomer.setText("");
        editTextCompany.setText("");
        editTextDate.setText("");
        editTextVisitPurpose.setText("");
        editTextFindings.setText("");
        editTextRecommendations.setText("");
        editTextFollowUp.setText("");
        editTextMaterialsUsed.setText("");
        editTextSign.setText("");
    }
}
