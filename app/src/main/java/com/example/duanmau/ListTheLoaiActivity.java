package com.example.duanmau;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ListTheLoaiActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_the_loai);
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
    public void startThemTheLoai(View view) {
        intent=new Intent(ListTheLoaiActivity.this,TheLoaiActivity.class);
        startActivity(intent);
    }
}