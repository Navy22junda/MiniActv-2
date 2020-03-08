package com.example.miniactv_2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int repetitions = getIntent().getIntExtra("repetitions", -1);
        String message = getIntent().getStringExtra("message");

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(message);
        for (int i = 1; i < repetitions; i++){
            textView.append(message);
        }


    }
}
