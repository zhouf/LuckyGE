package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button culture =(Button)findViewById(R.id.culture);
        Button service =(Button)findViewById(R.id.service);
        Button build =(Button)findViewById(R.id.build);
        Button advant =(Button)findViewById(R.id.advant);
        culture.setOnClickListener(this);
        service.setOnClickListener(this);
        build.setOnClickListener(this);
        advant.setOnClickListener(this);

    }
    public void onClick(View but) {
        if(but.getId()==R.id.culture){
            Intent introintent = new Intent(MainActivity.this,ComtureActivity.class);
            startActivity(introintent);
//                MainActivity.this.finish();
            Log.i("introduction","I can skip to intronduction");
        }else if(but.getId()==R.id.service){
            Intent servintent = new Intent(MainActivity.this,ServiActivity.class);
            startActivity(servintent);
            Log.i("service","I can skip to ServiActivity");
        }else if(but.getId()==R.id.build){
            Intent bulidintent = new Intent(MainActivity.this,BuildActivity.class);
            startActivity(bulidintent);
            Log.i("bulidintent","I can skip to BuildActivity");
        }else if(but.getId()==R.id.advant){
            Intent advanintent = new Intent(MainActivity.this,AdvantActivity.class);
            startActivity(advanintent);
            Log.i("advanintent","I can skip to AdvantActivity");
        }


    }

}
