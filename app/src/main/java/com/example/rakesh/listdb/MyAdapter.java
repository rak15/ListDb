package com.example.rakesh.listdb;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by rakesh on 6/11/16.
 */

public class MyAdapter extends CursorAdapter {
    private LayoutInflater layoutInflater;
    MyAdapter(Context context, Cursor c) {
        super(context, c,0);
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.itemlayout,viewGroup,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tv1=(TextView)view.findViewById(R.id.textView);
        TextView tv2=(TextView)view.findViewById(R.id.textView2);
        TextView tv3=(TextView)view.findViewById(R.id.textView3);
        TextView tv4=(TextView)view.findViewById(R.id.textView4);
        tv1.setText(cursor.getString(cursor.getColumnIndex("name")));
        tv2.setText(cursor.getString(cursor.getColumnIndex("phone")));
        tv3.setText(cursor.getString(cursor.getColumnIndex("email")));
        tv4.setText(cursor.getString(cursor.getColumnIndex("address")));
    }
}
