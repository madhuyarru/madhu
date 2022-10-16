package com.example.sample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button op,cp,mod,div,seven,eight,nine,mul,four,five,six,minus,one,two,three,plus,dot,zero,clear,equalto,del;
    float n1,n2;
    boolean tvadd,tvsub,tvmul,tvdiv,tvmod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        del=findViewById(R.id.del);
        op=findViewById(R.id.op);
        cp=findViewById(R.id.cp);
        mod=findViewById(R.id.mod);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        equalto=findViewById(R.id.equalto);
        clear=findViewById(R.id.clear);
        dot=findViewById(R.id.dot);
        tv=findViewById(R.id.tv);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv==null)
                {
                    tv.setText("");
                }
                else
                {
                    n1=Float.parseFloat(tv.getText()+"");
                    tvadd=true;
                    //tv.setText(tv.getText()+"+");
                    tv.setText("");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(tv.getText()+"");
                tvsub=true;
                //tv.setText(tv.getText()+"+");
                tv.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(tv.getText()+"");
                tvmul=true;
                //tv.setText(tv.getText()+"+");
                tv.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(tv.getText()+"");
                tvdiv=true;
                //tv.setText(tv.getText()+"+");
                tv.setText("");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(tv.getText()+"");
                tvmod=true;
                tv.setText("");

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });
        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2=Float.parseFloat(tv.getText()+"");
                if(tvadd==true)
                {
                    tv.setText(n1+n2+"");
                    tvadd=false;
                }
                if(tvsub==true)
                {
                    tv.setText(n1-n2+"");
                    tvsub=false;
                }
                if(tvmul==true)
                {
                    tv.setText(n1*n2+"");
                    tvmul=false;
                }
                if(tvdiv==true)
                {
                    tv.setText(n1/n2+"");
                    tvdiv=false;
                }
                if(tvmod==true)
                {
                    tv.setText(n1%n2+"");
                    tvmod=false;
                }
            }
        });


    }
}