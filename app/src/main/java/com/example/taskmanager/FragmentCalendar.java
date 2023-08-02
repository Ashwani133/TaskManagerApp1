package com.example.taskmanager;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Calendar;

public class FragmentCalendar extends Fragment {

    Calendar fragmentmyCalendar;
    Toolbar mycalendar_toolbar;
    ImageView fragMyCalendarBack;
    ImageButton btn_fragMyCalendarBack;


    public FragmentCalendar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
//        mycalendar_toolbar = view.findViewById(R.id.mycalendar_toolbar);
//        AppCompatActivity activity = (AppCompatActivity) getActivity();
//        activity.setSupportActionBar(mycalendar_toolbar);
        //fragMyCalendarBack = view.findViewById(R.id.fragMyCalendarBack);
        btn_fragMyCalendarBack = view.findViewById(R.id.btn_fragMyCalendarBack);
        btn_fragMyCalendarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
            }
        });


        fragmentmyCalendar = Calendar.getInstance();
        return view;

    }
}