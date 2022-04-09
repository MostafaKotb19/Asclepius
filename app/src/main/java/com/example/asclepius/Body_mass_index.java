package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Body_mass_index extends AppCompatActivity {
    EditText height = findViewById(R.id.editText6);
    EditText weight = findViewById(R.id.editText7);
    Button calc = findViewById(R.id.button14);
    TextView result = findViewById(R.id.textView11);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_mass_index);
        float height_number = Float.parseFloat(height.getText().toString());
        float weight_number = Float.parseFloat(weight.getText().toString());
        final double bmi = weight_number/(Math.pow(height_number,2));
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText((int) bmi);
            }
        });
    }
}
