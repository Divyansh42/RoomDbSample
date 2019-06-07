package com.example.android.roomdbsample.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.android.roomdbsample.dao.MessageDao;
import com.example.android.roomdbsample.entity.Message;
import com.example.android.roomdbsample.utils.Converters;

@Database(entities = {Message.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract MessageDao messageDao();
}