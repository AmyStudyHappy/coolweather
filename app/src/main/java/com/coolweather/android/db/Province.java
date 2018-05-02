package com.coolweather.android.db;

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;

import org.litepal.crud.DataSupport;

/**
 * Created by wxm on 18/5/1.
 */

//public class Province extends SQLiteOpenHelper {
//
//    public static final String CREATE_PROViNCE = "CREATE TABLE provice(id integer autoincrement primary key, proviceName varchar(64), proviceCode integer)";
//    private Context mContext;
//
//    public Province(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
//        super(context, name, factory, version);
//        mContext = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db){
//        db.execSQL(CREATE_PROViNCE);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
//    }
//}

public class Province extends DataSupport{

    private int id;
    private String proviceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProviceName(){
        return proviceName;
    }

    public void setProviceName(String proviceName){
        this.proviceName = proviceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}

