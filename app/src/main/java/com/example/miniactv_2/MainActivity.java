package com.example.miniactv_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Els missatges transparents que es mostraran als textEdit
        EditText editTextBye = (EditText)findViewById(R.id.editTextBye);
        editTextBye.setHint("Introduce the bye message");

        EditText editTextRepetitions = (EditText)findViewById(R.id.editTextRepetitions);
        editTextRepetitions.setHint("Introduce a number");

        //Guardo els valors que s'introdueixen
        String message = editTextBye.getText().toString();
        String repetitions = editTextRepetitions.getText().toString();
        int rep = Integer.parseInt(repetitions);


    }
}
