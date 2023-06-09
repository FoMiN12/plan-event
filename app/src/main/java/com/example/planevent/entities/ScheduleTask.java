package com.example.planevent.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

import com.example.planevent.entities.parent.classes.EventElement;

import java.util.Date;

@Entity(tableName = "schedule_table")
public class ScheduleTask extends EventElement {
    @NonNull
    @ColumnInfo(name = "start_date")
    private Date startDate;

    @NonNull
    @ColumnInfo(name = "end_date")
    private Date endDate;

    public ScheduleTask(int eventId, @NonNull String name, String description, @NonNull Date startDate, @NonNull Date endDate) {
        super(eventId, name, description);
        this.startDate = startDate;
        this.endDate = endDate;
    }
    @Ignore
    public ScheduleTask(int eventId, @NonNull String name, String description, @NonNull Date startDate) {
        this(eventId, name, description, startDate, new Date(startDate.getTime() + 3600000));
    }
    @Ignore
    public ScheduleTask(int eventId, @NonNull String name, Date startDate, Date endDate) {
        this(eventId, name, "", startDate, endDate);
    }
    @Ignore
    public ScheduleTask(int eventId, @NonNull String name, @NonNull Date startDate) {
        this(eventId, name, "", startDate, new Date(startDate.getTime() + 3600000));
    }

    @NonNull
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(@NonNull Date startDate) {
        this.startDate = startDate;
    }

    @NonNull
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(@NonNull Date endDate) {
        this.endDate = endDate;
    }
}
