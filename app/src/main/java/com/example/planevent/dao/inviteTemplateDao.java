package com.example.planevent.dao;

import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.InviteTemplate;

public interface inviteTemplateDao  extends CommonDao<InviteTemplate> {

    @Query("DELETE FROM invites_table")
    void deleteAllNotes();
}
