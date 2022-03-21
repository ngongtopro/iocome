package com.doubl3.manageiocome.view.statistics;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.model.Item;
import com.doubl3.manageiocome.model.user.User;
import com.doubl3.manageiocome.model.user.UserListAdapter;
import com.doubl3.manageiocome.view.NewUserActivity;
import com.doubl3.manageiocome.viewmodel.StatisticsViewModel;
import com.doubl3.manageiocome.viewmodel.ViewModelProviderFactory;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.support.DaggerFragment;

import static android.app.Activity.RESULT_OK;

public class StatisticsExpenseFragment extends DaggerFragment  {

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    private static final String TAG = "StatisticsExpenseFragment";

    @Inject
    StatisticsViewModel statisticsViewModel;
    @Inject
    ViewModelProviderFactory providerFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_statistics_expense
                , container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        final UserListAdapter adapter = new UserListAdapter(new UserListAdapter.UserDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        statisticsViewModel = new ViewModelProvider(this, providerFactory)
                .get(StatisticsViewModel.class);
        statisticsViewModel.getAllUsers().observe(getViewLifecycleOwner(), adapter::submitList);
        //Toast.makeText(getContext(), statisticsViewModel.getUser().getFirstName(), Toast.LENGTH_LONG).show();
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
