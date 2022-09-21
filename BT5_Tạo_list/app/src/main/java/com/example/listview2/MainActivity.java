package com.example.listview2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvNameFood;
    ArrayList<Food> arrayFood;
    Food_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AnhXa();

        adapter = new Food_Adapter(this, R.layout.food, arrayFood);
        lvNameFood.setAdapter(adapter);

        lvNameFood.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                XacNhanXoa(i);

                return false;
            }
        });
    }
    private  void XacNhanXoa(int position){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông báo");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("Bạn có muốn xoá mon ăn này không?");

        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayFood.remove(position);
                adapter.notifyDataSetChanged();

            }
        });
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }

    private void AnhXa(){
        lvNameFood = (ListView) findViewById(R.id.viewMonAn);
        arrayFood = new ArrayList<>();
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));
        arrayFood.add(new Food("Bo luc Lac","Sieu ngon sieu cay","6$",R.drawable.bopbubu));

    }
}