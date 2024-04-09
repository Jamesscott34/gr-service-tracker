package com.jamesscott.servicetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NewCustomer extends AppCompatActivity {

    private EditText nameEditText, companyEditText, phoneEditText, emailEditText,
            addressEditText, visitsEditText, dateEditText, pricePerQuarterEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newcustomer);

        // Initialize UI elements
        nameEditText = findViewById(R.id.editTextName);
        companyEditText = findViewById(R.id.editTextCompany);
        phoneEditText = findViewById(R.id.editTextPhone);
        emailEditText = findViewById(R.id.editTextEmail);
        addressEditText = findViewById(R.id.editTextAddress);
        visitsEditText = findViewById(R.id.editTextVisits);
        dateEditText = findViewById(R.id.editTextDate);
        pricePerQuarterEditText = findViewById(R.id.editTextPricePerQuarter);

        // Button for adding a new customer
        Button addButton = findViewById(R.id.buttonAdd);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCustomer();
            }
        });

        // Home button
        Button homeButton = findViewById(R.id.buttonHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MainActivity
                Intent intent = new Intent(NewCustomer.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method to save new customer information
    // Method to save new customer information
    // Method to save new customer information
    private void saveCustomer() {
        // Get the text entered by the user
        String name = nameEditText.getText().toString();
        String company = companyEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String address = addressEditText.getText().toString();
        String visits = visitsEditText.getText().toString();
        String date = dateEditText.getText().toString();
        String pricePerQuarter = pricePerQuarterEditText.getText().toString();

        // Check if required fields are filled
        if (company.isEmpty() || address.isEmpty() || email.isEmpty()) {
            Toast.makeText(NewCustomer.this, "Please fill in Company Name, Address, and Email", Toast.LENGTH_SHORT).show();
            return; // Stop execution if required fields are not filled
        }

        // Call method to save the customer information
        long result = new DBHandler(NewCustomer.this).insertContractCustomer(name, address, phone, email,
                company, visits, Double.parseDouble(pricePerQuarter));

        if (result != -1) {
            Toast.makeText(NewCustomer.this, "Customer added successfully", Toast.LENGTH_SHORT).show();
            clearFields();
        } else {
            Toast.makeText(NewCustomer.this, "Failed to add customer", Toast.LENGTH_SHORT).show();
        }
    }


    // Method to clear all EditText fields
    private void clearFields() {
        nameEditText.setText("");
        companyEditText.setText("");
        phoneEditText.setText("");
        emailEditText.setText("");
        addressEditText.setText("");
        visitsEditText.setText("");
        dateEditText.setText("");
        pricePerQuarterEditText.setText("");
    }
}
