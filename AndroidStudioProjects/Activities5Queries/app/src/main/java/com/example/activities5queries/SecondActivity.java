package com.example.activities5queries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText id11,id22,id33,id44,id55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();
        String str1=i.getStringExtra("id1");
        id11=findViewById(R.id.id11);
        id11.setText(str1);

        String str2=i.getStringExtra("id2");
        id22=findViewById(R.id.id22);
        id22.setText(str2);

        String str3=i.getStringExtra("id3");
        id33=findViewById(R.id.id33);
        id33.setText(str3);

        String str4=i.getStringExtra("id4");
        id44=findViewById(R.id.id44);
        id44.setText(str4);

        String str5=i.getStringExtra("id5");
        id55=findViewById(R.id.id55);
        id55.setText(str5);

    }
}