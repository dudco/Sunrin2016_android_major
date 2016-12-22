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
        StuData stu = stuList.get(position);
        String name = stu.getName();
        long id = stu.getId();
        boolean isLeft = stu.isLeft();

        if(isLeft) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);

            ImageView image = (ImageView) view.findViewById(R.id.item_image);
            TextView text_name = (TextView) view.findViewById(R.id.item_text_name);
            TextView text_id = (TextView) view.findViewById(R.id.item_text_id);

            text_name.setText(name);
            text_id.setText(String.valueOf(id));

            return view;
        }else{
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2, null);

            ImageView image2 = (ImageView) view2.findViewById(R.id.item_image2);
            TextView text_name2 = (TextView) view2.findViewById(R.id.item_text_name2);
            TextView text_id2 = (TextView) view2.findViewById(R.id.item_text_id2);

            text_name2.setText(name);
            text_id2.setText(String.valueOf(id));

            return view2;
        }
    }


}
