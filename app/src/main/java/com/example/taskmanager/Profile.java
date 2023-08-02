package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    //BottomNavigationView bottomNavigation;
    CardView cv_tasks, cv_myteam, cv_taskTracker;
    Toolbar profile_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        //bottomNavigation =findViewById(R.id.bottomNavigation);
        cv_tasks = findViewById(R.id.cv_tasks);
        cv_myteam = findViewById(R.id.cv_myteam);
        cv_taskTracker = findViewById(R.id.cv_taskTracker);
        profile_toolbar = findViewById(R.id.profile_toolbar);

//        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id =item.getItemId();
//
//                if(id == R.id.myday){
//                    Intent intent = new Intent(Profile.this, myTasks.class);
//                    startActivity(intent);
//
//                }
//                if(id == R.id.myweek){
//                    Intent intent = new Intent(Profile.this,myWeek.class);
//                    startActivity(intent);
//                }
//
//                if(id == R.id.alltasks){
//                    Intent intent = new Intent(Profile.this,allTasks.class);
//                    startActivity(intent);
//                }
//
//                if(id == R.id.taskCalendar){
//                    Intent intent = new Intent(Profile.this,myCalendar.class);
//                    startActivity(intent);
//                }
//
//                return true;
//            }
//        });

        setSupportActionBar(profile_toolbar);

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

        cv_taskTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,taskTracker.class);
                startActivity(intent);
            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu_search,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int itemId = item.getItemId();
//        if(itemId==R.id.opt_home){
//            Intent intent = new Intent(Profile.this,Profile.class);
//            startActivity(intent);
//
//        }else {
//
//                SearchView searchView =(SearchView) item.getActionView();
//                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//                    @Override
//                    public boolean onQueryTextSubmit(String query) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onQueryTextChange(String newText) {
//                        return false;
//                    }
//                });
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
