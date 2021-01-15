package com.example.duanmau.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.duanmau.R;
import com.example.duanmau.model.Nguoidung;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungAdapter extends BaseAdapter {
    public Activity context;
    public List<Nguoidung> arrNguoiDung;
    public LayoutInflater inflater;
    public NguoiDungAdapter(Activity context, List<Nguoidung> arrNguoidungs)
    {
        super();
        this.context=context;
        this.arrNguoiDung=arrNguoidungs;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return arrNguoiDung.size();
    }

    @Override
    public Object getItem(int position) {
        return arrNguoiDung.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder=new ViewHolder();
            convertView= inflater.inflate(R.layout.item_nguoi_dung,null);
            holder.img=(ImageView)convertView.findViewById(R.id.ivIcon);
            holder.txtName=(TextView)convertView.findViewById(R.id.tvName);
            holder.txtPhone=(TextView)convertView.findViewById(R.id.tvPhone);
            holder.imgDelete=(ImageView)convertView.findViewById(R.id.ivDelete);

            holder.imgDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder)convertView.getTag();
        }
        Nguoidung nguoidung=arrNguoiDung.get(position);
        holder.txtName.setText(nguoidung.getUsername());
        holder.txtPhone.setText(nguoidung.getPhone());
        return convertView;
    }
    public static class ViewHolder{
        public ImageView img;
        public TextView txtName;
        public TextView txtPhone;
        public ImageView imgDelete;
    }
}
