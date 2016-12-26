package com.example.dudco.web_sojun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dudco.web_sojun._1219.Activity_1219;
import com.example.dudco.web_sojun._1221.Activity_1221;
import com.example.dudco.web_sojun._1221.Activity_1221class;
import com.example.dudco.web_sojun._1222.Activity_1222;
import com.example.dudco.web_sojun._1223.Activity_1223;
import com.example.dudco.web_sojun._1226.Activity_1226;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1219).setOnClickListener(this);
        findViewById(R.id.btn_1221).setOnClickListener(this);
        findViewById(R.id.btn_1221_class).setOnClickListener(this);
        findViewById(R.id.btn_1222).setOnClickListener(this);
        findViewById(R.id.btn_1223).setOnClickListener(this);
        findViewById(R.id.btn_1226).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_1219 : intent = new Intent(MainActivity.this, Activity_1219.class); break;
            case R.id.btn_1221 : intent = new Intent(MainActivity.this, Activity_1221.class); break;
            case R.id.btn_1221_class : intent = new Intent(MainActivity.this, Activity_1221class.class); break;
            case R.id.btn_1222 : intent = new Intent(MainActivity.this, Activity_1222.class); break;
            case R.id.btn_1223 : intent = new Intent(MainActivity.this, Activity_1223.class); break;
            case R.id.btn_1226 : intent = new Intent(MainActivity.this, Activity_1226.class); break;
        }
        startActivity(intent);
    }
}
