package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

public class dbhandler extends SQLiteOpenHelper {
    private static final String dbname="DatabaseSQLite";
    private static final int dbversion=1;
    private static final String tablename="userdata";
    private static final String id="id";
    private static final String vname="vname";
    private static final String pname="pname";
    private static final String type="pname";



    public dbhandler(@Nullable Context context) {
        super(context, dbname, null, dbversion);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table userdata(id TEXT ,vname TEXT,pname TEXT,type TEXT)");
    }

    public void addnewdetails(String vid,String vvname,String vpname,String vtype){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();
        val.put(id,vid);
        val.put(vname,vvname);
        val.put(pname,vpname);
        val.put(type,vtype);
        db.insert(tablename,null,val);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + tablename);
        onCreate(db);
    }
    public Boolean updatedata(String sid, String svname, String spname,String stype)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("vname", svname);
        contentValues.put("pname", spname);
        contentValues.put("type", stype);
        Cursor cursor = DB.rawQuery("Select * from userdata where id=?", new String[]{id});
        if (cursor.getCount() >= 0)
        {
            long result = DB.update("userdata", contentValues, "id=?", new String[]{id});

            if (result == -1)
            {
                return false;
            } else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
    public Boolean delete(String id)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from userdata where id=?", new String[]{id});
        if (cursor.getCount() >= 0)
        {
            long result = DB.delete("userdata","id=?",new String[]{id});
            if (result == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }


    public boolean searchdata(String id, String svname, String spname,String stype)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        String query="select * from userdata";
        Cursor c=db.rawQuery(query,null);
        Log.d("total rows",c.getCount()+"");
        while(c.moveToNext())
        {
            Log.d("name",c.getString(0));
            Log.d("id",c.getString(1)+"");
            Log.d("type:",c.getString(2)+"");
            Log.d("type2:",c.getString(3)+"");
        }
        return true;
    }
}