package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;


import com.example.planevent.entities.parent.classes.EventElement;

import java.util.Date;

@Entity(tableName = "tasks_table")
public class Task extends EventElement {
    @ColumnInfo(name = "target_date")
    private Date targetDate;
    @ColumnInfo(name = "is_done")
    private Boolean isDone;

    public Task(int eventId, @NonNull String name, String description, Date targetDate, Boolean isDone) {
        super(eventId, name, description);
        this.targetDate = targetDate;
        this.isDone = isDone;
    }
    @Ignore
    public Task(int eventId, @NonNull String name) {
        this(eventId,name,"",null,false);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, Date targetDate, Boolean isDone) {
        this(eventId,name,"",targetDate,isDone);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, String description, Date targetDate) {
        this(eventId,name,description,targetDate,false);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, String description, Boolean isDone) {
        this(eventId,name,description,null,isDone);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, Boolean isDone) {
        this(eventId,name,"",null,isDone);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, String description) {
        this(eventId,name,description,null, false);
    }
    @Ignore
    public Task(int eventId, @NonNull String name, Date targetDate) {
        this(eventId,name,"",targetDate,false);
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
