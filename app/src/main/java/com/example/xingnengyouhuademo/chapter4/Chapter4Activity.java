package com.example.xingnengyouhuademo.chapter4;

import com.example.xingnengyouhuademo.chapter4.activity.MemoryLeakActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Chapter4Activity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("内存泄露", MemoryLeakActivity.class));
    }
}