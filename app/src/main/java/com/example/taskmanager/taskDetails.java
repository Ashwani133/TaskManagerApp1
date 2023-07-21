package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class taskDetails extends AppCompatActivity {

    TextView tv_taskDetailsTitle,tv_taskid_taskDetails, tv_taskid_taskDetailsCreated,tv_taskSubject_taskDetails,tv_taskSubject_taskDetailsCreated
            ,tv_taskDescription_taskDetails,tv_taskDescription_taskDetailsCreated,tv_dueDate_taskDetails,tv_dueDate_taskDetailsCreated,
            tv_dueTime_taskDetails,tv_dueTime_taskDetailsCreated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        tv_taskDetailsTitle = findViewById(R.id.tv_taskDetailsTitle);
        tv_taskid_taskDetails = findViewById(R.id.tv_taskid_taskDetails);
        tv_taskid_taskDetailsCreated = findViewById(R.id.tv_taskid_taskDetailsCreated);
        tv_taskSubject_taskDetails = findViewById(R.id.tv_taskSubject_taskDetails);
        tv_taskSubject_taskDetailsCreated = findViewById(R.id.tv_taskSubject_taskDetailsCreated);
        tv_taskDescription_taskDetails = findViewById(R.id.tv_taskDescription_taskDetails);
        tv_taskDescription_taskDetailsCreated = findViewById(R.id.tv_taskDescription_taskDetailsCreated);
        tv_dueDate_taskDetails = findViewById(R.id.tv_dueDate_taskDetails);
        tv_dueDate_taskDetailsCreated = findViewById(R.id.tv_dueDate_taskDetailsCreated);
        tv_dueTime_taskDetails = findViewById(R.id.tv_dueTime_taskDetails);
        tv_dueTime_taskDetailsCreated = findViewById(R.id.tv_dueTime_taskDetailsCreated);
    }
}