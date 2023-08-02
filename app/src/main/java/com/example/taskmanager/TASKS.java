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
import android.widget.Button;

public class TASKS extends AppCompatActivity {
    Button btn_newTask,btn_taskInProgress, btn_taskCompleted, btn_taskPastDue;
    CardView cv_newTask,cv_taskInProgress,cv_tasksCompleted,cv_tasksPastDue;
    Toolbar tasks_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        //btn_newTask = findViewById(R.id.btn_newTask);
        //btn_taskInProgress = findViewById(R.id.btn_taskInProgress);
        //btn_taskCompleted = findViewById(R.id.btn_taskCompleted);
        //btn_taskPastDue = findViewById(R.id.btn_taskPastDue);
        cv_newTask = findViewById(R.id.cv_newTask);
        cv_taskInProgress = findViewById(R.id.cv_taskInProgress);
        cv_tasksCompleted = findViewById(R.id.cv_tasksCompleted);
        cv_tasksPastDue = findViewById(R.id.cv_tasksPastDue);
        tasks_toolbar = findViewById(R.id.tasks_toolbar);

        setSupportActionBar(tasks_toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        cv_newTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TASKS.this, newTask.class);
                startActivity(intent);
            }
        });
        cv_taskInProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TASKS.this, taskInProgress.class);
                startActivity(intent);
            }
        });

        cv_tasksCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TASKS.this,tasksCompleted.class);
                startActivity(intent);
            }
        });

        cv_tasksPastDue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TASKS.this,tasksPastDue.class);
                startActivity(intent);
            }
        });
    }

//        else if(itemId==R.id.opt_search){
//            SearchView searchView = (SearchView) item.getActionView();
//            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//                @Override
//                public boolean onQueryTextSubmit(String query) {
//                    return false;
//                }
//
//                @Override
//                public boolean onQueryTextChange(String newText) {
//                    return true;
//                }
//            });
//        }

}