package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.example.planevent.entities.parent.classes.EventElement;
import com.example.planevent.util.Gender;

@Entity(tableName = "invites_table")
public class InviteTemplate extends EventElement {
    @ColumnInfo(name = "target_gender")
    private Gender targetGender;

    public InviteTemplate(int eventId, @NonNull String name, String description, Gender targetGender) {
        super(eventId, name, description);
        this.targetGender = targetGender;
    }


    public Gender getTargetGender() {
        return targetGender;
    }

    public void setTargetGender(Gender targetGender) {
        this.targetGender = targetGender;
    }
}
