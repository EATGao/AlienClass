package com.eatgao.alienclass.DAOs;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.eatgao.alienclass.entities.TheClass;

import java.util.List;

@Dao
public interface TheClassDAO {
    @Query("SELECT * FROM theclass ORDER BY cid ASC")
    LiveData<List<TheClass>> getAll();
    @Query("SELECT * FROM theclass ORDER BY cid ASC")
    List<TheClass> getClassList();
    @Query("SELECT * FROM theclass WHERE cid = :classId LIMIT 1")
    TheClass findById(int classId);
    @Query("SELECT * FROM theclass WHERE the_class_name = :className LIMIT 1")
    TheClass findByName(String className);
    @Insert
    void insert(TheClass theClass);
    @Delete
    void delete(TheClass theClass);
    @Update
    void updateBook(TheClass theClass);
    @Query("DELETE FROM theclass")
    void deleteAll();
}
