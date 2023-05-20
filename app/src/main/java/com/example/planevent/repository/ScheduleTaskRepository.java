package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.ScheduleTaskDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.ScheduleTask;

import java.util.List;

public class ScheduleTaskRepository {
    private AppRoomDatabase appRoomDatabase;
    private ScheduleTaskDao scheduleTaskDao;

    public ScheduleTaskRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        scheduleTaskDao = appRoomDatabase.scheduleTaskDao();
    }

    public void insertScheduleTask(ScheduleTask scheduleTask) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> scheduleTaskDao.insert(scheduleTask));
    }

    public ScheduleTask findById(int id) {
        return scheduleTaskDao.findById(id);
    }

    public LiveData<List<ScheduleTask>> getScheduleTasksByEventId(int eventId) {
        return scheduleTaskDao.getScheduleTasksByEventId(eventId);
    }
}