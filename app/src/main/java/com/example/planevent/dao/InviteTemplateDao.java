package com.example.planevent.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.planevent.dao.parent.interfaces.CommonDao;
import com.example.planevent.entities.InviteTemplate;

@Dao
public interface InviteTemplateDao extends CommonDao<InviteTemplate> {

    @Query("DELETE FROM invites_table")
    void deleteAllNotes();

    @Query("SELECT * FROM invites_table WHERE id LIKE :id")
    InviteTemplate findById(int id);
}
