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
/**
 * Created by Nikhin on 5/8/2017.
 */

public class MakeAdapter  extends BaseAdapter{

    Context context;
    ArrayList<String> list;
    private static LayoutInflater inflater = null;

    public MakeAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.list = arrayList;
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

    public static class ViewHolder {
        ImageView selectIcon, icon;
        TextView makeName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.activity_make_adapter, null);
            holder = new ViewHolder();
            holder.icon = (ImageView) convertView.findViewById(R.id.img_icon);
            holder.selectIcon = (ImageView) convertView.findViewById(R.id.img_select_check);
            holder.makeName = (TextView) convertView.findViewById(R.id.txtv_make_name);
            convertView.setTag(holder);
        }
            else{
               holder = (ViewHolder) convertView.getTag();
            }

        String make = list.get(position);
        make = make.replaceAll("", "");
        int id = context.getResources().getIdentifier(make.toLowerCase(), "drawable", context.getPackageName());

        holder.icon.setImageResource(id);
        holder.makeName.setText(list.get(position));
        if(MySingleTon.instance().make!=null){
            if(list.get(position).equalsIgnoreCase(MySingleTon.instance().make)){
                holder.selectIcon.setVisibility(View.VISIBLE);
            } else {
                holder.selectIcon.setVisibility(View.GONE);
            }
        } else {
            holder.selectIcon.setVisibility(View.GONE);
        }


        return convertView;
    }
}
