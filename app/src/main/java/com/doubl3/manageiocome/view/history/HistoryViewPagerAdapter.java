package com.doubl3.manageiocome.view.history;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HistoryViewPagerAdapter extends FragmentStateAdapter {

    public HistoryViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new HistoryIncomeFragment();
            default:
                return new HistoryExpenseFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
