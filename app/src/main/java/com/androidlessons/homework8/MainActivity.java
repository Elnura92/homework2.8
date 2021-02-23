package com.androidlessons.homework8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    Button logInButton, signUpButton;

    private View.OnClickListener signUpOnClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent signUpProfileIntent = new Intent(MainActivity.this, signUpActivity.class);

            startActivity(signUpProfileIntent);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.etUserName);
        password = findViewById(R.id.etPassword);
        logInButton = findViewById(R.id.btnLogin) ;
        signUpButton = findViewById(R.id.btnSignUp);

        signUpButton.setOnClickListener(signUpOnClickListener);


    }
}