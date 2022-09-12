package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;
    Button btnThem, btnXoa, btnCapNhat;
    EditText editMonhoc;
    ArrayList<String> arrayCourse;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThem = (Button) findViewById(R.id.buttonThem);
        btnXoa = (Button) findViewById(R.id.buttonXoa);
        btnCapNhat = (Button) findViewById(R.id.buttonCapNhat);
        editMonhoc = (EditText) findViewById(R.id.editMonHoc);
        lvMonHoc = (ListView) findViewById(R.id.LIstViewmonhoc);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Android");
        arrayCourse.add("PHP");
        arrayCourse.add("IOS");
        arrayCourse.add("Unity");
        arrayCourse.add("ASP.NET");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCourse
        );

        lvMonHoc.setAdapter(adapter);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = editMonhoc.getText().toString();
                arrayCourse.add(monhoc);
                adapter.notifyDataSetChanged();
            }
        });



        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editMonhoc.setText(arrayCourse.get(i));
                vitri = i;
            }
        });
        btnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vitri != -1){
                    arrayCourse.set(vitri, editMonhoc.getText().toString());
                    adapter.notifyDataSetChanged();
                }
                vitri=-1;
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vitri!=-1){
                    arrayCourse.remove(vitri);
                    adapter.notifyDataSetChanged();
                }
                vitri=-1;
            }
        });

    }
}