package com.example.dudco.web_sojun._1219;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dudco.web_sojun.R;

public class Activity_Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sub);

        int year = getIntent().getIntExtra("year", -1);
        int month = getIntent().getIntExtra("month", -1);
        int day = getIntent().getIntExtra("day", -1);

        if(year <= 0 || month <= 0 || day <= 0 ){
            Toast.makeText(getApplicationContext(), "오류발생", Toast.LENGTH_SHORT).show();
            finish();
        }

        String[] years = getResources().getStringArray(R.array.year);
        String[] months = getResources().getStringArray(R.array.months);
        String[] days = getResources().getStringArray(R.array.days);

//        Toast.makeText(getApplicationContext(), years[(year%10)] + " " + year%10, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), months[month - 1] + " " + month, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), days[day - 1] + " " + day, Toast.LENGTH_SHORT).show();

        TextView text = (TextView) findViewById(R.id.text_result);
        text.setText(years[(year%10)]+ " " + months[month - 1]+ " " + days[day - 1]);
    }
}
