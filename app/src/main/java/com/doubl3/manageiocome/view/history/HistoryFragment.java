package com.doubl3.manageiocome.view.history;

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

public class HistoryFragment extends Fragment {
    private final String TAG = "HistoryFragment";
    private TabLayout mTabLayout;
    private ViewPager2 mViewPager;
    private HistoryViewPagerAdapter mHistoryViewPagerAdapter;

    public HistoryFragment(){

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
        return inflater.inflate(R.layout.fragment_history, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mTabLayout = getView().findViewById(R.id.history_tab_layout);
        mViewPager = getView().findViewById(R.id.history_view_pager);

        mHistoryViewPagerAdapter = new HistoryViewPagerAdapter(this);
        mViewPager.setAdapter(mHistoryViewPagerAdapter);
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