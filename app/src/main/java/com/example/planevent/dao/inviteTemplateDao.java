package com.example.planevent.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.planevent.entities.InviteTemplate;

public interface inviteTemplateDao {
    @Insert
    void insert(InviteTemplate inviteTemplate);

    @Update
    void update(InviteTemplate inviteTemplate);

    @Delete
    void delete(InviteTemplate inviteTemplate);

    @Query("DELETE FROM invites_table")
    void deleteAllNotes();
}
