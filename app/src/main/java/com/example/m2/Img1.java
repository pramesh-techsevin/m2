package com.example.m2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Img1 extends Fragment {


    public Img1() {
        // Required empty public constructor
    }


    public static Img1 newInstance() {
        Img1 fragment = new Img1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_img1, container, false);
        return view;
    }

}
