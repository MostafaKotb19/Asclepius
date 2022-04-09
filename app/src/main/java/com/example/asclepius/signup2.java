package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class signup2 extends AppCompatActivity {
    Button signup = findViewById(R.id.button5);
    EditText first_name = findViewById(R.id.editText3);
    public final String tfirst_name = first_name.getText().toString();
    EditText last_name = findViewById(R.id.editText5);
    public String tlast_name = last_name.getText().toString();
    EditText age = findViewById(R.id.editText8);
    public String tage = age.getText().toString();
    EditText password = findViewById(R.id.editText9);
    public String tpassword = password.getText().toString();
    EditText c_password = findViewById(R.id.editText11);
    public String tc_password_ = c_password.getText().toString();
    EditText e_mail = findViewById(R.id.editText10);
    public String te_mail = e_mail.getText().toString();
    RadioButton male = findViewById(R.id.radioButton5);
    public boolean rmale = male.isChecked();
    RadioButton female = findViewById(R.id.radioButton6);
    public boolean rfemale = female.isChecked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        first.putExtra("first", tfirst_name);
        startActivity(first);
    }
}
