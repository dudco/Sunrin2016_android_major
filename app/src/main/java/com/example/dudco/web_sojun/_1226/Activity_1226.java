package com.example.dudco.web_sojun._1226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dudco.web_sojun.R;
import com.example.dudco.web_sojun._1223.Student;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class Activity_1226 extends AppCompatActivity {
    private ListView listView;
    private EditText edit_name, edit_price, edit_image;
    private List<Food> foodList = new ArrayList<>();

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1226);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        listView = (ListView) findViewById(R.id.list_1226);
        edit_name = (EditText) findViewById(R.id.edit_1226_name);
        edit_price = (EditText) findViewById(R.id.edit_1226_price);
        edit_image = (EditText) findViewById(R.id.edit_1226_image);


        findViewById(R.id.btn_1226_act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_name.getText().toString();
                String price = edit_price.getText().toString();
                String image = edit_image.getText().toString();

                realm.beginTransaction();

                Food food = realm.createObject(Food.class);

                food.setName(name);
                food.setPrice(price);
                food.setImage(image);

                realm.commitTransaction();

                CustomAdapter adapter = new CustomAdapter(getFoodList());
                listView.setAdapter(adapter);
            }
        });

        CustomAdapter adapter = new CustomAdapter(getFoodList());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RealmResults<Food> all = realm.where(Food.class).findAll();
                Food food = all.get(position);

                realm.beginTransaction();
                food.deleteFromRealm();
                realm.commitTransaction();

                CustomAdapter adapter = new CustomAdapter(getFoodList());
                listView.setAdapter(adapter);
            }
        });
    }

    private List<Food> getFoodList(){
        RealmResults<Food> all = realm.where(Food.class).findAll();
        foodList = new ArrayList<>();

        for(int i = 0 ; i < all.size(); i++){
            foodList.add(all.get(i));
        }

        return foodList;
    }
}
