package com.example.dudco.web_sojun._1221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.dudco.web_sojun.R;

import java.util.ArrayList;
import java.util.List;

/***
 * 12월 21일
 * 수업
 */
public class Activity_1221class extends AppCompatActivity {
    private GridView grid;
    private String[] ITEMS = { "A", "B", "C", "D", "E"};
    private List<StuData> stuList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1221class);

        grid = (GridView) findViewById(R.id.grid);
        stuList.add(new StuData("박태준" , 7474));
        stuList.add(new StuData("강은솔" , 6969));
        stuList.add(new StuData("심 훈" , 5877));
        stuList.add(new StuData("윤영채" , 1004));

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ITEMS);
        CustomAdapter adapter = new CustomAdapter(stuList);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ITEMS[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
