package com.example.m2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Img2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    public Img2() {
        // Required empty public constructor
    }


    public static Img2 newInstance() {
        Img2 fragment = new Img2();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_img2, container, false);
        return view;
    }

}
