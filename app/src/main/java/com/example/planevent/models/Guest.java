package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "guests_table")
public class Guest {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    @NonNull
    private String name;
    private String description;
    private Boolean gender;

    public Guest(@NonNull String name, String description, Boolean gender) {
        this.name = name;
        this.description = description;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
