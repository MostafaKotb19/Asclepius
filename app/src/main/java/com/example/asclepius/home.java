package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView hi = findViewById(R.id.textView4);
    Button cases = findViewById(R.id.button15);
    Button health_calc = findViewById(R.id.button18);
    Button doctorsD = findViewById(R.id.button16);
    Button hospitalsD = findViewById(R.id.button22);
    Button hospitalsN = findViewById(R.id.button17);
    Button first_aid = findViewById(R.id.button23);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent first = getIntent();
        String tfirst_name = first.getStringExtra("first");
        String t_hi = "Hi," + tfirst_name;
        hi.setText(t_hi);
        cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                casesn();
            }
        });
        health_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                health_calcn();
            }
        });
        doctorsD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doctorsDn();
            }
        });
        hospitalsD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hospitalsDn();
            }
        });
        hospitalsN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hospitalsNn();
            }
        });
        first_aid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_aidn();
            }
        });
    }
    private void casesn(){
        Intent first = new Intent(this, Cases1.class);
        startActivity(first);
    }
    private void health_calcn(){
        Intent second = new Intent(this, health_calculator.class);
        startActivity(second);
    }
    private void doctorsDn(){
        Intent third = new Intent(this, doctors_details.class);
        startActivity(third);
    }
    private void hospitalsDn(){
        Intent fourth = new Intent(this, hospitals_details.class);
        startActivity(fourth);
    }
    private void hospitalsNn(){
        Intent fifth = new Intent(this, nearest_hospital.class);
        startActivity(fifth);
    }
    private void first_aidn(){
        Intent sixth = new Intent(this, first_aid_instructions.class);
        startActivity(sixth);
    }
}
