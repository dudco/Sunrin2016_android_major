package com.example.dudco.web_sojun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dudco.web_sojun._1219.Activity_1219;
import com.example.dudco.web_sojun._1221.Activity_1221;
import com.example.dudco.web_sojun._1221.Activity_1221class;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1219).setOnClickListener(this);
        findViewById(R.id.btn_1221).setOnClickListener(this);
        findViewById(R.id.btn_1221_class).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1219 : startActivity(new Intent(MainActivity.this, Activity_1219.class)); break;
            case R.id.btn_1221 : startActivity(new Intent(MainActivity.this, Activity_1221.class)); break;
            case R.id.btn_1221_class : startActivity(new Intent(MainActivity.this, Activity_1221class.class)); break;
        }
    }
}
