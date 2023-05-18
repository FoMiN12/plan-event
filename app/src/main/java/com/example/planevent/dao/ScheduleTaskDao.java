package com.example.planevent.dao;

import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.ScheduleTask;

public interface ScheduleTaskDao extends CommonDao<ScheduleTask> {
    @Query("DELETE FROM schedule_table")
    void deleteAllNotes();
}
