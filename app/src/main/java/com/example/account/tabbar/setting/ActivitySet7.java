package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.account.R;

public class ActivitySet7 extends AppCompatActivity implements View.OnClickListener {
    private String[] names = {"人民币","美元","日元","港元","欧元","英镑","韩元","泰铢","澳大利亚元","新西兰元","印度尼西亚","新加坡元","马来西亚",
            "巴西雷亚尔","菲律宾比索","俄罗斯卢布","匈牙利福林","比特币","印度卢比","加拿大元","挪威克朗","瑞士法郎","墨西哥比索","捷克克朗","丹麦克朗",};
    private String[] prices = {"CNY                 ","USD                 ","JPY                  ","HKD                 ","EUR                  ","GDP                 ","KRW                  ","THD                  ","AUD                  ","NZD                   ","IDR                   ","SGD                   ","MYR                   ",
            "BRL                ","PHP                ","RUB                ","HUF                ","BTC                  ","INR                   ","CAD                  ","NOK                  ","CHF                  ","MXN                ","CZK                   ","DKK                   ",};
    private String[] times = {"7/1","","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1",};
    private int[] icons = {R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,
            R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,R.drawable.cnf,R.drawable.hkd,
            R.drawable.jpy,R.drawable.hkd,R.drawable.cnf,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_set7);
        ListView listView = findViewById(R.id.lv);
        findViewById(R.id.arrow).setOnClickListener(this);
        MyBaseAdapter adapter = new MyBaseAdapter();
        listView.setAdapter(adapter);
    }
    public class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {  //获取item总数
            return prices.length;
        }

        @Override
        public Object getItem(int position) {    //返回item的数据对象
            return prices[position];
        }

        @Override
        public long getItemId(int position) {   //返回item的id
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { //获取item的view视图
            //将list_item.xml文件转换为view对象
            View view = View.inflate(ActivitySet7.this,R.layout.activity_list_item1,null);

            //初始化view对象（activity_list_item）的控件
            TextView name = view.findViewById(R.id.tv_name);
            TextView title = view.findViewById(R.id.tv_title);
            TextView price = view.findViewById(R.id.tv_price);
            ImageView iv = view.findViewById(R.id.iv_pic);

            name.setText(names[position]);
            price.setText(prices[position]);
            iv.setImageResource(icons[position]);
            return view;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.arrow:
                Intent intent = new Intent(this, Setting.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}