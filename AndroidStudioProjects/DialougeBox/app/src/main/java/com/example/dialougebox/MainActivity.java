package com.example.dialougebox;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity implements DD.Communication{
    TextView tv;
    public void sendData(ArrayList<String> al)
    {
        String items="";
        Iterator iterator=al.iterator();
        while(iterator.hasNext())
        {
            items+=iterator.next()+" ";
        }
        tv.setText(items);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv;
        ArrayList al;
        LinearLayout layout;
        public void sendData(ArrayList<String> al)
        {
            String items="";
            Iterator iterator=al.iterator();
            while(iterator.hasNext())
            {
                items+=iterator.next()+" ";
            }
            tv.setText(items);
        }
        tv=findViewById(R.id.tv);
        DD d=new DD();
        //d.show(getSupportFragmentManager(),"a tag");
        d.show(getSupportFragmentManager(),"a tag");
        String list[]=getResources().getStringArray(R.array.list);

    }
}