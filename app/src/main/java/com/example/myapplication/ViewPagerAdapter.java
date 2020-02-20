package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<Integer> imageList;

    public ViewPagerAdapter(Context mContext, ArrayList<Integer> imageList) {
        this.mContext = mContext;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    // 데이터리스트에서 인자로 넘어온 position에 해당하는 아이템 항목에 대한 페이지를 생성
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.viewpager, container, false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

        imageView.setImageResource(imageList.get(position));

        container.addView(view);

        return view;
    }

    @Override
    // Adapter가 관리하는 데이터 리스트의 총 개수
    public int getCount() {
        return imageList.size();
    }

    @Override
    // Adapter가 관리하는 데이터 리스트에서 인자로 넘어온 position에 해당하는 데이터 항목을 생성된 페이지를 제거
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.invalidate();
    }

    @Override
    // 페이지가 특정 키와 연관되는지 체크
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (View)object);
    }
}
