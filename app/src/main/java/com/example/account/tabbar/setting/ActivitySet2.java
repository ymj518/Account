package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.account.R;

public class ActivitySet2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set2);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            //使用隐式Intent实现 Activity的跳转
            case R.id.arrow:
                intent.setAction("com.example.activity.SECOND_ACTIVITY");
                intent.putExtra("msg","second activity");
                break;
        }
        //判断intent 指向的action是否存在
        if(intent.resolveActivity(getPackageManager()) !=null) {
            startActivity(intent);
        }
    }

    public void swtichClick(View view){
        Switch sw = (Switch)view;
        boolean isChecked = sw.isChecked();
        if(isChecked){
            Toast.makeText(ActivitySet2.this, "开启", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(ActivitySet2.this, "关闭", Toast.LENGTH_SHORT).show();
        }
    }

}