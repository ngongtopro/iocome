package com.doubl3.manageiocome.ViewModel;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.doubl3.manageiocome.R;

public class StatisticsFragment extends Fragment {
    private final String TAG = "StatisticsFragment";
    private StatisticsViewModel statisticsViewModel;


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
        //statisticsViewModel = ViewModelProvider.of(this).get(StatisticsViewModel.class);
        return inflater.inflate(R.layout.fragment_statistics, container, false);
    }
}