package com.example.rakesh.listdb;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Data data;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        data=new Data(MainActivity.this);
        db=data.getWritableDatabase();
    }
    public void insert(View view) {
        ContentValues cv=new ContentValues();
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();
        String s4=ed4.getText().toString();
        cv.put("name",s1);
        cv.put("phone",s2);
        cv.put("email",s3);
        cv.put("address",s4);
        Long rowid=db.insert("Test",null,cv);
    }
    public void read(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
