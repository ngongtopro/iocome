package com.doubl3.manageiocome.View.History;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HistoryViewPagerAdapter extends FragmentStateAdapter {

    public HistoryViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HistoryOutcomeFragment();
            case 1:
                return new HistoryUsedMoneyFragment();
            default:
                return new HistoryOutcomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
