package com.example.dudco.web_sojun._1223;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dudco.web_sojun.R;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class Activity_1223 extends AppCompatActivity {
    ListView list;
    List<Student> items;

    private EditText edit_name, edit_image, edit_phone;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1223);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        list = (ListView) findViewById(R.id.list_1223);

        edit_name = (EditText) findViewById(R.id.edit_name);
        edit_image = (EditText) findViewById(R.id.edit_image);
        edit_phone = (EditText) findViewById(R.id.edit_phone);

        getPets();

        findViewById(R.id.btn_1223_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_name.getText().toString();
                String image = edit_image.getText().toString();
                String phone = edit_phone.getText().toString();
                //시작
                realm.beginTransaction();

                Student stu = realm.createObject(Student.class);

                stu.setName(name);
                stu.setPhone(phone);
                stu.setImage(image);

                realm.commitTransaction();
                //끝

//                items.add(stu);
                CustomAdapter adapter = new CustomAdapter(getPets());
                list.setAdapter(adapter);
            }
        });

        CustomAdapter adapter = new CustomAdapter(getPets());
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RealmResults<Student> all = realm.where(Student.class).findAll();
                Student stu = all.get(position);

                realm.beginTransaction();
                stu.deleteFromRealm();
                realm.commitTransaction();

                CustomAdapter adapter = new CustomAdapter(getPets());
                list.setAdapter(adapter);
            }
        });
    }

    private List<Student> getPets(){

        RealmResults<Student> all = realm.where(Student.class).findAll();
        items = new ArrayList<>();

        for(int i = 0 ; i < all.size(); i++){
            items.add(all.get(i));
        }

        return items;
    }
}
