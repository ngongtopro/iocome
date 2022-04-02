package com.doubl3.manageiocome.model.user;


import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDao {

    @Insert()
    void insert(User user);

    @Query("SELECT * FROM users_table WHERE id = :id")
    LiveData<User> loadUserById(int id);

    @Query("SELECT * FROM users_table ORDER by first_name ASC")
    LiveData<List<User>> getAlphabetizedUsers();

    @Update
    void update(User user);

    @Delete
    void delete(User user);

    @Query("UPDATE users_table SET first_name =:first_name WHERE id =:id")
    void updateFirstName(String first_name, int id);

    @Query("UPDATE users_table SET last_name =:last_name WHERE id =:id")
    void updateLastName(String last_name, int id);

    @Query("UPDATE users_table SET password =:password WHERE id =:id")
    void updatePassword(String password, int id);

    //@Query("UPDATE users_table SET dob =:dob WHERE id =:id")
    //void updateDOB(String dob, int id);

    @Query("UPDATE users_table SET email =:email WHERE id =:id")
    void updateEmail(String email, int id);

    @Query("UPDATE users_table SET avatar = :avatar WHERE id = :id")
    void update(String avatar, int id);


}
