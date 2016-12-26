package com.example.dudco.web_sojun._1226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.dudco.web_sojun.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class Activity_1226_class extends AppCompatActivity {
    private  TextView text1, text2, text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1226_class);

        text1 = (TextView) findViewById(R.id.text1);

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://skpla.net/ggqME", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                 Log.d("dudco", new String(responseBody));
                try {
                    JSONObject object = new JSONObject(new String(responseBody));
                    text1.setText("a :"+String.valueOf(object.get("a"))+"  b :"+String.valueOf(object.get("b"))+"  c:"+String.valueOf(object.get("c")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

        String getServerData="{domino:'100',pizza:'맛있다'}";
        try {
            JSONObject jsonObject = new JSONObject(getServerData);

            String a = jsonObject.getString("domino");
            String b = jsonObject.getString("pizza");

            Log.i("dudco","a" + a + "b " + b );
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
