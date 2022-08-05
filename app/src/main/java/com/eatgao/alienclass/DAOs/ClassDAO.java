package com.eatgao.alienclass.DAOs;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ClassDAO {
    @Query("SELECT * FROM class ORDER BY cid ASC")
    LiveData<List<Class>> getAll();
    @Query("SELECT * FROM class ORDER BY cid ASC")
    List<Class> getBookList();
    @Query("SELECT * FROM class WHERE cid = :classId LIMIT 1")
    Class findById(int classId);
    @Query("SELECT * FROM class WHERE class_name = :className LIMIT 1")
    Class findByName(String className);
    @Insert
    void insert(Class book);
    @Delete
    void delete(Class book);
    @Update
    void updateBook(Class book);
    @Query("DELETE FROM class")
    void deleteAll();
}
