package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.account.R;
import com.example.account.tabbar.today.Today;
import com.example.account.tabbar.Tongji;
import com.example.account.tabbar.zichan.Zichan;


public class Setting extends AppCompatActivity implements View.OnClickListener  {
    private TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_setting);
        tvUsername = findViewById(R.id.tv_username);
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        findViewById(R.id.btn_course).setOnClickListener(this);
        findViewById(R.id.btn_execise).setOnClickListener(this);
        findViewById(R.id.btn_message).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("username");
            tvUsername.setText(name);
        }
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
        }
    }
}