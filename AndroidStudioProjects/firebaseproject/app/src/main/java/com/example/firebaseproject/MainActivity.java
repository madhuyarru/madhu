package com.example.firebaseproject;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,id,course;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        id=findViewById(R.id.id);
        course=findViewById(R.id.course);
        add=findViewById(R.id.add);
        studentref= FirebaseDatabase.getInstance().getReference().child("Students");
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertvalues();
            }
        });



    }
    private void insertvalues()
    {
        String s1=name.getText().toString();
        String s2=id.getText().toString();
        String s3=course.getText().toString();
        Students obj=new Students(s1,s2,s3);
        studentdbref.push().setValue(obj);
        Toast.makeText(MainActivity.this,"data inserted",Toast.LENGTH_SHORT).show();

    }
}



