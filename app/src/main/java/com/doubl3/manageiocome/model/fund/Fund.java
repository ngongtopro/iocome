package com.doubl3.manageiocome.model.fund;

import com.doubl3.manageiocome.common.Constants;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "funds_table")
public class Fund {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name = "name")
    private final String name;

    @ColumnInfo(typeAffinity = Constants.PERSONAL)
    private int type;

    @ColumnInfo(name = "creator")
    private String creator;

    @ColumnInfo(name = "date")
    private Date date;

    public Fund(@NonNull String name, int type, String creator, Date date) {
        this.name = name;
        this.type = type;
        this.creator = creator;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getCreator() {
        return creator;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
