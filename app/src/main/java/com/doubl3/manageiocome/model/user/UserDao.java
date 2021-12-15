package com.doubl3.manageiocome.model.user;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    void insert(User user);

    @Query("DELETE FROM users_table")
    void deleteAll();

    @Query("SELECT * FROM users_table ORDER by first_name ASC")
    LiveData<List<User>> getAlphabetizedUsers();
}
