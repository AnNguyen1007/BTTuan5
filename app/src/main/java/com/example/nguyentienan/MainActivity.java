package com.example.nguyentienan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<MonAn> arrayList_monAn;
    Adapter adapter_monAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList_monAn = new ArrayList<>();
        listView = findViewById(R.id.list_view);
        arrayList_monAn.add(new MonAn("Bánh mì", "Lớn, Nhỏ", "6$", R.drawable.banhmi));
        arrayList_monAn.add(new MonAn("Cơm tấm", "Chả , Trứng", "6$", R.drawable.img));
        arrayList_monAn.add(new MonAn("Lẩu", "Bò , Gà ", "6$", R.drawable.img_1));
        arrayList_monAn.add(new MonAn("Bún ", "Xương , Chả  ", "6$", R.drawable.img_2));
        arrayList_monAn.add(new MonAn("Nước ngọt", "Coca,Sting,... ", "6$", R.drawable.img_3));

        adapter_monAn = new Adapter(MainActivity.this, R.layout.items, arrayList_monAn);
        listView.setAdapter(adapter_monAn);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xoa_item(i);
                return false;
            }
        });

    }

    private void Xoa_item(final int position) {
        AlertDialog.Builder alterDialog = new AlertDialog.Builder(this);
        alterDialog.setTitle("Thông báo");
        alterDialog.setIcon(R.mipmap.ic_launcher);
        alterDialog.setMessage("Bạn có muốn xóa  ?");
        alterDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayList_monAn.remove(position);
                adapter_monAn.notifyDataSetChanged();
            }
        });
        alterDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alterDialog.show();
    }
}