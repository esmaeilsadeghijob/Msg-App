package com.uni.msgactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MsgActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        // 1
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        // 2
        TextView textView = (TextView)findViewById(R.id.txtView_1);
        textView.setText("Hello "+ name);

    }
}