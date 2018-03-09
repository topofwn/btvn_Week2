package com.example.along.exercise2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ChangeBackgroundActivity extends AppCompatActivity {

    ImageView imv1, imv2, imv3, imv4, imv5, imv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);

        imv1 = findViewById(R.id.imageView);
        imv2 = findViewById(R.id.imageView2);
        imv3 = findViewById(R.id.imageView3);
        imv4 = findViewById(R.id.imageView4);
        imv5 = findViewById(R.id.imageView5);
        imv6 = findViewById(R.id.imageView6);

        Picasso.with(this).load(R.drawable.shutterstock_130125752_huge).resize(150, 150).centerCrop().into(imv1);
        Picasso.with(this).load(R.drawable.shutterstock_248651677_supersize).resize(150, 150).centerCrop().into(imv2);
        Picasso.with(this).load(R.drawable.shutterstock_280897220_huge).resize(150, 150).centerCrop().into(imv3);
        Picasso.with(this).load(R.drawable.shutterstock_316465280_huge).resize(150, 150).centerCrop().into(imv4);
        Picasso.with(this).load(R.drawable.shutterstock_390660301_huge).resize(150, 150).centerCrop().into(imv5);
        Picasso.with(this).load(R.drawable.shutterstock_333376544_huge).resize(150, 150).centerCrop().into(imv6);

    }
}
