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
    private final String firstName;

    @NonNull
    @ColumnInfo(name = "last_name")
    private final String lastName;

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

    public User(@NonNull String firstName, @NonNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.permit = Constants.NOTHING;
    }
    @NonNull
    public String getFirstName(){
        return this.firstName;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    @NonNull
    public String getLastName(){
        return this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getPermit() {
        return permit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void setPermit(int permit) {
        this.permit = permit;
    }
}
