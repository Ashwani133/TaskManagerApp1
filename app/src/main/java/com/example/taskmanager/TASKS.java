package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TASKS extends AppCompatActivity {
    Button btn_newTask,btn_taskInProgress, btn_taskCompleted, btn_taskPastDue;
    CardView cv_newTask,cv_taskInProgress,cv_tasksCompleted,cv_tasksPastDue;

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
}