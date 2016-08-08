package com.example.lenovo.luckyge.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lenovo.luckyge.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView map = (TextView)findViewById(R.id.adres);
        map.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
