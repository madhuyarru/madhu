package com.example.has;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

//import androidx.annotation.Nullable;

public class dbhandler extends SQLiteOpenHelper {
    static final String DB = "two";
    static final String TB = "tw";
    static final String NAME = "name";
    static final String AGE = "age";

    public dbhandler(@Nullable Context context) {
        super(context, dbhandler.DB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table " + TB + "(" + NAME + "TEXT," + AGE + "TEXT )";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insert(String name, String age) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, name);
        contentValues.put(AGE, age);
//        if (sqLiteDatabase.insert(TB, null, contentValues) > 0) {
//            Log.d("hee", "inserted");
//        } else {
//            Log.d("dhee", "notinserted");
//
//        }
        sqLiteDatabase.insert(TB,null,contentValues);
        sqLiteDatabase.close();


    }

    public void get() {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String query="select *from "+TB;
        Cursor cursor=sqLiteDatabase.rawQuery(query,null);
        while(cursor.moveToNext())
        {
            //Log.d("helo",cursor.getString(0)+"");
            Log.d("id",cursor.getString(1)+"");

        }
    }
//    public void update(String name,String age,String nn,String ag)
//    {
//        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
//        ContentValues contentValues=new ContentValues();
//        contentValues.put(NAME,nn);
//        contentValues.put(AGE,ag);
//        sqLiteDatabase.update(TB,contentValues,"name=? and age=?",new String[]{nn,ag+" "});
//    }
}