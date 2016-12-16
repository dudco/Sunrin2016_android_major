package com.example.dudco.web_sojun;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by dudco on 2016. 12. 16..
 */

public class SubAcitivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        String str = this.getIntent().getStringExtra("str");

        TextView text = (TextView) findViewById(R.id.sub_text);
        text.setText(str);
        this.setResult(RESULT_OK);
    }
}
