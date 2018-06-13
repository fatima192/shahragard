//package com.example.asus.proto5phase3;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
//public class DatabaseHelper extends SQLiteOpenHelper {
//    public static final String DATABASE_NAME = "trips.db";
//    public static final String TABLE_NAME = " create table trips_table";
//
//    // public static final String COL_1= "Driver";
//    public static final String COL_1 = "Origin";
//    public static final String COL_2 = "Destination";
//    public static final String COL_3 = "Day";
//    public static final String COL_4 = "Month";
//    public static final String COL_5 = "time";
//    public static final String COL_6 = "Seats_num";
//    //public static final String COL_7= "Exp";
//
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, 1);
//        SQLiteDatabase db = this.getWritableDatabase();
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        Log.e("6","6");
//        db.execSQL(
//                "create table trips " +
//                        "(origin Text , Destination text,Day integer, Month integer,Time text,Seats_num integer)"
//        );
//        Log.e("5","5 ");
////        db.execSQL( TABLE_NAME + ("Origin TEXT, Destination TEXT, DAY INTEGER , Month INTEGER , time TEXT, Seats_num INTEGER ") );
//
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
////        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
////        onCreate(db);
//
//
//    }
//
//    public boolean insertData(String Origin, String Destination, String Day, String Month, String time, String Seats_num) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(COL_1, Origin);
//        contentValues.put(COL_2, Destination);
//        contentValues.put(COL_3, Day);
//        contentValues.put(COL_4, Month);
//        contentValues.put(COL_5, time);
//        contentValues.put(COL_6, Seats_num);
//        // contentValues.put(COL_7, Exp);
//        Long result = db.insert("trips", null, contentValues);
//        if (result == -1)
//            return false;
//        else
//            return true;
//    }
//
//
//    public Cursor getAllData() {
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor res = db.rawQuery(TABLE_NAME, null);
//        return res;
//
//
//    }
//
//}
