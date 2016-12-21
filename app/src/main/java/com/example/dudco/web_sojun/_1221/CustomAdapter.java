package com.example.dudco.web_sojun._1221;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dudco.web_sojun.R;

import java.util.List;

/**
 * Created by dudco on 2016. 12. 21..
 */

public class CustomAdapter extends BaseAdapter {
    private List<StuData> stuList;

    public CustomAdapter(List<StuData> stuList) {
        this.stuList = stuList;
    }

    @Override
    public int getCount() {
        return stuList.size();
    }

    @Override
    public Object getItem(int position) {
        return stuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,null);

        StuData stu = stuList.get(position);
        ImageView image = (ImageView) view.findViewById(R.id.item_image);
        TextView text_name = (TextView) view.findViewById(R.id.item_text_name);
        TextView text_id = (TextView) view.findViewById(R.id.item_text_id);
        text_name.setText(stu.getName());
        text_id.setText(String.valueOf(stu.getId()));

        return view;
    }


}
