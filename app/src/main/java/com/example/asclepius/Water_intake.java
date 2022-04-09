package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Water_intake extends AppCompatActivity {
    TextView result = findViewById(R.id.textView26);
    Button calc = findViewById(R.id.button27);
    EditText age = findViewById(R.id.editText13);
    EditText weight = findViewById(R.id.editText24);
    final double[] water = new double[1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_intake);
        final float weight_number = Float.parseFloat(weight.getText().toString());
        float age_number = Float.parseFloat(age.getText().toString());
        if (age_number < 30){
            age_number = 40;
        }
        final float finalAge_number = age_number;
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                water[0] = (weight_number * finalAge_number)/28.3;
                result.setText((int) water[0]);
            }
        });
    }
}
