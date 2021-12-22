package com.ims_hr.latihan15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private int Icon[];
    private String Huruf[];
    private Context Ctx;

    public GridAdapter(int[] icon, String[] huruf, Context ctx) {
        Icon = icon;
        Huruf = huruf;
        Ctx = ctx;
    }

    @Override
    public int getCount() {
        return Icon.length;
    }

    @Override
    public Object getItem(int position) {
        return Huruf[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        View GridView = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) Ctx.getSystemService(Ctx.LAYOUT_INFLATER_SERVICE);
            GridView = inflater.inflate(R.layout.template_grid,null);
        }
        ImageView icon = GridView.findViewById(R.id.imageView_Template_Icon);
        TextView huruf = GridView.findViewById(R.id.textView_Template_Huruf);
        icon.setImageResource(Icon[position]);
        huruf.setText(Huruf[position]);
        return GridView;

        /*
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) Ctx.getSystemService(Ctx.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.template_grid,null);
        }
        ImageView icon = convertView.findViewById(R.id.imageView_Template_Icon);
        TextView huruf = convertView.findViewById(R.id.textView_Template_Huruf);
        icon.setImageResource(Icon[position]);
        huruf.setText(Huruf[position]);
        return convertView;
        */
    }

}
