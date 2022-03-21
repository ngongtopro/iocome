package com.doubl3.manageiocome.di.statistics;

import com.doubl3.manageiocome.di.ViewModelKey;
import com.doubl3.manageiocome.viewmodel.StatisticsViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class StatisticsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(StatisticsViewModel.class)
    public abstract ViewModel bindStatisticsViewModel(StatisticsViewModel viewModel);
}
