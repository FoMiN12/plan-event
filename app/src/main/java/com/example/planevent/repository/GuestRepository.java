package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.GuestDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.Guest;

import java.util.List;

public class GuestRepository {
    private AppRoomDatabase appRoomDatabase;
    private GuestDao guestDao;

    public GuestRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        guestDao = appRoomDatabase.guestDao();
    }

    public void insertGuest(Guest guest) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> guestDao.insert(guest));
    }

    public Guest findById(int id) {
        return guestDao.findById(id);
    }

    public LiveData<List<Guest>> getGuestsByEventId(int eventId) {
        return guestDao.getGuestsByEventId(eventId);
    }
}
