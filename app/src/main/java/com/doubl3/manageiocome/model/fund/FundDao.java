package com.doubl3.manageiocome.model.fund;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface FundDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Fund fund);

    @Query("SELECT * FROM funds_table WHERE id = :id")
    LiveData<Fund> loadFundById(int id);

    @Query("SELECT * FROM funds_table ORDER by name ASC")
    LiveData<List<Fund>> getAlphabetizedFunds();

    @Query("UPDATE funds_table SET name =:name WHERE id =:id")
    void updateName(String name, int id);
}
