package com.example.user.pregnancyplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    EditText userText, passText, LocationText, PhoneText;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userText = (EditText) findViewById(R.id.txtuser);
        passText = (EditText) findViewById(R.id.txtpass);
        LocationText = (EditText) findViewById(R.id.txtlocation);
        PhoneText = (EditText) findViewById(R.id.txtphone);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsignup:
                startActivity(new Intent(this,SignUp.class));
                break;
        }
    }














    }

