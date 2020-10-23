package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.account.R;
import com.example.account.tabbar.today.Today;

public class ActivitySet5 extends AppCompatActivity implements View.OnClickListener{
    private String[] names = {"餐饮","娱乐","书籍","母婴","旅行","汽车","烟酒","长辈","交通","服饰","果蔬","数码","宠物",
            "房贷","彩票","日用","美容","零食","社交","住房","通讯","医疗",};
    private int[] icons = {R.drawable.canyin,R.drawable.yule,
            R.drawable.lvxing,R.drawable.lvxing,
            R.drawable.lvxing,R.drawable.qiche,
            R.drawable.yanjiu,R.drawable.zhangbei,R.drawable.jiaotong,R.drawable.yifu,
            R.drawable.guoshu,R.drawable.shuma,R.drawable.chongwu,R.drawable.fangdai,
            R.drawable.caipiao,R.drawable.riyong,R.drawable.meirong,R.drawable.linshi,
            R.drawable.shejiao,R.drawable.zhufang,R.drawable.tongxun,R.drawable.lvxing,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_set5);
        ListView listView = findViewById(R.id.lv);
        findViewById(R.id.arrow).setOnClickListener(this);
        MyBaseAdapter adapter = new MyBaseAdapter();
        listView.setAdapter(adapter);
    }
    public class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {  //获取item总数
            return names.length;
        }

        @Override
        public Object getItem(int position) {    //返回item的数据对象
            return names[position];
        }

        @Override
        public long getItemId(int position) {   //返回item的id
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { //获取item的view视图
            //将list_item.xml文件转换为view对象
            View view = View.inflate(ActivitySet5.this,R.layout.activity_list_item2,null);

            //初始化view对象（activity_list_item）的控件
            TextView name = view.findViewById(R.id.tv_name);
            ImageView iv = view.findViewById(R.id.iv_pic);

            name.setText(names[position]);
            iv.setImageResource(icons[position]);
            return view;
        }
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