package com.example.hashmap_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"aa");
        hashMap.put(2,"bb");
        hashMap.put(3,"cc");
        hashMap.put(4,"dd");
        hashMap.put(5,"ff");
        hashMap.put(6,"gg");
        hashMap.put(7,"hh");
        hashMap.put(8,"jj");
        showLog("hashMap.put:" + hashMap.toString());  //hashMap{1=aa, 2=bb, 3=cc, 4=dd, 6=ee, 7=ee, 8=ee, 9=ee}
        showLog("hashMap.keySet()" + hashMap.keySet().toString());// hashMap:[1, 2, 3, 4, 6, 7, 8, 9]

//        for(Object key : hashMap.keySet()){
//            showLog("key:" + hashMap.get(key));//key:aa,key:bb
//        }

        ArrayList<Integer> list = new ArrayList<>(hashMap.keySet());
        Log.v("hank"," ArrayList<Integer> list = new ArrayList<>(hashMap.keySet():" + list); //list:[1, 2, 3, 4, 5, 6, 7, 8]
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Log.v("hank","o1:" + o1 +"/o2:" + o2);
                Log.v("hank","o1>o2?1:-1:" + (o1>o2?1:-1));
                return o1>o2?1:-1;
            }
        });

        Iterator<Integer> iterator = list.iterator();
        while ((iterator.hasNext())){
            Integer key = iterator.next();
            String value = hashMap.get(key);
            showLog("key:" + key +"/value:" +value);
        }

    }

    private void showLog(String msg) {
        Log.v("hank", msg.toString());
    }


}
