package com.example.lenovo.luckyge.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.luckyge.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoInfoFragment extends Fragment {


    public CoInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle     savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_co_info, container, false);
    }


}
