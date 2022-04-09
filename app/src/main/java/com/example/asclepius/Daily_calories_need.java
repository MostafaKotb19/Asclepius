package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Daily_calories_need extends AppCompatActivity {
    Button calc = findViewById(R.id.button26);
    EditText height = findViewById(R.id.editText4);
    EditText weight = findViewById(R.id.editText18);
    EditText age = findViewById(R.id.editText16);
    RadioButton male = findViewById(R.id.radioButton12);
    RadioButton female = findViewById(R.id.radioButton13);
    RadioButton sedentary = findViewById(R.id.radioButton14);
    RadioButton active = findViewById(R.id.radioButton17);
    RadioButton exactive = findViewById(R.id.radioButton18);
    RadioButton vractive = findViewById(R.id.radioButton19);
    RadioButton light = findViewById(R.id.radioButton15);
    RadioButton moderate = findViewById(R.id.radioButton16);
    TextView result = findViewById(R.id.textView23);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_calories_need);
        final boolean rmale = male.isChecked();
        final boolean rfemale = female.isChecked();
        final boolean rsedentary = sedentary.isChecked();
        final boolean ractive = active.isChecked();
        final boolean rexactive = exactive.isChecked();
        final boolean rvractive = vractive.isChecked();
        final boolean rlight = light.isChecked();
        final boolean rmoderate = moderate.isChecked();
        if(rmale && rfemale) {
            Toast.makeText(Daily_calories_need.this, "error in choosing gender", Toast.LENGTH_SHORT).show();
        }
        float height_number = Float.parseFloat(height.getText().toString());
        float weight_number = Float.parseFloat(weight.getText().toString());
        float age_number = Float.parseFloat(age.getText().toString());
        double bmr = 0;
        final double[] calories = new double[1];
        if (rmale && !rfemale){
            bmr = (10*weight_number) + (6.25*height_number) - (5*age_number) + 5;
        }
        else if (!rmale && rfemale){
            bmr = (10*weight_number) + (6.25*height_number) - (5*age_number) - 161;
        }
        final double finalBmr = bmr;
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rsedentary){
                    calories[0] = finalBmr * 1.2;
                    result.setText((int) calories[0]);
                }
                else if (rlight){
                    calories[0] = finalBmr * 1.375;
                    result.setText((int) calories[0]);
                }
                else if (rmoderate){
                    calories[0] = finalBmr * 1.465;
                    result.setText((int) calories[0]);
                }
                else if (ractive){
                    calories[0] = finalBmr * 1.55;
                    result.setText((int) calories[0]);
                }
                else if (rvractive){
                    calories[0] = finalBmr * 1.725;
                    result.setText((int) calories[0]);
                }
                else if (rexactive){
                    calories[0] = finalBmr * 1.9;
                    result.setText((int) calories[0]);
                }
                else if (!rsedentary && !rlight && !rmoderate && !ractive && !rvractive &&!rexactive){
                    Toast.makeText(Daily_calories_need.this, "please select activity level", Toast.LENGTH_SHORT).show();
                }
                if(!rmale && !rfemale) {
                    Toast.makeText(Daily_calories_need.this, "please select gender", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
