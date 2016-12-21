package com.example.dudco.web_sojun._1219;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dudco.web_sojun.MainActivity;
import com.example.dudco.web_sojun.R;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static android.R.id.edit;

public class Activity_1219 extends AppCompatActivity {

    boolean check = false;
    int year, month, day;
    TextView edit_year, edit_month, edit_day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1219);

        edit_year = (TextView) findViewById(R.id.edit_year);
        edit_month = (TextView) findViewById(R.id.edit_month);
        edit_day = (TextView) findViewById(R.id.edit_day);

        findViewById(R.id.btn_1219_enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = Integer.valueOf(edit_year.getText().toString());
                day = Integer.valueOf(edit_day.getText().toString());
                month = Integer.valueOf(edit_month.getText().toString());

                if( year > 2016 || year == 0 || month > 12 || month == 0 || day > 31 || day == 0){
                    check = true;
                }

                if(check){
                    Toast.makeText(getApplicationContext(),"입력 오류 입니다. 다시 입력해 주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(), Activity_Sub.class);
                    intent.putExtra("year", year);
                    intent.putExtra("month", month);
                    intent.putExtra("day", day);

                    startActivity(intent);
                }
            }
        });

    }
}
