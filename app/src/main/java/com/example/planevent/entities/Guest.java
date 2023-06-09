package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

import com.example.planevent.entities.parent.classes.EventElement;
import com.example.planevent.util.Gender;

@Entity(tableName = "guests_table")
public class Guest extends EventElement {
    @ColumnInfo(name = "gender")
    private Gender gender;

    public Guest(int eventId, @NonNull String name, String description, Gender gender) {
        super(eventId, name, description);
        this.gender = gender;
    }
    @Ignore
    public Guest(int eventId, @NonNull String name) {
        this(eventId, name, "", Gender.NOTMENTIONED);
    }
    @Ignore
    public Guest(int eventId, @NonNull String name, Gender gender) {
        this(eventId, name, "", gender);
    }
    @Ignore
    public Guest(int eventId, @NonNull String name, String description) {
        this(eventId, name, description, Gender.NOTMENTIONED);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
