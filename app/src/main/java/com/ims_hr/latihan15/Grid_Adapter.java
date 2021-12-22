package com.ims_hr.latihan15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Grid_Adapter extends BaseAdapter {

    int Icon[];
    String Huruf[];
    Context context;
    int ResID;

    public Grid_Adapter(int[] icon, String[] huruf, Context context, int resID) {
        Icon = icon;
        Huruf = huruf;
        this.context = context;
        ResID = resID;
    }

    @Override
    public int getCount() {
        return Icon.length;
    }

    @Override
    public String getItem(int i) {
        return Huruf[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewData;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        viewData = inflater.inflate(ResID,viewGroup,false);
        ImageView IV_Icon = viewData.findViewById(R.id.imageView_Template_Icon);
        TextView TV_Huruf = viewData.findViewById(R.id.textView_Template_Huruf);
        IV_Icon.setImageResource(Icon[i]);
        TV_Huruf.setText(this.getItem(i));
        return viewData;
    }

}
