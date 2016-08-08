package com.example.lenovo.luckyge.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lenovo.luckyge.R;
import com.example.lenovo.luckyge.activity.AboutActivity;
import com.example.lenovo.luckyge.activity.Comculture;
import com.example.lenovo.luckyge.activity.ThaiSceneActivity;
import com.example.lenovo.luckyge.activity.WebGuidesActivity;
import com.example.lenovo.luckyge.activity.WebLinesActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment implements View.OnClickListener {


    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false);

    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button cocul = (Button) getView().findViewById(R.id.cocul);
        cocul.setOnClickListener(this);
        Button trguide = (Button) getView().findViewById(R.id.trguide);
        trguide.setOnClickListener(this);
        Button thaiscene = (Button) getView().findViewById(R.id.thaiscene);
        thaiscene.setOnClickListener(this);
        Button file = (Button) getView().findViewById(R.id.file);
        file.setOnClickListener(this);
        Button aboutus = (Button) getView().findViewById(R.id.aboutus);
        aboutus.setOnClickListener(this);
    }

    @Override
    public void onClick(View btn) {
//      Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
        Log.i("frgment skip","I will skip to page two");
        if(btn.getId()==R.id.cocul){
        Intent intent =new Intent(getActivity(),Comculture.class);
        startActivity(intent);}
        else if(btn.getId()==R.id.trguide){
            Intent intent =new Intent(getActivity(),WebGuidesActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.thaiscene){
            Intent intent =new Intent(getActivity(),ThaiSceneActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.file){
            Intent intent =new Intent(getActivity(),WebLinesActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.aboutus){
            Intent intent =new Intent(getActivity(),AboutActivity.class);
           startActivity(intent);
        }
    }
}
