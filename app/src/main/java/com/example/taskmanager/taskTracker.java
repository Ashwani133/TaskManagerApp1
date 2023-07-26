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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_tracker);
        bottomNavigation1 = findViewById(R.id.bottomNavigation1);

        bottomNavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id =item.getItemId();
                if (id==R.id.myday){
                    loadFrag(new FragmentMyDay(),false);
                }
                return true;
            }
        });


    }
    public void loadFrag(Fragment fragment, boolean flag){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag)

            ft.add(R.id.container, fragment);

        else
            ft.replace(R.id.container,fragment);



        ft.commit();
    }
}