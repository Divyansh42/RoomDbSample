package com.example.android.roomdbsample.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.android.roomdbsample.entity.Message;

import java.util.List;

@Dao
public interface MessageDao {

    @Query("SELECT * FROM message where consultation_id LIKE :consultationId" )
    List<Message> findMessageByConsultationId(int consultationId);

    @Insert
    void insert(Message message);
}
