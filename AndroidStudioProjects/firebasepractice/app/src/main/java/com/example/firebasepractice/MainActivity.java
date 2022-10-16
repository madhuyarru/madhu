package com.example.firebasepractice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,id,email;
    Button insert;
    FirebaseDatabase fb;
    DatabaseReference dbref;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        id=findViewById(R.id.id);
        email=findViewById(R.id.mail);
        fb =FirebaseDatabase.getInstance();
        insert.setOnClickListener(view -> {
            dbref=fb.getReference("database").child(name.getText().toString());
            Users use=new Users(name.getText().toString(),id.getText().toString(),email.getText().toString());
            dbref.setValue(use);
            Toast.makeText(MainActivity.this,"inserted",Toast.LENGTH_SHORT).show();

        });
    }
}