package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.TaskDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.Task;

import java.util.List;

public class TaskRepository {
    AppRoomDatabase appRoomDatabase;
    TaskDao taskDao;

    public TaskRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        taskDao = appRoomDatabase.taskDao();
    }

    public void insertTask(Task task) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> taskDao.insert(task));
    }

//    public LiveData<List<Task>> getAllTasks() {
//        return taskDao.getAllTasks();
//    }

    public Task findById(int id) {
        return taskDao.findById(id);
    }

    public LiveData<List<Task>> getTasksByEventId(int eventId) {
        return taskDao.getTasksByEventId(eventId);
    }
}
