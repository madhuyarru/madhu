package com.example.dialougebox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class DD extends DialogFragment {
    public interface Communication{
        void sendData(ArrayList<String> al);
    }
    Communication c;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        c=(Communication)context;
    }

    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        ArrayList<String> al=new ArrayList<String>();
        AlertDialog.Builder ad=new AlertDialog.Builder(getActivity());
        //ad.setMessage("This is body of dialog box");
        String list[]= getResources().getStringArray(R.array.list);
        //ad.setItems(list,null);
        ad.setMultiChoiceItems(list, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b)
                {
                    al.add(list[i]);

                }
                else if(al.contains(list[i]))
                {
                    al.remove(list[i]);
                }
            }
        });
        ad.setTitle("This is basic");
        ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast t=Toast.makeText(getActivity().getApplicationContext(),"Yes is pressed", Toast.LENGTH_SHORT);
                //Intent intent=new Intent(getActivity(),DD.class);
                //startActivity(intent);
                //t.show();
                /*
                String items="";
                Iterator iterator=al.iterator();
                while(iterator.hasNext())
                {
                    items+=iterator.next()+" ";
                }
                Toast.makeText(getActivity(),items,Toast.LENGTH_SHORT).show();*/
                dismiss();
                c.sendData(al);
            }
        });

        ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast t=Toast.makeText(getActivity().getApplicationContext(), "No is pressed", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        ad.show();
        return ad.create();

    }


}

