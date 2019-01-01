package com.example.lawrencebattle.iot_final_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelping extends SQLiteOpenHelper {

    public static final String Database = "FinalP";
    public static final String Table = "AlarmUp";
    public static final String Table2 = "AlarmDown";
    public static final String Column = "Armed";


    public DatabaseHelping(Context context,String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table + "");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
