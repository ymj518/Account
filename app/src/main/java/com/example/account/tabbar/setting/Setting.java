package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.account.R;
import com.example.account.tabbar.today.Today;
import com.example.account.tongji.Tongji;
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
        findViewById(R.id.btn_set1).setOnClickListener(this);
        findViewById(R.id.btn_set2).setOnClickListener(this);
        findViewById(R.id.btn_set3).setOnClickListener(this);
        findViewById(R.id.btn_set4).setOnClickListener(this);
        findViewById(R.id.btn_set5).setOnClickListener(this);
        findViewById(R.id.btn_set6).setOnClickListener(this);
        findViewById(R.id.btn_set7).setOnClickListener(this);
        findViewById(R.id.btn_set8).setOnClickListener(this);
        findViewById(R.id.btn_set9).setOnClickListener(this);
        findViewById(R.id.btn_set10).setOnClickListener(this);
        findViewById(R.id.btn_set11).setOnClickListener(this);


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
            case R.id.btn_set1:
                intent = new Intent(this, ActivitySet1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set2:
                intent = new Intent(this, ActivitySet2.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set3:
                intent = new Intent(this, ActivitySet3.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set4:
                intent = new Intent(this, ActivitySet4.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set5:
                intent = new Intent(this, ActivitySet5.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set6:
                intent = new Intent(this, ActivitySet6.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set7:
                intent = new Intent(this, ActivitySet7.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set8:
                intent = new Intent(this, ActivitySet8.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set9:
                intent = new Intent(this, ActivitySet9.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set10:
                intent = new Intent(this, ActivitySet10.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_set11:
                Uri uri = Uri.parse("https://weibo.com/u/5729698185");    //设置跳转的网站
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

                break;

        }
    }
}