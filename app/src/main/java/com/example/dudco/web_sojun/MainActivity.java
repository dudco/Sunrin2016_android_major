package com.example.dudco.web_sojun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edit;
    Button btn;

    SharedPreferences pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pre = getSharedPreferences("asdf", MODE_PRIVATE);

        text = (TextView) findViewById(R.id.text);
        edit = (EditText) findViewById(R.id.edit);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit.getText().toString();
                text.setText(str);
                Intent intent = new Intent(MainActivity.this, SubAcitivity.class);
                intent.putExtra("str", str);
                startActivityForResult(intent, 123);
            }
        });

//        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            if(requestCode == 123){
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
