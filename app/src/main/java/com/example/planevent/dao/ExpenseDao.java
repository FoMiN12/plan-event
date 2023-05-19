package com.example.planevent.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.Expense;

import java.util.List;

@Dao
public interface ExpenseDao extends CommonDao<Expense> {
    @Query("DELETE FROM expenses_table")
    void deleteAllNotes();
    @Query("SELECT * FROM expenses_table WHERE id LIKE :id")
    Expense findById(int id);

    @Query("SELECT * FROM expenses_table WHERE event_id = :eventId")
    LiveData<List<Expense>> getExpensesByEventId(int eventId);
}
