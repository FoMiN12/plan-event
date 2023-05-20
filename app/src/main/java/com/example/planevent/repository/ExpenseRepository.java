package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.ExpenseDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.Expense;

import java.util.List;

public class ExpenseRepository {
    private AppRoomDatabase appRoomDatabase;
    private ExpenseDao expenseDao;

    public ExpenseRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        expenseDao = appRoomDatabase.expenseDao();
    }

    public void insertExpense(Expense expense) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> expenseDao.insert(expense));
    }

    public Expense findById(int id) {
        return expenseDao.findById(id);
    }

    public LiveData<List<Expense>> getExpensesByEventId(int eventId) {
        return expenseDao.getExpensesByEventId(eventId);
    }
}