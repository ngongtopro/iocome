package com.doubl3.manageiocome.viewmodel;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.doubl3.manageiocome.BR;
import com.doubl3.manageiocome.model.User;

import java.util.Random;

public class HomePageViewModel extends BaseObservable {
    private final String TAG = "HomePageViewModel";
    private String name;
    public ObservableField<String> message = new ObservableField<>();

    @Bindable
    public String getName() {
        User user = User.getInstance();
        this.name = user.getName();
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        User user = User.getInstance();
        user.setName(this.name);
        notifyPropertyChanged(BR.name);
    }

    public void testChangeNameByClick() {
        Log.d(TAG, "Name is clicked");
        Random random = new Random();
        int value = random.nextInt();
        message.set("Name change to " + value);
        setName("User " + value);
    }
}
