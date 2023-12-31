package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class allTasks extends AppCompatActivity {

    TextView tv_MyAllTaskTitle;
    ListView lv_myAllTasks;

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
        setContentView(R.layout.activity_all_tasks);

        tv_MyAllTaskTitle = findViewById(R.id.tv_MyAllTaskTitle);
        lv_myAllTasks = findViewById(R.id.lv_myAllTasks);

        CustomAdapterMytasks customAdapterMytasks = new CustomAdapterMytasks(getApplication(),mytasksId,mytasksSubject,mytasksDate
                ,mytasksTime);
        lv_myAllTasks.setAdapter(customAdapterMytasks);

        lv_myAllTasks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(allTasks.this,taskDetails.class);
                startActivity(intent);

            }
        });


    }
}