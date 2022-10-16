package com.example.dialougebox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dialougebox.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        final int[] t={-1};
        final String[] st={""};
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "list", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("gender");
                final String[] lis1 = new String[]{"female", "male"};

                builder.setSingleChoiceItems(lis1, t[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i1) {
                        t[0] = i1;
                       st[0] += lis1[i1];

                    }

                });

                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i1) {
                        Intent i = new Intent(MainActivity.this, com.example.dialougebox.MainActivity2.class);
                        i.putExtra("input1",st[0]);
                        startActivity(i);
                        dialogInterface.dismiss();
                    }
                });
                builder.create();
                builder.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("languages");
                final String[] lis2 = new String[]{"guntur", "golae"};
                final boolean[] che=new boolean[lis2.length];
                ArrayList<String> al = new ArrayList<String>();
                builder.setMultiChoiceItems(lis2, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        che[i]=b;
                    }
                });
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String has="";
                        for(i=0;i<lis2.length;i++)
                        {
                            if(che[i])
                                has+=lis2[i];
                        }
                        Toast.makeText(MainActivity.this, has, Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(MainActivity.this, com.example.dialougebox.MainActivity2.class);
                        i1.putExtra("input2",has);
                        startActivity(i1);
                    }
                });
                builder.create();
                builder.show();
            }
        });

    }
}