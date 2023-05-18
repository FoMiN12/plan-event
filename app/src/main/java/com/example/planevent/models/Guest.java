package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.example.planevent.models.parent.classes.EventElement;
import com.example.planevent.util.Gender;

@Entity(tableName = "guests_table")
public class Guest extends EventElement {
    @ColumnInfo(name = "gender")
    private Gender gender;

    public Guest(int eventId, @NonNull String name, String description, Gender gender) {
        super(eventId, name, description);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
