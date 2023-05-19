package com.example.planevent.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.User;

import java.util.List;

@Dao
public interface UserDao extends CommonDao<User> {
    @Query("DELETE FROM users_table")
    void deleteAllNotes();

    @Query("SELECT * FROM users_table WHERE id LIKE :id")
    User findById(int id);

    @Query("SELECT * from users_table ORDER By email Asc")
    LiveData<List<User>> getAllUsers();

    @Query("SELECT * from users_table WHERE email = :email AND password_hash = :passwordHash")
    LiveData<User> getUser(String email, int passwordHash);
}
