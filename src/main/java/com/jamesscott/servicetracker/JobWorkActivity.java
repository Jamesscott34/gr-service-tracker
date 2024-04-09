package com.jamesscott.servicetracker;



import com.jamesscott.servicetracker.R;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

import androidx.appcompat.app.AppCompatActivity;

public class JobWorkActivity extends AppCompatActivity {

    private EditText editTextCustomer1;
    private EditText editTextDate1;
    private EditText editTextVisitPurpose1;
    private EditText editTextFindings1;
    private EditText editTextRecommendations1;
    private EditText editTextFollowUp1;
    private EditText editTextMaterialsUsed1;
    private EditText editTextSign1;

    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jobwork); // Change the layout to match JobsActivity

        // Initialize EditText views
        editTextCustomer1 = findViewById(R.id.editTextCustomer1);
        editTextDate1 = findViewById(R.id.editTextDate1);
        editTextVisitPurpose1 = findViewById(R.id.editTextVisitPurpose1);
        editTextFindings1 = findViewById(R.id.editTextFindings1);
        editTextRecommendations1 = findViewById(R.id.editTextRecommendations1);
        editTextFollowUp1 = findViewById(R.id.editTextFollowUp1);
        editTextMaterialsUsed1 = findViewById(R.id.editTextMaterialsUsed1);
        editTextSign1 = findViewById(R.id.editTextSign1);
        // Initialize DBHandler
        dbHandler = new DBHandler(this);

        // Home button
        Button homeButton = findViewById(R.id.buttonHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity
                Intent intent = new Intent(JobWorkActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Add button
        Button addButton = findViewById(R.id.buttonAdd);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve data from EditText fields
                String customer = editTextCustomer1.getText().toString();
                String date = editTextDate1.getText().toString();
                String visitPurpose = editTextVisitPurpose1.getText().toString();
                String findings = editTextFindings1.getText().toString();
                String recommendations = editTextRecommendations1.getText().toString();
                String followUp = editTextFollowUp1.getText().toString();
                String materialsUsed = editTextMaterialsUsed1.getText().toString();
                String sign = editTextSign1.getText().toString();

                // Save data to the reports table
                long result = insertData(customer, date, visitPurpose, findings, recommendations, followUp, materialsUsed, sign);
                if (result != -1) {
                    Toast.makeText(JobWorkActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                    clearFields(); // Clear EditText fields after successful insertion
                } else {
                    Toast.makeText(JobWorkActivity.this, "Failed to insert data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private long insertData(String customer, String date, String visitPurpose, String findings, String recommendations, String followUp, String materialsUsed, String sign) {
        // Insert data into the database
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_CUSTOMER_NAME, customer);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_DATE, date);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE, visitPurpose);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_FINDING, findings);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION, recommendations);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP, followUp);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_MATERIALS, materialsUsed);
        values.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_SIGN, sign);
        return db.insert(DBHandler.JobsCustomersContract.ReportsEntry.TABLE_NAME, null, values);
    }

    private void clearFields() {
        // Clear EditText fields
        editTextCustomer1.setText("");
        editTextDate1.setText("");
        editTextVisitPurpose1.setText("");
        editTextFindings1.setText("");
        editTextRecommendations1.setText("");
        editTextFollowUp1.setText("");
        editTextMaterialsUsed1.setText("");
        editTextSign1.setText("");
    }
}
