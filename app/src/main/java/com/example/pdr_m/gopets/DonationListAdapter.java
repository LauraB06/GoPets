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
 * Created by laura on 27-Jun-17.
 */

public class DonationListAdapter extends ArrayAdapter<DonationData> {
    private ArrayList<DonationData> dataSet;
    Context mContext;

    private static class ViewHolder {
        ImageView photo;
        TextView name;
        TextView meta;
    }

    public DonationListAdapter(ArrayList<DonationData> data, Context context) {
        super(context, R.layout.activity_listviewdonation, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DonationData donation = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_listviewdonation, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.meta = (TextView) convertView.findViewById(R.id.meta);
            viewHolder.photo = (ImageView) convertView.findViewById(R.id.photo);

            result = convertView;

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.name.setText(donation.getName());
        viewHolder.meta.setText(donation.getMeta());
        viewHolder.photo.setImageResource(R.drawable.interrogation);

        return convertView;
    }

}
