package com.eatgao.alienclass.databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.eatgao.alienclass.DAOs.TheClassDAO;
import com.eatgao.alienclass.entities.TheClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {TheClass.class}, version = 1, exportSchema = false)
public abstract class TheClassDatabase extends RoomDatabase {
    public abstract TheClassDAO classDAO();

    private static TheClassDatabase INSTANCE;

    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static synchronized TheClassDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), TheClassDatabase.class, "ClassDatabase")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }
}
