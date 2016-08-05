package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by lenovo on 2016/8/3.
 */
public class welcomeView extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent mainIntent = new Intent(welcomeView.this, MainActivity.class);
                welcomeView.this.startActivity(mainIntent);//跳转到MainActivity
                welcomeView.this.finish();//结束SplashActivity
            }
        }, 3000);//给postDelayed()方法传递延迟参数
        //在自己的分支上做修改
    }
}