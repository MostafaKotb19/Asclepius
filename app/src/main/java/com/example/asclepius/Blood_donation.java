package com.example.asclepius;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Blood_donation extends AppCompatActivity {
    Button calc = findViewById(R.id.button28);
    TextView result = findViewById(R.id.textView24);
    RadioButton male = findViewById(R.id.radioButton23);
    RadioButton female = findViewById(R.id.radioButton24);
    CalendarView date = findViewById(R.id.calendarView);
    int finalmonth;
    String finaldate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donation);
        final boolean rmale = male.isChecked();
        final boolean rfemale = female.isChecked();
        if(rmale && rfemale) {
            Toast.makeText(Blood_donation.this, "error in choosing gender", Toast.LENGTH_SHORT).show();
        }
        date = new CalendarView(this);
        date.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, final int year, final int month, final int dayOfMonth) {
                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(rmale && !rfemale){
                            finalmonth = month + 3;
                            finaldate= year + "/" + finalmonth + "/" + dayOfMonth;
                            result.setText(finaldate);
                        }
                        else if(!rmale && rfemale){
                            finalmonth = month + 4;
                            finaldate= year + "/" + finalmonth + "/" + dayOfMonth;
                            result.setText(finaldate);
                        }
                        else if(!rmale && !rfemale) {
                            Toast.makeText(Blood_donation.this, "please select gender", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(Blood_donation.this, "error in choosing gender", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
