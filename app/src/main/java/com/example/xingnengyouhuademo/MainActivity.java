package com.example.xingnengyouhuademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.xingnengyouhuademo.chapter4.Chapter4Activity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {
    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("第四章：内存优化", Chapter4Activity.class));
    }
}