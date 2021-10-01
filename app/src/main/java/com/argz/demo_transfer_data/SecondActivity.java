package com.argz.demo_transfer_data;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent() != null){
            String message = getIntent().getExtras().getString("message");

            TextView textView = findViewById(R.id.tv_meessage);
            textView.setText(message);
        }
    }
}