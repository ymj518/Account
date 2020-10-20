package com.example.account.tabbar.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.account.R;

public class ActivitySet7 extends AppCompatActivity {
    private String[] names = {"人民币","美元","日元","港元","欧元","英镑","韩元","泰铢","澳大利亚元","新西兰元","印度尼西亚盾","新加坡元","马来西亚林吉特",
            "巴西雷亚尔","菲律宾比索","俄罗斯卢布","匈牙利福林","比特币","印度卢比","加拿大元","挪威克朗","瑞士法郎","墨西哥比索","捷克克朗","丹麦克朗",};
    private String[] prices = {"CNY","USD","JPY","HKD","EUR","GBP","KRW","THB","AUD","NZD","IDR","SGD","MYR",
            "BRL","PHP","RUB","HUF","BTC","INR","CAD","NOK","CHF","MXN","CZK","DKK",};
    private String[] times = {"7/1","","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1","7/1",};
    private int[] icons = {R.drawable.CNF,R.drawable.USD,
            R.drawable.JPY,R.drawable.HKD,
            R.drawable.EUR,R.drawable.GBP,
            R.drawable.KRW,R.drawable.THB,
            R.drawable.AUD,R.drawable.NZD,
            R.drawable.IDR,R.drawable.SGD,
            R.drawable.MYR,R.drawable.BRL,
            R.drawable.PHP,R.drawable.RUB,
            R.drawable.HUF,R.drawable.BTC,
            R.drawable.INR,R.drawable.CAD,
            R.drawable.NOK,R.drawable.CHF,
            R.drawable.MXN,R.drawable.CZK,
            R.drawable.DKK,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set7);
    }
}