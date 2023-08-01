package com.example.taskmanager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;


public class FragmentMyDay extends Fragment {
    ListView lv_fragmentmyDay;
    SearchView searchView;
    Toolbar fragmyday_toolbar;

    String[] mytasksId = {"Task 20", "Task 300", "Task 3", "Task 4", "Task 5", "Task 6", "Task 7", "Task 8",
            "Task 9", "Task 10", "Task 11", "Task 12", "Task 13",};
    String[] mytasksSubject = {"New account","Make Payment","New Orders","Delivery Issue","Meeting","Conference",
            "Conference Call", "New account","Make Payment","New Orders","Delivery Issue","Meeting","Conference"};
    String[] mytasksDate = {"21-7-2023","22-7-2023","23-7-2023", "24-7-2023", "25-7-2023","26-7-2023", "27-7-2023", "28-7-2023",
            "29-7-2023", "30-7-2023", "31-7-2023","1-8-2023", "2-8-2023"};
    String[] mytasksTime = {"12:00:00", "11:00:00","13:00:00","14:30:00","15:45:00","16:15:00","10:45:00","12:00:00",
            "11:00:00","13:00:00","14:30:00","15:45:00","16:15:00","10:45:00",};

    public FragmentMyDay() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_my_day,container1,false);
        fragmyday_toolbar = view.findViewById(R.id.fragmyday_toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(fragmyday_toolbar);

        lv_fragmentmyDay = (ListView) view.findViewById(R.id.lv_fragmentmyDay);
        CustomAdapterFragmentMyDay customAdapterFragmentMyDay = new CustomAdapterFragmentMyDay(getActivity(),mytasksId,mytasksSubject,mytasksDate,mytasksTime);
        lv_fragmentmyDay.setAdapter(customAdapterFragmentMyDay);
        return view;

    }



}