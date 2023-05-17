package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity(tableName = "tasks_table")
public class Task {
    @PrimaryKey(autoGenerate = true)
    private int id;
//    @ForeignKey(entity = Event.class)
    private int eventId;
    @NonNull
    private String name;
    private String description;
    private Date targetDate;
    private Boolean isDone;

    public Task(int id, int eventId, @NonNull String name, String description, Date targetDate, Boolean isDone) {
        this.id = id;
        this.eventId = eventId;
        this.name = name;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
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

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
