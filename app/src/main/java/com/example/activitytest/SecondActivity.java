package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*Intent intent = getIntent();
        String data = intent.getStringExtra("secondData");
        Log.d("SecondActivity", "onCreate: "+data);*/

        Button buttonSecond = findViewById(R.id.button2);
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("secondData","hello main");
                setResult(RESULT_OK,intent);//第一个参数是结果码
                finish();
            }
        });


    }
}
