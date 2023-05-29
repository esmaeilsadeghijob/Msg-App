package com.uni.msgactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view){
        //1
        EditText editText = (EditText)findViewById(R.id.editText_1);
        String name = editText.getText().toString();

        //2
        Intent intent = new Intent(this, MsgActivity.class);
        intent.putExtra("NAME", name);

        //3
        startActivity(intent);

    }
}