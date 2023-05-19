package com.example.planevent.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.User;
@Dao
public interface UserDao extends CommonDao<User> {
    @Query("DELETE FROM users_table")
    void deleteAllNotes();

    @Query("SELECT * FROM users_table WHERE id LIKE :id")
    User findById(int id);
}
