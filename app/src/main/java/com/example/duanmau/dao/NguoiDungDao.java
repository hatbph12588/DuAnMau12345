package com.example.duanmau.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.util.Log;

import com.example.duanmau.database.DatabaseHelper;
import com.example.duanmau.model.Nguoidung;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDao {
    public DatabaseHelper dbHelper;
    public SQLiteDatabase db;
    public static final String SQL_NGUOI_DUNG="CREATE TABLE Nguoidung (" +
            " username text primary key, " +
            " password text, "+
            " phone text, "+
            " hoTen text"+
            ");";
    public static final String TABLE_NAME="Nguoidung";
    public NguoiDungDao(Context context)
    {
        dbHelper=new DatabaseHelper(context);
        db=dbHelper.getWritableDatabase();
    }
    public int insertNguoiDung(Nguoidung nguoidung)
    {
        ContentValues values=new ContentValues();
        values.put("username",nguoidung.getUsername());
        values.put("password",nguoidung.getPassword());
        values.put("phone",nguoidung.getPhone());
        values.put("hoTen",nguoidung.getHoTen());
        try {
            if (db.insert(TABLE_NAME,null,values)<0){
                return -1;
            }
        }catch (Exception e){
            Log.e("NguoiDungDao",e.getMessage());
        }
        return 1;
    }
    public List<Nguoidung> getAllNguoidung(){
        List<Nguoidung> ls=new ArrayList<Nguoidung>();
        Cursor cursor=db.query(TABLE_NAME,null,null,null,null,null,null);
        cursor.moveToFirst();
        if (cursor.isAfterLast()==false){
            Nguoidung nguoidung=new Nguoidung();
            nguoidung.setUsername(cursor.getString(0));
            nguoidung.setPassword(cursor.getString(1));
            nguoidung.setPhone(cursor.getString(2));
            nguoidung.setHoTen(cursor.getString(3));
            ls.add(nguoidung);
        }
        cursor.close();
        return ls;
    }
}
