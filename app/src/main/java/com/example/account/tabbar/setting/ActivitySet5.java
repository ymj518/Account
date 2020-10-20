package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.account.R;
import com.example.account.tabbar.today.Today;

public class ActivitySet5 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_set5);
        findViewById(R.id.arrow).setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.arrow:
                Intent intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }

    public void swtichClick(View view){
        Switch sw = (Switch)view;
        boolean isChecked = sw.isChecked();
        if(isChecked){
            Toast.makeText(ActivitySet5.this, "开启", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(ActivitySet5.this, "关闭", Toast.LENGTH_SHORT).show();
        }
    }

}