package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "expenses_table")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    @NonNull
    private String name;
    private String description;
    private long cost;

    public Expense(@NonNull String name, String description, long cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Expense(@NonNull String name) {
        this.name = name;
        this.cost = 0;
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

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }
}
