package com.example.planevent.dao.parent.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface CommonDao<T> {
    @Insert
    void insert(T expense);

    @Update
    void update(T expense);

    @Delete
    void delete(T expense);
}
