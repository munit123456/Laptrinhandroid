package com.example.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Food_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> FoodList;

    public Food_Adapter(Context context,int layout, List<Food> foodList){
        this.context = context;
        this.layout = layout;
        this.FoodList = foodList;
    }

    @Override
    public int getCount() { return FoodList.size();}

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoler{
        ImageView ImgHinh;
        TextView txtTen, txtMota, txtSoTien;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoler holer;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holer = new ViewHoler();

            holer.txtTen = (TextView) view.findViewById(R.id.textViewTen);
            holer.txtMota = (TextView) view.findViewById(R.id.textViewMoTa);
            holer.txtSoTien = (TextView) view.findViewById(R.id.textViewTien);
            holer.ImgHinh = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(holer);
        }else {
            holer = (ViewHoler) view.getTag();
        }

        Food thoiTiet = FoodList.get(i);

        holer.txtTen.setText(thoiTiet.getTen());
        holer.txtMota.setText(thoiTiet.getMoTa());
        holer.txtSoTien.setText(thoiTiet.getSoTien());
        holer.ImgHinh.setImageResource(thoiTiet.getHinhMonAn());

        return view;
    }


}
