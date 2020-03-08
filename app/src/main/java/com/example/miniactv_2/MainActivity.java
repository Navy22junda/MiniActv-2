package com.example.miniactv_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextBye;
    private EditText editTextRepetitions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Els missatges transparents que es mostraran als textEdit
        editTextBye = (EditText)findViewById(R.id.editTextBye);
        editTextBye.setHint("Introduce the bye message");

        editTextRepetitions = (EditText)findViewById(R.id.editTextRepetitions);
        editTextRepetitions.setHint("Introduce a number");

        //Lligo el buton amb la seguent activity
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Guardo els valors que s'introdueixen
                String message = editTextBye.getText().toString();
                String repetitions = editTextRepetitions.getText().toString();
                int rep = Integer.parseInt(repetitions);

                Intent i = new Intent(MainActivity.this, Activity2.class);
                i.putExtra("message", message);
                i.putExtra("repetitions",rep);
                startActivity(i);
            }
        });

    }
}
