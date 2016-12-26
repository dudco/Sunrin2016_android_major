package com.example.dudco.web_sojun._1226;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dudco.web_sojun.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dudco on 2016. 12. 26..
 */

public class CustomAdapter extends BaseAdapter {

    List<Food> foodList = new ArrayList<>();

    public CustomAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Food food = foodList.get(position);

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1226_food, null);

        ImageView image = (ImageView) view.findViewById(R.id.image_1226);
        TextView name = (TextView) view.findViewById(R.id.text_1226_name);
        TextView price = (TextView) view.findViewById(R.id.text_1226_price);

        name.setText(food.getName());
        price.setText(food.getPrice());
        Glide.with(parent.getContext()).load(food.getImage()).error(R.mipmap.ic_launcher).into(image);

        return view;
    }
}
