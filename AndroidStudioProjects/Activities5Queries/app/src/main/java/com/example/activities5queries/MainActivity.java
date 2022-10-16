package com.example.activities5queries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id1,id2,id3,id4,id5;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id1=findViewById(R.id.id1);
        id2=findViewById(R.id.id2);
        id3=findViewById(R.id.id3);
        id4=findViewById(R.id.id4);
        id5=findViewById(R.id.id5);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),SecondActivity.class);

                i.putExtra("id1",id1.getText().toString());
                i.putExtra("id2",id2.getText().toString());
                i.putExtra("id3",id3.getText().toString());
                i.putExtra("id4",id4.getText().toString());
                i.putExtra("id5",id5.getText().toString());
                startActivity(i);


            }
        });

    }
}