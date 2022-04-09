package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.util.Base64Utils;

public class signup extends AppCompatActivity {
    Button user = findViewById(R.id.button3);
    Button doctor = findViewById(R.id.button4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nsignup2();
            }
        });
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nsignup3();
            }
        });
    }
    public void nsignup2(){
        Intent first = new Intent(this, signup2.class);
        startActivity(first);
    }
    public void nsignup3(){
        Intent first = new Intent(this, signup3.class);
        startActivity(first);
    }
}
