package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class newTask extends AppCompatActivity {
    TextView tv_newTask_title, tv_newTaskDueDate, tv_newTaskDueDateCreated;
    CardView cv_newTask_write;
    EditText et_taskSubject, et_taskDescription;
    Calendar calendar;
    Toolbar newtask_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        et_taskSubject = findViewById(R.id.et_taskSubject);
        et_taskDescription = findViewById(R.id.et_taskDescription);
        newtask_toolbar = findViewById(R.id.newtask_toolbar);
        tv_newTaskDueDateCreated = findViewById(R.id.tv_newTaskDueDateCreated);

        setSupportActionBar(newtask_toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tv_newTaskDueDateCreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId==R.id.opt_home){
            Intent intent = new Intent(this,Profile.class);
            startActivity(intent);
        }else{
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}