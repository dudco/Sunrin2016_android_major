package com.example.dudco.web_sojun._1226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.dudco.web_sojun.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class Activity_1226_class extends AppCompatActivity {
    private  TextView text1;
    private String JSONData = "{ 'books':[" +
                                "{ 'language': 'java', 'edition': 'second'}" +
                               ",{ 'language': 'C++', 'lastName': 'sung'}" +
                               "]" +
                              "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1226_class);

        text1 = (TextView) findViewById(R.id.text1);

        try {
            JSONObject object = new JSONObject(JSONData);
            JSONArray books = object.getJSONArray("books");
            String language1 = books.getJSONObject(0).getString("language");
            String edition = books.getJSONObject(0).getString("edition");
            String language2 = books.getJSONObject(1).getString("language");
            String lastname = books.getJSONObject(1).getString("lastName");

            Log.d("dudco", "language1 : " + language1 + "\nedition : "+ edition + "\nlanguage2 : " + language2 + "\nlastName" + lastname);

//            text1.setText("a :"+String.valueOf(object.get("a"))+"  b :"+String.valueOf(object.get("b"))+"  c:"+String.valueOf(object.get("c")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
