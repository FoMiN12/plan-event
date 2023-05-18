package com.example.planevent.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Expense;

@Dao
public interface ExpenseDao extends CommonDao<Expense> {
    @Query("DELETE FROM expenses_table")
    void deleteAllNotes();
}
