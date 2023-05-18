package com.example.planevent.models.parent.classes;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;


import com.example.planevent.models.Event;
import com.example.planevent.models.parent.classes.DataObject;

import java.util.Date;

@Entity(foreignKeys = {@ForeignKey(entity = Event.class,
        parentColumns = "id",
        childColumns = "event_id",
        onDelete = ForeignKey.CASCADE)})
public class EventElement extends DataObject {
    private final int eventId;
    private String description;


    public EventElement(int eventId, @NonNull String name, String description) {
        super(name);
        this.eventId = eventId;
        this.description = description;
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
