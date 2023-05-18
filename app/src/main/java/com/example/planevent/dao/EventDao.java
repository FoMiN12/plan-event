package com.example.planevent.dao;

import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Event;

public interface EventDao extends CommonDao<Event> {
    @Query("DELETE FROM events_table")
    void deleteAllNotes();
}
