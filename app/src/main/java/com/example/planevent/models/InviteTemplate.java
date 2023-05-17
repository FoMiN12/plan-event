package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "invites_table")
public class InviteTemplate {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    @NonNull
    private String name;
    private String description;
    private Boolean targetGender;

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

    public Boolean getTargetGender() {
        return targetGender;
    }

    public void setTargetGender(Boolean targetGender) {
        this.targetGender = targetGender;
    }
}
