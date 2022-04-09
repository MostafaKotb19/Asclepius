package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Target_heart_rate extends AppCompatActivity {
    Button calc = findViewById(R.id.button7);
    TextView result = findViewById(R.id.textView20);
    RadioButton little = findViewById(R.id.radioButton11);
    RadioButton moderate = findViewById(R.id.radioButton20);
    RadioButton intense = findViewById(R.id.radioButton21);
    EditText age = findViewById(R.id.editText12);
    EditText rhr = findViewById(R.id.editText14);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_heart_rate);
        final float rhr_number = Float.parseFloat(rhr.getText().toString());
        final float age_number = Float.parseFloat(age.getText().toString());
        final boolean rlittle = little.isChecked();
        final boolean rmoderate = moderate.isChecked();
        final boolean rintense = intense.isChecked();
        final double[] thr = new double[1];
        if(rlittle && rmoderate && rintense) {
            Toast.makeText(Target_heart_rate.this, "error in choosing workout intensity", Toast.LENGTH_SHORT).show();
        }
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rlittle && !rmoderate && !rintense){
                    thr[0]=((207- (age_number * 0.5) - rhr_number) * 0.5) + rhr_number;
                    result.setText((int) thr[0]);
                }
                else if(!rlittle && rmoderate && !rintense){
                    thr[0]=((207- (age_number * 0.7) - rhr_number) * 0.5) + rhr_number;
                    result.setText((int) thr[0]);
                }
                else if(!rlittle && !rmoderate && rintense){
                    thr[0]=((207- (age_number * 0.85) - rhr_number) * 0.5) + rhr_number;
                    result.setText((int) thr[0]);
                }
                else if(!rlittle && !rmoderate && !rintense) {
                    Toast.makeText(Target_heart_rate.this, "please choose workout intensity", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
