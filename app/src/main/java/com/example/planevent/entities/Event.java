package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.Relation;

import com.example.planevent.entities.parent.classes.DataObject;

import java.util.LinkedList;

@Entity (tableName = "events_table",
        foreignKeys = {@ForeignKey(entity = User.class,
                parentColumns = "id",
                childColumns = "user_id",
                onDelete = ForeignKey.CASCADE)})
public class Event extends DataObject {
    @ColumnInfo(name = "user_id")
    private final int userId;
    @Relation(parentColumn = "id",entityColumn = "event_id")
    @Ignore
    private final LinkedList<Task> tasks;
    @Ignore
    @Relation(parentColumn = "id",entityColumn = "event_id")
    private final LinkedList<Guest> guests;
    @Ignore
    @Relation(parentColumn = "id",entityColumn = "event_id")
    private final LinkedList<Expense> expenses;
    @Ignore
    @Relation(parentColumn = "id",entityColumn = "event_id")
    private final LinkedList<InviteTemplate> inviteTemplates;

    public Event(int userId, @NonNull String name) {
        super(name);
        this.userId = userId;
        this.tasks = new LinkedList<Task>();
        this.guests = new LinkedList<Guest>();
        this.expenses = new LinkedList<Expense>();
        this.inviteTemplates = new LinkedList<InviteTemplate>();
    }

    public int getUserId() {
        return userId;
    }

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    public LinkedList<Guest> getGuests() {
        return guests;
    }

    public LinkedList<Expense> getExpenses() {
        return expenses;
    }

    public LinkedList<InviteTemplate> getInviteTemplates() {
        return inviteTemplates;
    }
}
