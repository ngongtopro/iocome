package com.doubl3.manageiocome.model;

public class Item {
    private String mName;
    private int mValue;
    private int mType;

    public Item(){

    }

    public Item(String name, int value, int type){
        this.mName = name;
        this.mValue = value;
        this.mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        this.mValue = value;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
