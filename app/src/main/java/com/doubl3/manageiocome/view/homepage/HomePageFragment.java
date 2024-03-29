package com.doubl3.manageiocome.view.homepage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.model.Item;
import com.doubl3.manageiocome.model.ItemAdapter;
import com.doubl3.manageiocome.viewmodel.HomePageViewModel;
import com.doubl3.manageiocome.databinding.FragmentHomePageBinding;

import java.util.ArrayList;
import java.util.List;

public class HomePageFragment extends Fragment {
    private final String TAG = "HomePageFragment";
    private RecyclerView mRecycleViewItem;
    private ItemAdapter mItemAdapter;
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
        // Recycle view
        mRecycleViewItem = view.findViewById(R.id.recycle_view_item);
        mItemAdapter = new ItemAdapter(getContext());

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        mRecycleViewItem.setLayoutManager(new LinearLayoutManager(getActivity()));

        mItemAdapter.setData(getListItem());
        mRecycleViewItem.setAdapter(mItemAdapter);
        return view;
    }

    private List getListItem(){
        List<Item> listItem = new ArrayList<>();
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        listItem.add(new Item("Bua trua", 30000, -1));
        return listItem;
    }
}