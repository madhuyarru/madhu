package com.example.fragmentexternal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etu, etp;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etu = findViewById(R.id.editTextTextPersonName4);
        etp = findViewById(R.id.editTextTextPersonName5);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blankfragment frag = (blankfragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
                frag.receiveData(etu.getText().toString(), etp.getText().toString());

            }
        });

    }
}