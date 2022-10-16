package com.example.chocolate.dialogsexample;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class Dialog1 extends DialogFragment {

    public interface Communication{
        void communicate(Bundle b);
    }
    Communication c;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        c= (Communication) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        ArrayList selectedItems = new ArrayList();
        AlertDialog.Builder ab=new AlertDialog.Builder(getActivity());
        String s[]=getResources().getStringArray(R.array.list);
        /*ab.setMultiChoiceItems(s, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b){
                    selectedItems.add(i);
                }
                else selectedItems.remove(i);
            }
        }).setTitle("Just").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),""+selectedItems.size(),Toast.LENGTH_LONG).show();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });*/
        ab.setSingleChoiceItems(s, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),s[i],Toast.LENGTH_LONG).show();
                Bundle b=new Bundle();
                b.putStringArray("data",s);
                c.communicate(b);
                dismiss();
            }
        }).setTitle("Radio");

        return ab.create();
    }
}
