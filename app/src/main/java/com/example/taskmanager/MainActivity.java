package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;
    //Variables
    Animation topAnim, bottomAnim;
    ImageView iv_splashScreen;
    TextView tv_title, tv_tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //To hide status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        iv_splashScreen = findViewById(R.id.iv_splashScreen);
        tv_title = findViewById(R.id.tv_title);
        tv_tagline = findViewById(R.id.tv_tagline);

        iv_splashScreen.setAnimation(topAnim);
        tv_title.setAnimation(bottomAnim);
        tv_tagline.setAnimation(bottomAnim);

        //To create a delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,signuplogin.class);
                //startActivity(intent);
                //finish();
                //Creating pair for animation between splash screen and login screen
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(iv_splashScreen,"splashscreen_image");
                pairs[1] = new Pair<View,String>(tv_title,"splashscreen_title");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());

            }
        },SPLASH_SCREEN);
    }
}