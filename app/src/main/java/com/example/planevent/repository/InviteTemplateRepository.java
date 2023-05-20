package com.example.planevent.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.planevent.dao.InviteTemplateDao;
import com.example.planevent.database.AppRoomDatabase;
import com.example.planevent.entities.InviteTemplate;

import java.util.List;

public class InviteTemplateRepository {
    private AppRoomDatabase appRoomDatabase;
    private InviteTemplateDao inviteTemplateDao;

    public InviteTemplateRepository(Application application) {
        appRoomDatabase = AppRoomDatabase.getDatabase(application);
        inviteTemplateDao = appRoomDatabase.inviteTemplateDao();
    }

    public void insertInviteTemplate(InviteTemplate inviteTemplate) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> inviteTemplateDao.insert(inviteTemplate));
    }

    public InviteTemplate findById(int id) {
        return inviteTemplateDao.findById(id);
    }

    public LiveData<List<InviteTemplate>> getInvitesByEventId(int eventId) {
        return inviteTemplateDao.getInvitesByEventId(eventId);
    }
}