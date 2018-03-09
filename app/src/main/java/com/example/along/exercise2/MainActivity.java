package com.example.along.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btChangeBG) Button btChangeBG;
    @BindView(R.id.btChangeTitle) Button btChangeTitle;
    @BindView(R.id.tvTitle) TextView tvTitle;
    @BindView(R.id.ivBg) ImageView ivBg;
    public static final int REQUEST_CODE_TITLE = 1001;
    public static final int REQUEST_CODE_BG = 2002;

    @OnClick(R.id.btChangeTitle)
    public void setBtChangeTitle(){
        Intent changeTitle = new Intent(MainActivity.this,ChangeTitleActivity.class);
        changeTitle.putExtra("color",tvTitle.getCurrentTextColor());
        changeTitle.putExtra("content",tvTitle.getText().toString());
        startActivityForResult(changeTitle,REQUEST_CODE_TITLE);
    }

    @OnClick(R.id.btChangeBG)
    public void setBtChangeBG(){
        Intent changeBG = new Intent(MainActivity.this,ChangeBackgroundActivity.class);
        startActivityForResult(changeBG,REQUEST_CODE_BG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK)  {
            if (requestCode == REQUEST_CODE_TITLE) {
                if (data.hasExtra("color")) {
                    tvTitle.setTextColor(data.getIntExtra("color", Color.parseColor("#FFFF4081")));
                }
                if (data.hasExtra("content")) {
                    tvTitle.setText(data.getStringExtra("content"));
                }
            }

            if (requestCode == REQUEST_CODE_BG){

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }
}
