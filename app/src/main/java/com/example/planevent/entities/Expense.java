package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

import com.example.planevent.entities.parent.classes.EventElement;

@Entity (tableName = "expenses_table")
public class Expense extends EventElement {
    @ColumnInfo(name = "cost")
    private Long cost;


    public Expense(int eventId, @NonNull String name, String description, Long cost) {
        super(eventId, name, description);
        this.cost = cost;
    }
    @Ignore
    public Expense(int eventId, @NonNull String name) {
        this(eventId, name, "", null);
    }
    @Ignore
    public Expense(int eventId, @NonNull String name, Long cost) {
        this(eventId, name, "", cost);
    }
    @Ignore
    public Expense(int eventId, @NonNull String name, String description) {
        this(eventId, name, description, null);
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}
