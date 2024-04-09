package com.jamesscott.servicetracker;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jamesscott.servicetracker.DBHandler;

public class JobsActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextEmail;
    private EditText editTextAddress;
    private EditText editTextTreatment;
    private EditText editTextDate;
    private EditText editTextPrice;

    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jobs);

        // Initialize EditText views
        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextTreatment = findViewById(R.id.editTextTreatment);
        editTextDate = findViewById(R.id.editTextDate);
        editTextPrice = findViewById(R.id.editTextPrice);

        // Initialize DBHandler
        dbHandler = new DBHandler(this);

        // Button Home
        Button buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity
                Intent intent = new Intent(JobsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Button Add
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve data from EditText fields
                String name = editTextName.getText().toString();
                String phone = editTextPhone.getText().toString();
                String email = editTextEmail.getText().toString();
                String address = editTextAddress.getText().toString();
                String treatment = editTextTreatment.getText().toString();
                String date = editTextDate.getText().toString();
                String price = editTextPrice.getText().toString();

                // Insert data into the database
                long result = insertData(name, phone, email, address, treatment, date, price);
                if (result != -1) {
                    Toast.makeText(JobsActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                    clearFields(); // Clear EditText fields after successful insertion
                } else {
                    Toast.makeText(JobsActivity.this, "Failed to insert data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private long insertData(String name, String phone, String email, String address, String treatment, String date, String price) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_NAME, name);
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_PHONE, phone);
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_EMAIL, email);
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_ADDRESS, address);
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_VISIT_REASON, treatment);
        values.put(DBHandler.JobsCustomersContract.CustomerEntry.COLUMN_PRICE, price);
        long customerId = db.insert(DBHandler.JobsCustomersContract.CustomerEntry.TABLE_NAME, null, values);

        if (customerId != -1) {
            // Insert data into the reports table
            ContentValues reportValues = new ContentValues();
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE, treatment);
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_DATE, date);
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_FINDING, ""); // You can modify this as needed
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION, ""); // You can modify this as needed
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP, ""); // You can modify this as needed
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_MATERIALS, ""); // You can modify this as needed
            reportValues.put(DBHandler.JobsCustomersContract.ReportsEntry.COLUMN_SIGN, ""); // You can modify this as needed

            long result = db.insert(DBHandler.JobsCustomersContract.ReportsEntry.TABLE_NAME, null, reportValues);
            if (result != -1) {
                // Both customer and report data inserted successfully
                return customerId;
            } else {
                // Failed to insert report data, rollback customer insertion
                db.delete(DBHandler.JobsCustomersContract.CustomerEntry.TABLE_NAME,
                        DBHandler.JobsCustomersContract.CustomerEntry._ID + "=?",
                        new String[]{String.valueOf(customerId)});
            }
        }
        // Return -1 if insertion failed
        return -1;
    }

    private void clearFields() {
        editTextName.setText("");
        editTextPhone.setText("");
        editTextEmail.setText("");
        editTextAddress.setText("");
        editTextTreatment.setText("");
        editTextDate.setText("");
        editTextPrice.setText("");
    }
}
