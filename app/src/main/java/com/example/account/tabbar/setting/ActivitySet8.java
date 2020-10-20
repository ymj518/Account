package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import com.example.account.R;
import com.example.account.tabbar.today.Today;

public class ActivitySet8 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_set8);
        findViewById(R.id.arrow).setOnClickListener(this);
        findViewById(R.id.btn_xiazai).setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.arrow:
                Intent intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_xiazai:
                Uri uri = Uri.parse("https://wap.pp.cn/app_z5Wdcxyodcxe/");    //设置跳转的网站
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

                break;
        }
    }
}