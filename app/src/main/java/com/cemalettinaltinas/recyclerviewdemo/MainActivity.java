package com.cemalettinaltinas.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Meyve> meyveArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        meyveArrayList=new ArrayList<>();

        //data
        Meyve cilek=new Meyve("Çilek",R.drawable.cilek);
        Meyve karpuz=new Meyve("Karpuz",R.drawable.karpuz);
        Meyve seftali=new Meyve("Şeftali",R.drawable.seftali);
        Meyve uzum=new Meyve("Üzüm",R.drawable.uzum);

        meyveArrayList.add(cilek);
        meyveArrayList.add(karpuz);
        meyveArrayList.add(seftali);
        meyveArrayList.add(uzum);
        meyveArrayList.add(cilek);
        meyveArrayList.add(karpuz);
        meyveArrayList.add(seftali);
        meyveArrayList.add(uzum);

        BenimAdapter benimAdapter=new BenimAdapter(this,meyveArrayList);
        recyclerView.setAdapter(benimAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}