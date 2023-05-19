package com.example.planevent.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Event;

@Dao
public interface EventDao extends CommonDao<Event> {
    @Query("DELETE FROM events_table")
    void deleteAllNotes();

    @Query("SELECT * FROM events_table WHERE id LIKE :id")
    Event findById(int id);
}
