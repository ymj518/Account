package com.example.account.tabbar.zichan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.account.R;
import com.example.account.tabbar.Tongji;
import com.example.account.tabbar.setting.Setting;
import com.example.account.tabbar.today.Today;


public class Zhanghu extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_zhanghu);
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        findViewById(R.id.iv_back).setOnClickListener(this);
        findViewById(R.id.xianjing).setOnClickListener(this);
        findViewById(R.id.chuxuka).setOnClickListener(this);
        findViewById(R.id.weixinqianbao).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                Intent intent = new Intent(this, Zichan.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.xianjing:
                intent = new Intent(this, Tongji.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.chuxuka:
                intent = new Intent(this, Zichan.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.weixinqianbao:
                intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}