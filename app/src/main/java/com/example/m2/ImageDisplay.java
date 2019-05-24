package com.example.m2;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageDisplay extends AppCompatActivity {
    Button fullscrCloseButton;

    MyPagerAdapter myPagerAdapter;

    int images[] = {R.drawable.img1, R.drawable.img6, R.drawable.img3, R.drawable.img4,R.drawable.img5};
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);



        viewPager = (ViewPager)findViewById(R.id.pager);

        myPagerAdapter = new MyPagerAdapter(ImageDisplay.this, images);
        viewPager.setAdapter(myPagerAdapter);

        Button closebtn = findViewById(R.id.fullscrclosebtn);


        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImageDisplay.this,MainActivity.class);
                startActivity(intent);
            }
        });










    }
}
