package com.example.planevent.entities.parent.classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;
import java.util.Date;

@Entity
public class DataObject {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @NonNull
    @ColumnInfo(name = "name")
    private String name;
    @NonNull
    @ColumnInfo(name = "creating_date")
    private Date creatingDate;

    public DataObject(@NonNull String name) {
        this.name = name;
        this.creatingDate = Calendar.getInstance().getTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatingDate(@NonNull Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    @NonNull
    public Date getCreatingDate() {
        return creatingDate;
    }


    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
