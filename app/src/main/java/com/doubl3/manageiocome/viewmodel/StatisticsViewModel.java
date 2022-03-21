package com.doubl3.manageiocome.viewmodel;

import android.app.Application;
import android.util.Log;

import com.doubl3.manageiocome.model.user.User;
import com.doubl3.manageiocome.model.user.UserRepository;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;

public class StatisticsViewModel extends AndroidViewModel {

    private static final String TAG = "StatisticsViewModel";
    private UserRepository mReposity;
    private LiveData<List<User>> mAllUsers;

    @Inject
    public StatisticsViewModel(@NonNull Application application, UserRepository userRepository) {

        super(application);
        mReposity = userRepository;
        mAllUsers = mReposity.getAllUsers();
    }

    public LiveData<List<User>> getAllUsers(){
        return mAllUsers;
    }

    public void addUser(User user){
        mReposity.insert(user);
    }
}
