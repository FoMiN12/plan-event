package com.example.planevent.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.example.planevent.models.parent.classes.EventElement;

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
