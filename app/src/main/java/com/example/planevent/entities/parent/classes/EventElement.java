package com.example.planevent.entities.parent.classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;


import com.example.planevent.entities.Event;

@Entity(foreignKeys = {@ForeignKey(entity = Event.class,
        parentColumns = "id",
        childColumns = "event_id",
        onDelete = ForeignKey.CASCADE)})
public class EventElement extends DataObject {
    @ColumnInfo(name = "event_id")
    private final int eventId;
    private String description;

    public EventElement(int eventId, @NonNull String name, String description) {
        super(name);
        this.eventId = eventId;
        this.description = description;
    }

    public EventElement(int eventId, @NonNull String name) {
        this(eventId, name, "");
    }

    public int getEventId() {
        return eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
