package com.doubl3.manageiocome.di;

import com.doubl3.manageiocome.di.main.MainFragmentBuildersModule;
import com.doubl3.manageiocome.di.statistics.StatisticsViewModelModule;
import com.doubl3.manageiocome.view.MainActivity;
import com.doubl3.manageiocome.view.TestActivity;
import com.doubl3.manageiocome.viewmodel.StatisticsViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {
                    StatisticsViewModelModule.class,
                    MainFragmentBuildersModule.class
            }
    )
    abstract TestActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {
                    StatisticsViewModelModule.class,
                    MainFragmentBuildersModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
