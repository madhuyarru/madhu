package com.example.fragmentexternal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.fragmentexternal.R;

public class blankfragment extends Fragment {
    EditText et1,et2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.activity_blankfrag, container, false);
        et1=view.findViewById(R.id.et1);
        et2=view.findViewById(R.id.et2);
        return view;
    }
    public void receiveData(String username, String password){
        et1.setText(username);
        et2.setText(password);
    }

}