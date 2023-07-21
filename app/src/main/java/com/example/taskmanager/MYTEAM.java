package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MYTEAM extends AppCompatActivity {

    ListView lv_myteam;
    TextView tv_myteamTitle;

    String[] name = {"Employee 1", "Employee 2","Employee 3", "Employee 4", "Employee 5", "Employee 6", "Employee 7", "Employee 8",
            "Employee 9","Employee 10","Employee 11","Employee 12","Employee 13",};
    String[] designation = {"Senior Dev","Junior Dev","System Engineer","FrontEnd Dev","BackEnd Dev","Devops","Human Resource",
    "SupplyChain Mang","Junior Dev","System Engineer","FrontEnd Dev","BackEnd Dev","Devops"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myteam);
    }
}