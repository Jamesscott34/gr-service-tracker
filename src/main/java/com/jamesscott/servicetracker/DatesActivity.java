package com.jamesscott.servicetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dates);

        // Initialize UI elements
        TextView textViewDates = findViewById(R.id.textViewDates);
        Spinner spinnerCustomer = findViewById(R.id.spinnerCustomer);
        EditText editTextNextVisitDate = findViewById(R.id.editTextNextVisitDate);
        EditText editTextAddress = findViewById(R.id.editTextAddress);

        // Button Home
        Button buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
