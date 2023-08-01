package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class MYTEAM extends AppCompatActivity {

    ListView lv_myteam;
    TextView tv_myteamTitle;
    Toolbar myteam_toolbar;

    String[] name = {"Employee 1", "Employee 2","Employee 3", "Employee 4", "Employee 5", "Employee 6", "Employee 7", "Employee 8",
            "Employee 9","Employee 10","Employee 11","Employee 12","Employee 13",};
    String[] designation = {"Senior Dev","Junior Dev","System Engineer","FrontEnd Dev","BackEnd Dev","Devops","Human Resource",
    "SupplyChain Mang","Junior Dev","System Engineer","FrontEnd Dev","BackEnd Dev","Devops"};

    int[] images = {R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myteam);
        lv_myteam = findViewById(R.id.lv_myteam);
        tv_myteamTitle = findViewById(R.id.tv_myteamTitle);
        myteam_toolbar = findViewById(R.id.myteam_toolbar);

        setSupportActionBar(myteam_toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CustomAdapterMyTeamList customAdapterMyTeamList = new CustomAdapterMyTeamList(getApplication(),name,designation,images);
        lv_myteam.setAdapter(customAdapterMyTeamList);
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
            Intent intent = new Intent(MYTEAM.this, Profile.class);
            startActivity(intent);
        }else{
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}