package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id;
    EditText password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.id);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.getText().toString().equals("madhu") && (password.getText().toString().equals("admin")))
                {
                    Intent i=new Intent(getApplicationContext(),second.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_LONG).show();

        }
    });
}
}