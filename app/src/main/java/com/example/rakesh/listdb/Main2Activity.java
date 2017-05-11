package com.example.rakesh.listdb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView lv;
    Data data;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=(ListView)findViewById(R.id.listView);
        data=new Data(Main2Activity.this,"Table",null,1);
        db=data.getReadableDatabase();
        Cursor c=db.rawQuery("Select * from Test",null);
        c.moveToFirst();
        do {
            MyAdapter myAdapter=new MyAdapter(Main2Activity.this,c);
            lv.setAdapter(myAdapter);
        }while (c.moveToNext());
    }
}
