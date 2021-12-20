package com.doubl3.manageiocome.view.statistics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.model.Item;
import com.doubl3.manageiocome.model.ItemAdapter;
import com.doubl3.manageiocome.view.user.UserListAdapter;
import com.doubl3.manageiocome.viewmodel.StatisticsViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class StatisticsExpenseFragment extends Fragment {
    private StatisticsViewModel statisticsViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_statistics_expense, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        final UserListAdapter adapter = new UserListAdapter(new UserListAdapter.UserDiff());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        statisticsViewModel = new ViewModelProvider(this).get(StatisticsViewModel.class);
        statisticsViewModel.getAllUsers().observe(getViewLifecycleOwner(), adapter::submitList);
        return rootView;
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
