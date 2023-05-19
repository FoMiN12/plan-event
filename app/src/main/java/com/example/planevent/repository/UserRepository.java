package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.UserDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.User;

import java.util.List;

public class UserRepository {
    AppRoomDatabase appRoomDatabase;
    UserDao userDao;

    public UserRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        userDao = appRoomDatabase.userDao();
    }

    public void insertUser(User user) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> userDao.insert(user));
    }

    public LiveData<List<User>> getAllUsers() {
        return userDao.getAllUsers();
    }

    public LiveData<User> getUser(String email, int passwordHash) {
        return userDao.getUser(email, passwordHash);
    }
}
