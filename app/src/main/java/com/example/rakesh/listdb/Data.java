package com.example.rakesh.listdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rakesh on 6/11/16.
 */

public class Data extends SQLiteOpenHelper {
    private static final int DbVersion=1;
    private static final String DbName="Database";
    Data(Context context) {
        super(context, DbName, null, DbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create table Test(_id integer primary key,name text,phone text,email text,address text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
