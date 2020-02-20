package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class comuseActivity extends AppCompatActivity {

    private ArrayList<Integer> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comuse);

        // 안돼 아직,,,
        // this.initData();
        //ViewPager viewPager = findViewById(R.id.viewPager);
        // viewPager.setAdapter(new ViewPagerAdapter(this, imageList));

    }

    public void initData(){
        imageList = new ArrayList<>();

        imageList.add(R.drawable.comuse1);
        imageList.add(R.drawable.comuse2);
    }
}
