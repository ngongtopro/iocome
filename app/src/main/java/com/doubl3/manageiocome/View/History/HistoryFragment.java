package com.doubl3.manageiocome.View.History;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.doubl3.manageiocome.R;
import com.google.android.material.tabs.TabLayout;

public class HistoryFragment extends Fragment {
    private final String TAG = "HistoryFragment";
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

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
    }
}