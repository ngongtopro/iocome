package com.doubl3.manageiocome.view.homepage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.viewmodel.HomePageViewModel;
import com.doubl3.manageiocome.databinding.FragmentHomePageBinding;

public class HomePageFragment extends Fragment {
    private final String TAG = "HomePageFragment";
    public HomePageFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        FragmentHomePageBinding fragmentHPBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_home_page,
                container,
                false);
        HomePageViewModel homePageViewModel = new HomePageViewModel();
        View view = fragmentHPBinding.getRoot();
        fragmentHPBinding.setHomePageViewModel(homePageViewModel);
        return view;
    }
}