package com.androidlessons.homework8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class signUpActivity extends AppCompatActivity {
    Button register;
    EditText email, userName, pswrd, confirmP;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_profile);

        register = findViewById(R.id.btnRegister);
        email = findViewById(R.id.etEmail);
        userName = findViewById(R.id.etName);
        pswrd = findViewById(R.id.etPswrd);
        confirmP = findViewById(R.id.etConfirm);


    }
}
