package com.doubl3.manageiocome.model.user;

import com.doubl3.manageiocome.Constants;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users_table")
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name = "first_name")
    private String firstName;

    @NonNull
    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "nick_name")
    private String nickName;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "password")
    private String passWord;

    @ColumnInfo(name = "permit")
    private int permit;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.permit = Constants.NOTHING;
    }
    @NonNull
    public String getFirstName(){
        return this.firstName;
    }
    @NonNull
    public String getLastName(){
        return this.lastName;
    }
}
