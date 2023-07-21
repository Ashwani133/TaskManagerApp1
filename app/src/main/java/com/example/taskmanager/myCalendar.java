package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class myCalendar extends AppCompatActivity {

    TextView tv_MyCalendar;
    CalendarView myCalendar;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calendar);

        myCalendar = findViewById(R.id.myCalendar);
        calendar = Calendar.getInstance();


    }
}