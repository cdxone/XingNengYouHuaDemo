package com.example.xingnengyouhuademo.chapter4.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xingnengyouhuademo.R;
import com.example.xingnengyouhuademo.chapter4.utils.MyActivityManager;


public class MemoryLeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_leak);
        ImageView iv = findViewById(R.id.iv);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.test);
        iv.setImageBitmap(bitmap);
        MyActivityManager.add(this);
    }
}
