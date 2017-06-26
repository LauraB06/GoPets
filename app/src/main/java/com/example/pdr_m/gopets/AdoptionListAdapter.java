package com.example.pdr_m.gopets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by laura on 26-Jun-17.
 */

public class AdoptionListAdapter extends ArrayAdapter<CatData> {
    private ArrayList<CatData> dataSet;
    Context mContext;

    private static class ViewHolder {
        ImageView photo;
        TextView name;
        TextView sex;
        TextView size;
        TextView age;
        TextView state;
    }

    public AdoptionListAdapter(ArrayList<CatData> data, Context context) {
        super(context, R.layout.activity_listview, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CatData cat = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_listview, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.sex = (TextView) convertView.findViewById(R.id.sex);
            viewHolder.size = (TextView) convertView.findViewById(R.id.size);
            viewHolder.age = (TextView) convertView.findViewById(R.id.age);
            viewHolder.state = (TextView) convertView.findViewById(R.id.state);
            viewHolder.photo = (ImageView) convertView.findViewById(R.id.photo);

            result = convertView;

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.name.setText(cat.getName());
        viewHolder.sex.setText(cat.getSex());
        viewHolder.size.setText(cat.getSize());
        viewHolder.age.setText(cat.getAge());
        viewHolder.state.setText(cat.getState());
        viewHolder.photo.setImageResource(R.drawable.catu);

        return convertView;
    }

}