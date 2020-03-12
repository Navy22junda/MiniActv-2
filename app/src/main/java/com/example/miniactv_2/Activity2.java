package com.example.miniactv_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int repetitions = getIntent().getIntExtra("repetitions", -1);
        String message = getIntent().getStringExtra("message");

        textView = (TextView)findViewById(R.id.textView2);
        textView.setText(message);
        for (int i = 1; i < repetitions; i++){
            textView.append(message);
        }

        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newHelloWorld = textView.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("newString", newHelloWorld);
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
