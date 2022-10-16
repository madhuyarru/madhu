package com.example.has;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.has.R;
import com.example.has.dbhandler;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        dbhandler dBhandler=new dbhandler(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dBhandler.insert(e1.getText().toString(),e2.getText().toString());
                e1.setText("");
            }
        });
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dBhandler.get();
            }
        });
    }
}