package com.doubl3.manageiocome.model;

public class User {
    private String name;
    private static User mUser;

    private User() {
        this.name = "Hello User";
    }

    /** Su dung SINGLETON */
    public static User getInstance() {
//        su dung cho da luong
//         if (mUser == null) synchronized (User.class) {
//                if (mUser == null) mUser = new User();}

        if (mUser == null) {
            mUser = new User();
        }
        return mUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
