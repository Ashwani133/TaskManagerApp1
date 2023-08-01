package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class tasksCompleted extends AppCompatActivity {
    TextView tv_tasksCompletedTitle;
    ListView lv_tasksCompleted;
    Toolbar taskCompleted_toolbar;

    String[] mytasksId = {"Task 1", "Task 2", "Task 3", "Task 4", "Task 5", "Task 6", "Task 7", "Task 8",
            "Task 9", "Task 10", "Task 11", "Task 12", "Task 13",};
    String[] mytasksSubject = {"New account","Make Payment","New Orders","Delivery Issue","Meeting","Conference",
            "Conference Call", "New account","Make Payment","New Orders","Delivery Issue","Meeting","Conference"};
    String[] mytasksDate = {"21-7-2023","22-7-2023","23-7-2023", "24-7-2023", "25-7-2023","26-7-2023", "27-7-2023", "28-7-2023",
            "29-7-2023", "30-7-2023", "31-7-2023","1-8-2023", "2-8-2023"};
    String[] mytasksTime = {"12:00:00", "11:00:00","13:00:00","14:30:00","15:45:00","16:15:00","10:45:00","12:00:00",
            "11:00:00","13:00:00","14:30:00","15:45:00","16:15:00","10:45:00",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_completed);
        tv_tasksCompletedTitle = findViewById(R.id.tv_tasksCompletedTitle);
        lv_tasksCompleted = findViewById(R.id.lv_tasksCompleted);
        taskCompleted_toolbar = findViewById(R.id.taskCompleted_toolbar);

        setSupportActionBar(taskCompleted_toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CustomAdapterTasksCompleted customAdapterTasksCompleted = new CustomAdapterTasksCompleted(getApplication(),mytasksId,mytasksSubject,mytasksDate
                ,mytasksTime);
        lv_tasksCompleted.setAdapter(customAdapterTasksCompleted);

        lv_tasksCompleted.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(tasksCompleted.this, taskDetails.class);
                startActivity(intent);

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
            Intent intent = new Intent(tasksCompleted.this,Profile.class);
            startActivity(intent);
        }else{
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}