package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.example.planevent.models.parent.classes.EventElement;

@Entity (tableName = "expenses_table")
public class Expense extends EventElement {
    @ColumnInfo(name = "cost")
    private Long cost;


    public Expense(int eventId, @NonNull String name, String description, Long cost) {
        super(eventId, name, description);
        this.cost = cost;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}
