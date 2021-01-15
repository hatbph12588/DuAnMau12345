package com.example.duanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String strUserName,strPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("QUẢN LÍ SÁCH");
        setContentView(R.layout.activity_main);
    }


    public void viewNguoiDung(View view) {
        Intent intent=new Intent(MainActivity.this,ListNguoiDungActivity.class);
        startActivity(intent);
    }

    public void viewTheloai(View view) {
        Intent intent=new Intent(MainActivity.this,ListTheLoaiActivity.class);
        startActivity(intent);
    }

    public void viewSach(View view) {
        Intent intent=new Intent(MainActivity.this,ListBook.class);
        startActivity(intent);
    }

    public void viewChungKhoan(View view) {
        Intent intent=new Intent(MainActivity.this,ThongKeDoanhThu.class);
        startActivity(intent);
    }


    public void viewThongKe(View view) {
        Intent intent=new Intent(MainActivity.this,HoaDon.class);
        startActivity(intent);
    }

    public void viewTOP10(View view) {
        Intent intent=new Intent(MainActivity.this,ListLuotSachBanChay.class);
        startActivity(intent);
    }

    public void viewHoaDon(View view) {
        Intent intent=new Intent(MainActivity.this,HoaDon.class);
        startActivity(intent);
    }
}