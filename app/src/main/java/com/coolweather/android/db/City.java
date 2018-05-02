package com.coolweather.android.db;

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;

import org.litepal.crud.DataSupport;

/**
 * Created by wxm on 18/5/1.
 */

//public class City extends SQLiteOpenHelper {
//
//    private static final String CREATE_CITY = "CREATE TABLE city(id integer autoincrement primary key, cityName varchar(64), cityCode integer, provinceId integer)";
//    private Context mContext;
//
//    public City(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
//        super(context, name, factory, version);
//        mContext = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db){
//        db.execSQL(CREATE_CITY);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
//    }
//}

public class City extends DataSupport{

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}