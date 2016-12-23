package com.example.dudco.web_sojun._1223;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dudco.web_sojun.R;
import com.example.dudco.web_sojun._1221.StuData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dudco on 2016. 12. 23..
 */

public class CustomAdapter extends BaseAdapter {

    List<Student> items = new ArrayList<>();

    public CustomAdapter(List<Student> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1223, null);

        Student data = items.get(position);

        TextView text_name = (TextView) view.findViewById(R.id.text_name);
        ImageView image = (ImageView) view.findViewById(R.id.image_1223);
        TextView text_phone = (TextView) view.findViewById(R.id.text_phone);

        text_name.setText("이름 : "+data.getName());
        text_phone.setText("전화번호 : "+data.getPhone());
        Glide.with(parent.getContext()).load(data.getImage()).error(R.mipmap.ic_launcher).into(image);
//        data.getImage();

        return view;
    }
}
