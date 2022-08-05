package com.eatgao.alienclass.repository;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;

import com.eatgao.alienclass.DAOs.ClassDAO;
import com.eatgao.alienclass.databases.ClassDatabase;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ClassRepository {
    private final ClassDAO classDao;
    private final LiveData<List<Class>> allClass;

    public ClassRepository(Application application){
        ClassDatabase classDb = ClassDatabase.getInstance(application);
        classDao = classDb.classDAO();
        allClass = classDao.getAll();
    }

    public LiveData<List<Class>> getAll() {
        return allClass;
    }

    public CompletableFuture<List<Class>> getClassList() {
        return CompletableFuture.supplyAsync(classDao::getBookList, ClassDatabase.databaseWriteExecutor);
    }

    public void insert(final Class aClass){
        ClassDatabase.databaseWriteExecutor.execute(() -> classDao.insert(aClass));
    }
    public void deleteAll(){
        ClassDatabase.databaseWriteExecutor.execute(classDao::deleteAll);
    }
    public void delete(final Class aClass){
        ClassDatabase.databaseWriteExecutor.execute(() -> classDao.delete(aClass));
    }
    public void updateBook(final Class aClass){
        ClassDatabase.databaseWriteExecutor.execute(() -> classDao.updateBook(aClass));
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public CompletableFuture<Class> findByIdFuture(final int classId) {
        return CompletableFuture.supplyAsync(() -> classDao.findById(classId), ClassDatabase.databaseWriteExecutor);
    }

    public CompletableFuture<Class> findByNameFuture(final String className) {
        return CompletableFuture.supplyAsync(() -> classDao.findByName(className), ClassDatabase.databaseWriteExecutor);
    }
}
