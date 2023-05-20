package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.EventDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.Event;

import java.util.List;

public class EventRepository {
    private AppRoomDatabase appRoomDatabase;
    private EventDao eventDao;

    public EventRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        eventDao = appRoomDatabase.eventDao();
    }

    public void insertEvent(Event event) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> eventDao.insert(event));
    }

    public void updateEvent(Event event) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> eventDao.update(event));
    }

    public void deleteEvent(Event event) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> eventDao.delete(event));
    }

    public Event findById(int id) {
        return eventDao.findById(id);
    }

    public LiveData<List<Event>> getEventsByUserId(int userId){
        return eventDao.getEventsByUserId(userId);
    }
}