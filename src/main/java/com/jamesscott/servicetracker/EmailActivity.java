package com.jamesscott.servicetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {

    private EditText editTextAddEmail;
    private EditText editTextSendFrom;
    private Spinner spinnerCustomer;
    private Spinner spinnerEmail;
    private Spinner spinnerReports;
    private Button buttonSend;
    private Button buttonCancel;
    private Button buttonHome;
    private Button buttonReports;
    private Button buttonNew;
    private EmailHandler emailHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);

        // Initialize all the views
        editTextAddEmail = findViewById(R.id.editTextAddEmail);
        editTextSendFrom = findViewById(R.id.editTextSendFrom);
        spinnerCustomer = findViewById(R.id.spinnerCustomer);
        spinnerEmail = findViewById(R.id.spinnerEmail);
        spinnerReports = findViewById(R.id.spinnerReports);
        buttonSend = findViewById(R.id.buttonSend);
        buttonCancel = findViewById(R.id.buttonCancel);
        buttonHome = findViewById(R.id.buttonHome);



        // Initialize EmailHandler
        emailHandler = new EmailHandler(this);

        // Set click listener for the "Send" button
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipientEmail = editTextAddEmail.getText().toString();
                String senderEmail = editTextSendFrom.getText().toString();
                String subject = "Your Subject Here";
                String body = "Your Email Body Here";
                emailHandler.sendEmail(new String[]{recipientEmail}, subject, body);
            }
        });

        // Set click listener for the "Cancel" button
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the cancel action here
            }
        });

        // Set click listener for the "Home" button
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
