package com.example.dudco.web_sojun._1219;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dudco.web_sojun.MainActivity;
import com.example.dudco.web_sojun.R;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static android.R.id.edit;

/***
 * 12월 19일
 * 숙제
 */
public class Activity_1219 extends AppCompatActivity {

    private boolean check = false;
    private int year, month, day;
    private Spinner edit_year, edit_month, edit_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1219);


        ArrayAdapter<Integer> adapter_year = new ArrayAdapter<>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item);


        for(int i = 2000; i < 2021; i++){
            adapter_year.add(i);
        }
        ArrayAdapter<Integer> adapter_day = new ArrayAdapter<>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item);

        for (int i = 1; i < 32; i++) {
            adapter_day.add(i);
        }
        ArrayAdapter<Integer> adapter_month = new ArrayAdapter<>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item);

        for (int i = 1; i < 13; i++) {
            adapter_month.add(i);
        }

        edit_year = (Spinner) findViewById(R.id.edit_year);
        edit_month = (Spinner) findViewById(R.id.edit_month);
        edit_day = (Spinner) findViewById(R.id.edit_day);

        edit_year.setAdapter(adapter_year);
        edit_day.setAdapter(adapter_day);
        edit_month.setAdapter(adapter_month);

        edit_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year = (int) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        edit_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                month = (int) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        edit_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day = (int) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        findViewById(R.id.btn_1219_enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                year = Integer.valueOf(edit_year.getText().toString());
//                day = Integer.valueOf(edit_day.getText().toString());
//                month = Integer.valueOf(edit_month.getText().toString());

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
