package com.example.dudco.web_sojun._1222.List1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dudco.web_sojun.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dudco on 2016. 12. 22..
 */

public class CustomAdapter extends BaseAdapter {

    private List<Data> items = new ArrayList<>();

    public CustomAdapter(List<Data> items) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1222, null);

        ImageView image = (ImageView) view.findViewById(R.id.image_1222);
        TextView text_name = (TextView) view.findViewById(R.id.text_1222_name);
        TextView text_num = (TextView) view.findViewById(R.id.text_1222_num);

        Data data = items.get(position);

        image.setImageResource(data.getImage());
        text_name.setText(data.getName());
        text_num.setText(data.getP_num());

        return view;
    }
}
