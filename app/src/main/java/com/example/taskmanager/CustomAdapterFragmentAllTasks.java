package com.example.taskmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapterFragmentAllTasks extends BaseAdapter {

    Context context;
    String[] mytasksId;
    String[] mytasksSubject;
    String[] mytasksDate;
    String[] mytasksTime;

    LayoutInflater inflater;

    public CustomAdapterFragmentAllTasks(Context ctx,String[] mytasksId, String[] mytasksSubject, String[] mytasksDate,
                                       String[] mytasksTime){

        this.context = ctx;
        this.mytasksId = mytasksId;
        this.mytasksSubject = mytasksSubject;
        this.mytasksDate = mytasksDate;
        this.mytasksTime = mytasksTime;
        inflater = LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return mytasksId.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_mytask_one,null);
        TextView tv_taskid_created =  convertView.findViewById(R.id.tv_taskid_created);
        TextView tv_subject_created = convertView.findViewById(R.id.tv_subject_created);
        TextView tv_dueDate_created = convertView.findViewById(R.id.tv_dueDate_created);
        TextView tv_dueTime_created = convertView.findViewById(R.id.tv_dueTime_created);

        tv_taskid_created.setText(mytasksId[position]);
        tv_subject_created.setText(mytasksSubject[position]);
        tv_dueDate_created.setText(mytasksDate[position]);
        tv_dueTime_created.setText(mytasksTime[position]);

        return convertView;
    }
}
