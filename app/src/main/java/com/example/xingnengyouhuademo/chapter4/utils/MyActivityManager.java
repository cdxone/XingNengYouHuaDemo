package com.example.xingnengyouhuademo.chapter4.utils;

import android.app.Activity;

import java.util.ArrayList;

public class MyActivityManager {
    static ArrayList<Activity> list = new ArrayList<>();

    public static void add(Activity activity){
        list.add(activity);
    }
}
