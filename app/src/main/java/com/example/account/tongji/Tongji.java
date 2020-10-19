package com.example.account.tongji;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.account.R;
import com.example.account.tabbar.setting.Setting;
import com.example.account.tabbar.today.Jsq;
import com.example.account.tabbar.today.Today;
import com.example.account.tabbar.zichan.Zichan;


public class Tongji extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_tongji);
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        findViewById(R.id.btn_course).setOnClickListener(this);
        findViewById(R.id.btn_execise).setOnClickListener(this);
        findViewById(R.id.btn_message).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
        findViewById(R.id.tv_time).setOnClickListener(this);
        Button buttonNormal = (Button) findViewById(R.id.btn_1);
        Button buttonNorma2 = (Button) findViewById(R.id.btn_2);
        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        buttonNorma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma3 = (Button) findViewById(R.id.btn_3);
        buttonNorma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma4 = (Button) findViewById(R.id.btn_4);
        buttonNorma4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma5 = (Button) findViewById(R.id.btn_5);
        buttonNorma5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma6 = (Button) findViewById(R.id.btn_6);
        buttonNorma6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma7 = (Button) findViewById(R.id.btn_7);
        buttonNorma7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma8 = (Button) findViewById(R.id.btn_8);
        buttonNorma8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma9 = (Button) findViewById(R.id.btn_9);
        buttonNorma9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma10 = (Button) findViewById(R.id.btn_10);
        buttonNorma10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma11 = (Button) findViewById(R.id.btn_11);
        buttonNorma11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma12 = (Button) findViewById(R.id.btn_12);
        buttonNorma12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma13 = (Button) findViewById(R.id.btn_13);
        buttonNorma13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma14 = (Button) findViewById(R.id.btn_14);
        buttonNorma14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma15 = (Button) findViewById(R.id.btn_15);
        buttonNorma15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma16 = (Button) findViewById(R.id.btn_16);
        buttonNorma16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma17 = (Button) findViewById(R.id.btn_17);
        buttonNorma17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma18 = (Button) findViewById(R.id.btn_18);
        buttonNorma18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma19 = (Button) findViewById(R.id.btn_19);
        buttonNorma19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma20 = (Button) findViewById(R.id.btn_20);
        buttonNorma20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma21 = (Button) findViewById(R.id.btn_21);
        buttonNorma21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma22 = (Button) findViewById(R.id.btn_22);
        buttonNorma22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma23 = (Button) findViewById(R.id.btn_23);
        buttonNorma23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma24 = (Button) findViewById(R.id.btn_24);
        buttonNorma24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
        Button buttonNorma25 = (Button) findViewById(R.id.btn_25);
        buttonNorma25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma26 = (Button) findViewById(R.id.btn_26);
        buttonNorma26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma27 = (Button) findViewById(R.id.btn_27);
        buttonNorma27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma28 = (Button) findViewById(R.id.btn_28);
        buttonNorma28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma29 = (Button) findViewById(R.id.btn_29);
        buttonNorma29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });Button buttonNorma30 = (Button) findViewById(R.id.btn_30);
        buttonNorma30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });;Button buttonNorma31 = (Button) findViewById(R.id.btn_31);
        buttonNorma31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalDialog();
            }
        });
    }

    private void showNormalDialog(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(Tongji.this);
        normalDialog.setTitle("系统提示");
        normalDialog.setMessage("该日无记录，要添加一天新帐目吗？?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                        dialog.dismiss();
                        Intent intent = new Intent(Tongji.this, Jsq.class);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                    }
                });
        normalDialog.setNegativeButton("关闭",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        // 显示
        normalDialog.show();
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
            case R.id.tv_time:
                intent = new Intent(this, Yuedu.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
//            case R.id.btn_1:
//                intent = new Intent(this, Setting.class);
//                startActivity(intent);
//                overridePendingTransition(0, 0);
//                break;
        }
    }
}