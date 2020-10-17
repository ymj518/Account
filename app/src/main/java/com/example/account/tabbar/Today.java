package com.example.account.tabbar;

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


public class Today extends AppCompatActivity implements View.OnClickListener  {
private String[] names = {"餐饮","娱乐","书籍","服饰","社交","住房","日用","美容","长辈","烟酒","汽车","房贷","数码",};
    private String[] prices = {"-$180","-$268","-$39.9","-$89.9","-$298","-$1500","-$8","-$1099","-$1000","-$100",
            "-$79999","-$120000","-$20000",};
    private String[] times = {"7/1","","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1",};
private int[] icons = {R.drawable.canyin,R.drawable.yule,
        R.drawable.shuji,R.drawable.yifu,
        R.drawable.shejiao,R.drawable.zhufang,
        R.drawable.riyong,R.drawable.meirong,
        R.drawable.zhangbei,R.drawable.yanjiu,
        R.drawable.qiche,R.drawable.fangdai,
        R.drawable.shuma,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        ListView listView = findViewById(R.id.lv);
        MyBaseAdapter adapter = new MyBaseAdapter();
        listView.setAdapter(adapter);
        //靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联

        findViewById(R.id.btn_execise).setOnClickListener(this);
        findViewById(R.id.btn_message).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
    }
class MyBaseAdapter extends BaseAdapter{

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
        View view = View.inflate(Today.this,R.layout.activity_list_item,null);

        //初始化view对象（activity_list_item）的控件
        TextView name = view.findViewById(R.id.tv_name);
        TextView title = view.findViewById(R.id.tv_title);
        TextView price = view.findViewById(R.id.tv_price);
        ImageView iv = view.findViewById(R.id.iv_pic);

        name.setText(names[position]);
        title.setText(prices[position]);
        price.setText(times[position]);
        iv.setImageResource(icons[position]);
        return view;
    }
}
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_course:
                Intent intent = new Intent(this, Today.class);
                startActivity(intent);
                break;
            case R.id.btn_execise:
                intent = new Intent(this, Tongji.class);
                startActivity(intent);
                break;
            case R.id.btn_message:
                intent = new Intent(this, Zichan.class);
                startActivity(intent);
                break;
            case R.id.btn_my:
                intent = new Intent(this, Setting.class);
                startActivity(intent);
                break;
        }
    }
}