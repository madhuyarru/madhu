package com.example.finalfirebase;

//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
class users{
    public String name,email;
    public long phone;
    public String gender;
    public users(String name, String email,long phone,String  gender){
        this.name=name;this.email=email;this.phone=phone;
        this.gender=gender;
    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users").child("kapil");
        myRef.push().setValue(new users("KapiDev","KapiDev@gmail.com",1256466,"m"));
        Log.d("msg : ","inserted");

        DatabaseReference myRefRead = database.getReference("users");
        myRefRead.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("datafromdb",snapshot.getValue().toString());
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
                    Log.d("datafromdb",dataSnapshot.getValue().toString());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}