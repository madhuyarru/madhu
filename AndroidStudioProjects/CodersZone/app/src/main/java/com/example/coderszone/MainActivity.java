package com.example.coderszone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText o1,o2;
    Button add1;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        o1=findViewById(R.id.op1);
        o2=findViewById(R.id.op2);
        add1=findViewById(R.id.add);
        result=findViewById(R.id.res);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(o1.getText().toString());
                float b=Float.parseFloat(o2.getText().toString());
                float c=a+b;
                result.setText(c+"");
            }
        });
    }
}