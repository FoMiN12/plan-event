package com.example.planevent.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.planevent.models.Guest;

public interface GuestDao {
    @Insert
    void insert(Guest guest);

    @Update
    void update(Guest guest);

    @Delete
    void delete(Guest guest);

    @Query("DELETE FROM guests_table")
    void deleteAllNotes();
}
