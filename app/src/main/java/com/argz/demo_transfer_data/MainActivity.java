package com.argz.demo_transfer_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.et_send_message);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message", editText.getText().toString());
        startActivity(intent);
    }



//    The structure of a method
//    [public/private/protected] [return_type] [name_of_method] (parameters...) {}
    private void printText(String message){
        Log.d(TAG, "printText: " + message);
    }

//    public void sendMessage(View view) {
//        EditText editText = findViewById(R.id.et_send_message);
//        String message = editText.getText().toString();
//        printText(message);
//    }
}