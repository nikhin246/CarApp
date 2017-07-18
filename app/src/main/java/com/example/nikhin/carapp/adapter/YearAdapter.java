package com.example.nikhin.carapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nikhin.carapp.R;
import com.example.nikhin.carapp.util.MySingleTon;

import java.util.ArrayList;

public class YearAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> list;
    LayoutInflater inflater;

    public YearAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder {
        ImageView selectYear;
        TextView txtviewyear;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_year_adapter, null);
            holder = new ViewHolder();
            holder.selectYear = (ImageView) convertView.findViewById(R.id.year_Select_Check);
            holder.txtviewyear = (TextView) convertView.findViewById(R.id.txt_view_year);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtviewyear.setText(list.get(position));
        if (MySingleTon.instance().year != null) {
            if (list.get(position).equalsIgnoreCase(MySingleTon.instance().year)) {
                holder.selectYear.setVisibility(View.VISIBLE);
            } else {
                holder.selectYear.setVisibility(View.GONE);
            }
        } else {
            holder.selectYear.setVisibility(View.GONE);

        }

        return convertView;
    }
}
