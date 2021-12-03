package com.doubl3.manageiocome.view.statistics;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class StaticticsViewPagerAdapter extends FragmentStateAdapter {

    public StaticticsViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
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
