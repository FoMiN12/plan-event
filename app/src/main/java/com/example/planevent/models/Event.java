package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.LinkedList;

@Entity (tableName = "events_table")
public class Event {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    @NonNull
    private String name;
    private LinkedList<Task> tasks;
    private LinkedList<Guest> guests;
    private LinkedList<Expense> expenses;
    private LinkedList<>
}
