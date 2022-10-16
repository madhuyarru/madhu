package com.example.dialougebox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.dialougebox.R;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        Intent i=getIntent();
        String r1=i.getStringExtra("input1");
        t1.setText(r1);
        Intent i1=getIntent();
        String r2=i1.getStringExtra("input2");
        t2.setText(r2);
    }
}