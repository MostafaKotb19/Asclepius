package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_calculator extends AppCompatActivity {
    Button body_mass = findViewById(R.id.button11);
    Button calories = findViewById(R.id.button10);
    Button heart_rate = findViewById(R.id.button12);
    Button blood_donation = findViewById(R.id.button8);
    Button water = findViewById(R.id.button9);
    Button ideal_weight = findViewById(R.id.button13);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_calculator);
        body_mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body_massn();
            }
        });
        calories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caloriesn();
            }
        });
        heart_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart_raten();
            }
        });
        blood_donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood_donationn();
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watern();
            }
        });
        ideal_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ideal_weightn();
            }
        });
    }
    private void body_massn(){
        Intent second = new Intent(this, Body_mass_index.class);
        startActivity(second);
    }
    private void caloriesn(){
        Intent second = new Intent(this, Daily_calories_need.class);
        startActivity(second);
    }
    private void heart_raten(){
        Intent second = new Intent(this, Target_heart_rate.class);
        startActivity(second);
    }
    private void blood_donationn(){
        Intent second = new Intent(this, Blood_donation.class);
        startActivity(second);
    }
    private void watern(){
        Intent second = new Intent(this, Water_intake.class);
        startActivity(second);
    }
    private void ideal_weightn(){
        Intent second = new Intent(this, Body_weight.class);
        startActivity(second);
    }
}
