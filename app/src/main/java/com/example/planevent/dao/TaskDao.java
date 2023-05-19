package com.example.planevent.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Task;

@Dao
public interface TaskDao extends CommonDao<Task> {

    @Query("DELETE FROM tasks_table")
    void deleteAllNotes();

    @Query("SELECT * FROM tasks_table WHERE id LIKE :id")
    Task findById(int id);
}
