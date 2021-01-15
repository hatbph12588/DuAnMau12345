package com.example.duanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.duanmau.dao.NguoiDungDao;
import com.example.duanmau.model.Nguoidung;

public class NguoiDungActivity extends AppCompatActivity {
    Button btnThemNguoiDung;
    EditText edUser,edPass,edPhone,edFullName;
    NguoiDungDao nguoiDungDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguoi_dung);
        setTitle("Them Nguoi Dung");
//        btnThemNguoiDung=findViewById(R.id.addUser);
        edUser=findViewById(R.id.edUserName2);
        edPass=findViewById(R.id.edPassword2);
        edPhone=findViewById(R.id.edPhone);
        edFullName=findViewById(R.id.edFullName);
    }

    public void AddUser(View view) {
        nguoiDungDao=new NguoiDungDao(NguoiDungActivity.this);
        Nguoidung nguoidung=new Nguoidung(edUser.getText().toString(),
                edPass.getText().toString(),edPhone.getText().toString(),edFullName.getText().toString());
        if (nguoiDungDao.insertNguoiDung(nguoidung)==1)
        {
            Toast.makeText(NguoiDungActivity.this,"Them thanh cong",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(NguoiDungActivity.this,"Them that bai",Toast.LENGTH_SHORT).show();
        }
    }

    public void loadDS(View view) {
        Intent intent=new Intent(NguoiDungActivity.this,ListNguoiDungActivity.class);
        startActivity(intent);
    }
}