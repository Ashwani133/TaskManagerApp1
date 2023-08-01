package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class signuplogin extends AppCompatActivity {
    Button bt_newuser,bt_login;
    Toolbar login_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signuplogin);
        bt_newuser = findViewById(R.id.bt_newuser);
        bt_login = findViewById(R.id.bt_login);
        login_toolbar = findViewById(R.id.login_toolbar);

        setSupportActionBar(login_toolbar);

        bt_newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signuplogin.this, signUp.class);
                startActivity(intent);
            }
        });
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signuplogin.this,Profile.class);
                startActivity(intent);
            }
        });

    }
}