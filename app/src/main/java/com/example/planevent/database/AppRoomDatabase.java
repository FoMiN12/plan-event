package com.example.planevent.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.planevent.dao.TaskDao;
import com.example.planevent.models.Event;
import com.example.planevent.models.Expense;
import com.example.planevent.models.Guest;
import com.example.planevent.models.InviteTemplate;
import com.example.planevent.models.ScheduleTask;
import com.example.planevent.models.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Task.class,
        Guest.class,
        Expense.class,
        InviteTemplate.class,
        ScheduleTask.class,
        Event.class,},
        version = 1, exportSchema = false)
public abstract class AppRoomDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();

    private static volatile AppRoomDatabase appRoomDatabase;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static AppRoomDatabase getDatabase(final Context context) {
        if (appRoomDatabase == null) {
            synchronized (AppRoomDatabase.class) {
                if (appRoomDatabase == null) {
                    appRoomDatabase = Room.databaseBuilder(context.getApplicationContext(), AppRoomDatabase.class, "app_database").build();

                }
            }
        }
        return appRoomDatabase;
    }
}
