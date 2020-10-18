package com.example.account.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.account.R;
import com.example.account.tabbar.setting.Setting;


public class Login extends AppCompatActivity implements View.OnClickListener {
    private EditText etUsername;
    private EditText etPassword;
    private CheckBox cbAutoLogin;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_login);
        etUsername = findViewById(R.id.et_name);
        etPassword = findViewById(R.id.et_password);
        cbAutoLogin = findViewById(R.id.ck_zd);
        btnLogin = findViewById(R.id.btn_input);

        //3.设置按钮的监听器
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        findViewById(R.id.btn_input).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_input:
                Intent intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }

    private void login(){
        //3.1获取用户名和密码的值
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString();
        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            Toast.makeText(this,"用户名或密码不能为空",Toast.LENGTH_LONG).show();
            return;
        }

        //3.2.比较用户名和密码是否正确，然后给出提示
        if("android".equals(username) && "123456".equals(password)){
            Toast.makeText(this,"登陆成功",Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this,Setting.class);
            intent.putExtra("username",username);
            startActivity(intent);
        }else{
            Toast.makeText(this,"用户名或密码不正确",Toast.LENGTH_LONG).show();
        }
    }
}