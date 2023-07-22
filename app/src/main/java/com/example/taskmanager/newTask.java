package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class newTask extends AppCompatActivity {
    TextView tv_newTask_title, tv_newTaskDueDate, tv_newTaskDueDateCreated;
    CardView cv_newTask_write;
    EditText et_createNewTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);


    }
}