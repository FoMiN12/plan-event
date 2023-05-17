package com.example.planevent.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.planevent.dao.TaskDao;
import com.example.planevent.models.Expense;
import com.example.planevent.models.Guest;
import com.example.planevent.models.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Task.class}, version = 1, exportSchema = false)
public abstract class TaskRoomDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();

    private static volatile TaskRoomDatabase taskRoomDatabase;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static TaskRoomDatabase getDatabase(final Context context) {
        if (taskRoomDatabase == null) {
            synchronized (TaskRoomDatabase.class) {
                if (taskRoomDatabase == null) {
                    taskRoomDatabase = Room.databaseBuilder(context.getApplicationContext(), TaskRoomDatabase.class, "app_database").build();

                }
            }
        }
        return taskRoomDatabase;
    }
}
