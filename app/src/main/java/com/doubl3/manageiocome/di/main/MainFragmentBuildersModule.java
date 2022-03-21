package com.doubl3.manageiocome.di.main;

import com.doubl3.manageiocome.view.ProfileFragment;
import com.doubl3.manageiocome.view.statistics.StatisticsExpenseFragment;
import com.doubl3.manageiocome.view.statistics.StatisticsFragment;
import com.doubl3.manageiocome.view.statistics.StatisticsIncomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract StatisticsFragment contributeStatisticsFragment();

    @ContributesAndroidInjector
    abstract StatisticsExpenseFragment contributeStatisticsExpenseFragment();

    @ContributesAndroidInjector
    abstract StatisticsIncomeFragment contributeStatisticsIncomeFragment();

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();
}
