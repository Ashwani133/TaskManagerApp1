package com.example.taskmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterMyTeamList extends BaseAdapter {

    Context context;
    String[] name;
    String[] designation;
    int[] images;
    LayoutInflater inflater;

    public CustomAdapterMyTeamList(Context ctx, String[] name, String[] designation, int[] images){

        this.context = ctx;
        this.name = name;
        this.designation = designation;
        this.images = images;
        inflater = LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return name.length;
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
        convertView = inflater.inflate(R.layout.activity_my_team_one,null);
        TextView tv_name =  convertView.findViewById(R.id.tv_name);
        TextView tv_designation =  convertView.findViewById(R.id.tv_designation);
        ImageView image = convertView.findViewById(R.id.image);

        tv_name.setText(name[position]);
        tv_designation.setText(designation[position]);
        image.setImageResource(images[position]);


        return convertView;
    }
}
