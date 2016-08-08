package com.example.lenovo.luckyge.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.luckyge.R;

public class ThaiSceneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_scene);
        Button btnbkk = (Button) findViewById(R.id.btn_bkk);
        btnbkk.setOnClickListener(this);
        Button btncm = (Button)findViewById(R.id.btn_cm);
        btncm.setOnClickListener(this);
        Button btnhkt = (Button) findViewById(R.id.btn_hkt);
        btnhkt.setOnClickListener(this);
        Button btnpat = (Button) findViewById(R.id.btn_pattaya);
        btnpat.setOnClickListener(this);
    }

    @Override
    public void onClick(View btn) {
        if(btn.getId()==R.id.btn_bkk){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiBkkActivity.class);
            startActivity(intent);}
        else if(btn.getId()==R.id.btn_cm){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiCmActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.btn_hkt){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiHktActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.btn_pattaya){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiPatActivity.class);
            startActivity(intent);
        }
    }
}
