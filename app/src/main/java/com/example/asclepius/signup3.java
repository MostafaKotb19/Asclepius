package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class signup3 extends AppCompatActivity {
    Button signup = findViewById(R.id.button6);
    EditText first_name = findViewById(R.id.editText15);
    public final String tfirst_name2 = first_name.getText().toString();
    EditText last_name = findViewById(R.id.editText17);
    public final String tlast_name2 = last_name.getText().toString();
    EditText age = findViewById(R.id.editText19);
    public final String tage2 = age.getText().toString();
    EditText password = findViewById(R.id.editText20);
    public final String tpassword2 = password.getText().toString();
    EditText c_password = findViewById(R.id.editText22);
    public final String tc_password2 = c_password.getText().toString();
    EditText e_mail = findViewById(R.id.editText21);
    public final String te_mail2 = e_mail.getText().toString();
    EditText majority = findViewById(R.id.editText23);
    public final String tmajority = majority.getText().toString();
    RadioButton male = findViewById(R.id.radioButton3);
    public final boolean rmale2 = male.isChecked();
    RadioButton female = findViewById(R.id.radioButton4);
    public final boolean rfemale2 = female.isChecked();
    RadioButton expert = findViewById(R.id.radioButton8);
    public final boolean rexpert = expert.isChecked();
    RadioButton fresh = findViewById(R.id.radioButton9);
    public final boolean rfresh = fresh.isChecked();
    RadioButton student = findViewById(R.id.radioButton10);
    public final boolean rstudent = student.isChecked();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);
        setContentView(R.layout.activity_signup2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nHome();
            }
        });
    }
    public void nHome(){
        Intent first = new Intent(this, home.class);
        startActivity(first);
    }
}
