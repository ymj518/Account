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
        findViewById(R.id.zhifubao).setOnClickListener(this);
        findViewById(R.id.chongzhika).setOnClickListener(this);
        findViewById(R.id.jijing).setOnClickListener(this);
        findViewById(R.id.gupioa).setOnClickListener(this);
        findViewById(R.id.licai).setOnClickListener(this);
        findViewById(R.id.baoxian).setOnClickListener(this);
        findViewById(R.id.xinyonka).setOnClickListener(this);
        findViewById(R.id.huabei).setOnClickListener(this);
        findViewById(R.id.baitiao).setOnClickListener(this);
        findViewById(R.id.jieru).setOnClickListener(this);
        findViewById(R.id.jiechu).setOnClickListener(this);

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
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.chuxuka:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.weixinqianbao:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.zhifubao:
                intent = new Intent(this,Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.chongzhika:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.jijing:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.gupioa:
                intent = new Intent(this,Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.licai:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.baoxian:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.xinyonka:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.huabei:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.baitiao:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.jieru:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.jiechu:
                intent = new Intent(this, Tianjia.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}