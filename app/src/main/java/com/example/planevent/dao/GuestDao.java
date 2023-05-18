package com.example.planevent.dao;


import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Guest;
@Dao
public interface GuestDao extends CommonDao<Guest> {
    @Query("DELETE FROM guests_table")
    void deleteAllNotes();
}
