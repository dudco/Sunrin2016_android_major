package com.example.dudco.web_sojun._1222.List2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dudco.web_sojun.R;
import com.example.dudco.web_sojun._1222.List2.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dudco on 2016. 12. 22..
 */

public class CustomAdapter extends BaseAdapter{

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1222_animal, null);

        TextView text_name = (TextView) view.findViewById(R.id.text_1222_ani_name);
        TextView text_kind = (TextView) view.findViewById(R.id.text_1222_ani_kind);
        TextView text_age = (TextView) view.findViewById(R.id.text_1222_ani_age);

        Data data = items.get(position);

        text_name.setText(data.getName());
        text_kind.setText(data.getKind());
        text_age.setText(String.valueOf(data.getAge()));

        return view;
    }
}
