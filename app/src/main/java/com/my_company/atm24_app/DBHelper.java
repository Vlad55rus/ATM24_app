package com.my_company.atm24_app;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//public class DBHelper extends SQLiteOpenHelper {

//    private final Context cont;
//
//    public DBHelper(Context context) {
//        // конструктор суперкласса
//        super(context, "requestDataBase", null, 1);
//        cont = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        //Create table
////        sqLiteDatabase.execSQL("CREATE TABLE requests(id_request INTEGER PRIMARY KEY," +
////                "status INTEGER," +
////                "standart_work TEXT," +
////                "own_works TEXT);");
////        //hash после сверка
//
////        ContentValues values = new ContentValues(); //To add in base
////        Resources resources = cont.getResources();
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
//
//    }
//}
