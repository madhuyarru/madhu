package com.example.bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText id1,id2;
        Button button;
        Intent intent = new Intent(MainActivity.this, BActivity.class);
        Bundle bundle = new Bundle();
        bundle. putString ("String", "Value in MainActivity");
        bundle.putInt("int",11);
        intent.putExtra("bundle",bundle);
        startActivity(intent);

    }
}