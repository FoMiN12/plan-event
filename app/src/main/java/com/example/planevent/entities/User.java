package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.LinkedList;

@Entity(tableName = "users_table")
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    private String email;
    @ColumnInfo(name = "password_hash")
    private int passwordHash;
    @Ignore
    @Relation(parentColumn = "id", entityColumn = "user_id")
    private final LinkedList<Event> events;

    public User(@NonNull String email, int passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.events = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public int getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(int passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Ignore
    public LinkedList<Event> getEvents() {
        return events;
    }

}
