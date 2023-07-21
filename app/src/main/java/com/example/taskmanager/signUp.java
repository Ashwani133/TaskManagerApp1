package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class signUp extends AppCompatActivity {
    ImageView iv_signupImage;
    TextView tv_welcome,tv_signup_msg;
    TextInputLayout tv_signup_fullname, tv_signup_username, tv_signup_email, tv_signup_mobile, tv_signup_password;
    TextInputEditText et_signup_fullname, et_signup_username, et_signup_email, et_signup_mobile, et_signup_password;
    Button bt_signup, bt_backtosignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        iv_signupImage = findViewById(R.id.iv_signupImage);
        tv_welcome = findViewById(R.id.tv_welcome);
        tv_signup_msg = findViewById(R.id.tv_signup_msg);
        bt_signup = findViewById(R.id.bt_signup);
        bt_backtosignin = findViewById(R.id.bt_backtosignin);

        bt_backtosignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUp.this,signuplogin.class);
                startActivity(intent);
            }
        });
        bt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUp.this, Profile.class);
                startActivity(intent);
            }
        });


    }
}