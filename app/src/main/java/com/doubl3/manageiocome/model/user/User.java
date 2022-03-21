package com.doubl3.manageiocome.model.user;

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
    private final String firstName;

    @NonNull
    @ColumnInfo(name = "last_name")
    private final String lastName;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "password")
    private String passWord;

    public User(@NonNull String firstName, @NonNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @NonNull
    public String getFirstName(){
        return this.firstName;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getLastName(){
        return this.lastName;
    }

    public String getEmail() {
        return email;
    }


    public String getPassWord() {
        return passWord;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
