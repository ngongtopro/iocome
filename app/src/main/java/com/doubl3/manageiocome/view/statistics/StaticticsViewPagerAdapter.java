package com.doubl3.manageiocome.view.statistics;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import dagger.android.support.DaggerFragment;

public class StaticticsViewPagerAdapter extends FragmentStateAdapter {

    public StaticticsViewPagerAdapter(@NonNull DaggerFragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public DaggerFragment createFragment(int position) {
        if (position == 1) {
            return new StatisticsIncomeFragment();
        }
        return new StatisticsExpenseFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
