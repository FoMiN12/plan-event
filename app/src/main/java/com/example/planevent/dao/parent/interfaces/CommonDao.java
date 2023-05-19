package com.example.planevent.dao.parent.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface CommonDao<T> {
    @Insert
    void insert(T entity);

    @Update
    void update(T entity);

    @Delete
    void delete(T entity);

}
