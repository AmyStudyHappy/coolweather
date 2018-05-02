package com.coolweather.android.db;

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;

import org.litepal.crud.DataSupport;

/**
 * Created by wxm on 18/5/1.
 */

//public class County extends SQLiteOpenHelper {
//
//    private static final String CREATE_COUNTY = "create table county(id integer autoincrement primary key, countyName varchar(64), weatherId varchar(20), cityId integer)";
//    private Context mContext;
//
//    public County(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
//        super(context, name, factory, version);
//        mContext = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db){
//        db.execSQL(CREATE_COUNTY);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
//    }
//}


public class County extends DataSupport{

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}