package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    CardView cv_tasks, cv_myteam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        bottomNavigation =findViewById(R.id.bottomNavigation);
        cv_tasks = findViewById(R.id.cv_tasks);
        cv_myteam = findViewById(R.id.cv_myteam);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id =item.getItemId();

                if(id == R.id.myday){
                    Intent intent = new Intent(Profile.this, myTasks.class);
                    startActivity(intent);

                }
                if(id == R.id.myweek){
                    Intent intent = new Intent(Profile.this,myWeek.class);
                    startActivity(intent);
                }

                if(id == R.id.alltasks){
                    Intent intent = new Intent(Profile.this,allTasks.class);
                    startActivity(intent);
                }

                if(id == R.id.calendar){
                    Intent intent = new Intent(Profile.this,myCalendar.class);
                    startActivity(intent);
                }

                return true;
            }
        });

        cv_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, TASKS.class);
                startActivity(intent);

            }
        });
        cv_myteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,MYTEAM.class);
                startActivity(intent);
            }
        });

        };
    }
