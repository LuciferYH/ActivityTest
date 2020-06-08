package com.example.activitytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*//创建一个意图对象
                 Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, SecondActivity.class);
                intent.setComponent(component);*/

                //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
               /* Intent intent = new Intent("android.intent.action.VIEW" );
                //Uri data = Uri.parse("http://www.baidu.com");
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);*/

              /* Intent intent = new Intent(MainActivity.this,SecondActivity.class);
               String data = "hello second";
               intent.putExtra("secondData",data);
               startActivity(intent);*/

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
                //第二个参数是请求码，确保唯一
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:{
                if(resultCode==RESULT_OK){
                    String res = data.getStringExtra("secondData");
                    Log.d("MainActivity", "onActivityResult: "+res);
                }
                break;
            }
            default:
        }
    }
}
