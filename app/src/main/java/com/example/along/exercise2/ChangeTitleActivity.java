package com.example.along.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeTitleActivity extends AppCompatActivity {

    ImageView ivPreview, iv1, iv2, iv3, iv4, iv5, iv6;
    EditText editText;
    Button btSave;
    int color;
    String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);


        ivPreview = findViewById(R.id.ivPreview);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        editText = findViewById(R.id.editText);
        btSave = findViewById(R.id.btSave);

        Intent changeTitle = this.getIntent();
        color = changeTitle.getIntExtra("color",Color.parseColor("#FFFF4081"));
        content = changeTitle.getStringExtra("content");
        ivPreview.setBackgroundColor(color);
        editText.setText(content);


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FFFF4081");
                ivPreview.setBackgroundColor(color);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FFAA66CC");
                ivPreview.setBackgroundColor(color);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FF303F9F");
                ivPreview.setBackgroundColor(color);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FF33B5E5");
                ivPreview.setBackgroundColor(color);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FF669900");
                ivPreview.setBackgroundColor(color);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor("#FF99CC00");
                ivPreview.setBackgroundColor(color);
            }
        });

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("color", color);
                data.putExtra("content", editText.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }

}
