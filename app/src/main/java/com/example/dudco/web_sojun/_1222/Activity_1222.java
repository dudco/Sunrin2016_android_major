package com.example.dudco.web_sojun._1222;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dudco.web_sojun.R;
import com.example.dudco.web_sojun._1222.List1.CustomAdapter;
import com.example.dudco.web_sojun._1222.List1.Data;

import java.util.ArrayList;
import java.util.List;

/***
 * 12월 22일
 * 과제
 */
public class Activity_1222 extends AppCompatActivity {
    ListView list1, list2;
    List<Data> items1 = new ArrayList<>();
    List<com.example.dudco.web_sojun._1222.List2.Data> items2 = new ArrayList<>();
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1222);

        list1 = (ListView) findViewById(R.id.list1); //이미지 전화번호 이름
        list2 = (ListView) findViewById(R.id.list2); //애완동물이름 종류 나이

        CustomAdapter adapter1 = new CustomAdapter(items1);
        com.example.dudco.web_sojun._1222.List2.CustomAdapter adapter2 = new com.example.dudco.web_sojun._1222.List2.CustomAdapter(items2);

        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));
        items1.add(new Data("강은솔", "010-2663-2953", R.mipmap.ic_launcher));

        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));
        items2.add(new com.example.dudco.web_sojun._1222.List2.Data("강아지", "요크셔테리어", 134));

        list1.setAdapter(adapter1);
        list2.setAdapter(adapter2);
    }
}
