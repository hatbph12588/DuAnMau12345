package com.example.duanmau;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.duanmau.adapter.NguoiDungAdapter;
import com.example.duanmau.dao.NguoiDungDao;
import com.example.duanmau.model.Nguoidung;

import java.util.ArrayList;
import java.util.List;

public class ListNguoiDungActivity extends AppCompatActivity {
   Intent intent;
   public static List<Nguoidung> dsNguoidungs=new ArrayList<>();
   ListView lvNguoidung;
   NguoiDungDao nguoiDungDao;
   NguoiDungAdapter adapter =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_nguoi_dung);
        lvNguoidung=findViewById(R.id.lvNguodung);
        nguoiDungDao=new NguoiDungDao(ListNguoiDungActivity.this);
        dsNguoidungs=nguoiDungDao.getAllNguoidung();
        adapter=new NguoiDungAdapter(ListNguoiDungActivity.this,dsNguoidungs);
        lvNguoidung.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                return true;
//            case R.id.changePass:
//                break;
//            case R.id.logOut:
//                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void startThemNguoiDung(View view) {
        intent=new Intent(ListNguoiDungActivity.this,NguoiDungActivity.class);
        startActivity(intent);
    }


}