package com.example.taskmanager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Calendar;

public class FragmentCalendar extends Fragment {

    Calendar fragmentmyCalendar;
    Toolbar mycalendar_toolbar;


    public FragmentCalendar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        mycalendar_toolbar = view.findViewById(R.id.mycalendar_toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mycalendar_toolbar);

        fragmentmyCalendar = Calendar.getInstance();
        return view;

    }
}