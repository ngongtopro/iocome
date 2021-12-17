package com.doubl3.manageiocome.viewmodel;

import android.app.Application;

import com.doubl3.manageiocome.model.user.User;
import com.doubl3.manageiocome.model.user.UserRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class StatisticsViewModel extends AndroidViewModel {

    private UserRepository mReposity;
    private LiveData<List<User>> mAllUsers;

    public StatisticsViewModel(@NonNull Application application) {
        super(application);
        mReposity = new UserRepository(application);
        mAllUsers = mReposity.getAllUsers();
    }
    LiveData<List<User>> getAllUsers(){ return this.mAllUsers; }
    public void addUser(User user){
        mReposity.insert(user);
    }
}
