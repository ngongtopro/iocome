package com.doubl3.manageiocome.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class User {
    private String mName;
    private String mEmail;
    private String password;
    private int mTotalExpense;
    private int mTotalIncome;
    private HashMap<Integer, LinkedList<Item>> mListItem;

    private User() {
        this.mName = "Hello User";
        mListItem = new HashMap<>();
        for (int i = 1; i < 13; i++) {
            mListItem.put(i, new LinkedList<>());
        }
        //Add for example
        addItem(12, "Rice", 10000, -1);
    }

    /**
     * Su dung SINGLETON
     */
    public static User getInstance() {
/*
        su dung cho da luong
         if (mUser == null) synchronized (User.class) {
                if (mUser == null) mUser = new User();}
*/

        if (mUser == null) {
            mUser = new User();
        }
        return mUser;
    }

    private static User mUser;

    public void addItem(int month, String name, int value, int type) {
        mListItem.get(month).add(new Item(name, value, type));
    }

    public HashMap<Integer, LinkedList<Item>> getListItem() {
        return mListItem;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalExpense() {
        return mTotalExpense;
    }

    public void setTotalExpense(int mTotalExpense) {
        this.mTotalExpense = mTotalExpense;
    }

    public int getTotalIncome() {
        return mTotalIncome;
    }

    public void setTotalIncome(int mTotalIncome) {
        this.mTotalIncome = mTotalIncome;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
