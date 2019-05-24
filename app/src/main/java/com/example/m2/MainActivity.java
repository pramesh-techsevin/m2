package com.example.m2;

import android.app.Dialog;
import android.app.backup.FullBackupDataOutput;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button addtocartButton;
    ImageView productimgImageView;
    Dialog builder;
    Button fullScrCloseButton;
    Button QuantityIncreaseButton, QuantityDecreaseButton;
    TextView QuantityTextView;
    int qty = 1;
    String Qun;
    ViewPager productImageviewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView basePriceTextView = findViewById(R.id.productbaseprice);
        strikeThroughText(basePriceTextView);




        addtocartButton = findViewById(R.id.btnaddtocart);
        productimgImageView = findViewById(R.id.imgproduct);
        QuantityIncreaseButton = findViewById(R.id.btnqtyadd);
        QuantityDecreaseButton = findViewById(R.id.btnqtyremove);
        QuantityTextView = findViewById(R.id.qty);


        // Drawable data = productimgImageView.getDrawable();


       // productimgImageView.setOnTouchListener(mTouchListener);

        productimgImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImageDisplay.class);
                startActivity(intent);
            }
        });

        addtocartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyCart.class);
                startActivity(intent);

            }
        });


        QuantityIncreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = qty + 1;
                QuantityTextView.setText("" + qty);
                QuantityDecreaseButton.setVisibility(View.VISIBLE);


            }
        });


        QuantityDecreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qty > 1) {
                    qty = qty - 1;

                    QuantityTextView.setText("" + qty);
                } else {
                    QuantityDecreaseButton.setVisibility(View.INVISIBLE);

                    Toast.makeText(MainActivity.this, "Quantity Must Be Atleast 1", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }

    private void strikeThroughText(TextView price) {
        price.setPaintFlags(price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }















/*
    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {


        @Override
        public boolean onTouch(View v, MotionEvent event) {
            builder = new Dialog(MainActivity.this);

            builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
            builder.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));





            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialogInterface) {
                    //nothing;
                }
            });





            builder.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.MATCH_PARENT);


//            builder.setContentView(R.layout.fullscreen_image_layout);
            builder.setContentView(R.layout.activity_image_display);

            *//*ImageView imgView = builder.findViewById(R.id.imgV);
            imgView.setImageResource(R.drawable.product1);
*//*
            fullScrCloseButton = builder.findViewById(R.id.fullscrclosebtn);


           // productImageviewPager = builder.findViewById(R.id.viewpager);
            //productImageviewPager.setAdapter();


            fullScrCloseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    builder.cancel();
                }
            });





           *//* ViewPager viewPager =  builder.findViewById(R.id.pager);
            MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(myPagerAdapter);
*//*



            builder.show();
            return false;


        }


    };*/


}
