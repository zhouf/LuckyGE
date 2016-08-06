package com.example.lenovo.luckyge.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.lenovo.luckyge.R;
import com.example.lenovo.luckyge.activity.Comculture;


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

    }

    @Override
    public void onClick(View view) {
//      Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
        Log.i("frgment skip","I will skip to page two");
        Intent intent =new Intent(getActivity(),Comculture.class);
        startActivity(intent);
    }
}
