package com.example.account.tabbar.zichan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.account.R;
import com.example.account.tabbar.Tongji;
import com.example.account.tabbar.setting.Setting;
import com.example.account.tabbar.today.Today;


public class Zichan extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_zichan);
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        findViewById(R.id.btn_course).setOnClickListener(this);
        findViewById(R.id.btn_execise).setOnClickListener(this);
        findViewById(R.id.btn_message).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
        findViewById(R.id.zhanghu).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_course:
                Intent intent = new Intent(this, Today.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_execise:
                intent = new Intent(this, Tongji.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_message:
                intent = new Intent(this, Zichan.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_my:
                intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.zhanghu:
                intent = new Intent(this, Zhanghu.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}