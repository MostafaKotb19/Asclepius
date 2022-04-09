package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Body_weight extends AppCompatActivity {
    RadioButton male = findViewById(R.id.radioButton7);
    RadioButton female = findViewById(R.id.radioButton22);
    EditText height = findViewById(R.id.editText25);
    Button calc = findViewById(R.id.button29);
    TextView result= findViewById(R.id.textView31);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight);
        final boolean rmale = male.isChecked();
        final boolean rfemale = female.isChecked();
        if(rmale && rfemale) {
            Toast.makeText(Body_weight.this, "error in choosing", Toast.LENGTH_SHORT).show();
        }
        final float height_number = Float.parseFloat(height.getText().toString());
        final double[] bw = new double[1];
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rmale && !rfemale){
                    bw[0] = 50 + 2.3 * (height_number-152.4)/(2.54);
                    result.setText((int) bw[0]);
                }
                else if(!rmale && rfemale){
                    bw[0] = 45.5 + 2.3 * (height_number-152.4)/(2.54);
                    result.setText((int) bw[0]);
                }
            }
        });
    }
}
