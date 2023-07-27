package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class taskTracker extends AppCompatActivity {
    BottomNavigationView bottomNavigation1;
    FragmentMyDay fragmentMyDay = new FragmentMyDay();
    FragmentMyWeek fragmentMyWeek = new FragmentMyWeek();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_tracker);
        bottomNavigation1 = findViewById(R.id.bottomNavigation1);


        bottomNavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id =item.getItemId();

                if (id==R.id.myweek){
                    loadFrag(new FragmentMyWeek(),false);

                } else if (id==R.id.alltasks) {

                    loadFrag(new FragmentAllTasks(), false);

                } else if (id==R.id.taskCalendar) {

                    loadFrag(new FragmentCalendar(),false);
                    
                }else{
                        loadFrag(new FragmentMyDay(),false);
                }
                return true;
            }
        });
            bottomNavigation1.setSelectedItemId(R.id.myday);


    }
    public void loadFrag(Fragment fragment, boolean flag){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag)

            ft.add(R.id.container1, fragment);

        else
            ft.replace(R.id.container1,fragment);



        ft.commit();
    }
}