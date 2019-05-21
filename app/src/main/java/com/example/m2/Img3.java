package com.example.m2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Img3 extends Fragment {


    public Img3() {
        // Required empty public constructor
    }


    public static Img3 newInstance() {
        Img3 fragment = new Img3();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_img3, container, false);
        return view;
    }

}
