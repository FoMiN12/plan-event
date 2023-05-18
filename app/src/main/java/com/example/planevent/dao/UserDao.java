package com.example.planevent.dao;

import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.User;

public interface UserDao extends CommonDao<User> {
    @Query("DELETE FROM users_table")
    void deleteAllNotes();
}
