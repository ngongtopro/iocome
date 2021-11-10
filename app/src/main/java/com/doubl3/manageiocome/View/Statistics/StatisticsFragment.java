package com.doubl3.manageiocome.View.Statistics;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.doubl3.manageiocome.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class StatisticsFragment extends Fragment {
    private final String TAG = "StatisticsFragment";

    public StatisticsFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_statistics, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TabLayout mTabLayout = getView().findViewById(R.id.tab_layout_statistics);
        ViewPager2 mViewPager = getView().findViewById(R.id.view_pager_statistics);

        StaticticsViewPagerAdapter mStatisticsViewPagerAdapter =
                new StaticticsViewPagerAdapter(this);
        mViewPager.setAdapter(mStatisticsViewPagerAdapter);
        new TabLayoutMediator(mTabLayout, mViewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText(R.string.expense);
                    break;
                case 1:
                    tab.setText(R.string.income);
                    break;
            }
        }).attach();
    }
}