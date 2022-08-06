package com.eatgao.alienclass.repository;

import android.app.Application;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import com.eatgao.alienclass.DAOs.TheClassDAO;
import com.eatgao.alienclass.databases.TheClassDatabase;
import com.eatgao.alienclass.entities.TheClass;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TheClassRepository {
    private final TheClassDAO classDao;
    private final LiveData<List<TheClass>> allClass;

    public TheClassRepository(Application application){
        TheClassDatabase classDb = TheClassDatabase.getInstance(application);
        classDao = classDb.classDAO();
        allClass = classDao.getAll();
    }

    public LiveData<List<TheClass>> getAll() {
        return allClass;
    }

    public CompletableFuture<List<TheClass>> getClassList() {
        return CompletableFuture.supplyAsync(classDao::getClassList, TheClassDatabase.databaseWriteExecutor);
    }

    public void insert(final TheClass theClass){
        TheClassDatabase.databaseWriteExecutor.execute(() -> classDao.insert(theClass));
    }
    public void deleteAll(){
        TheClassDatabase.databaseWriteExecutor.execute(classDao::deleteAll);
    }
    public void delete(final TheClass theClass){
        TheClassDatabase.databaseWriteExecutor.execute(() -> classDao.delete(theClass));
    }
    public void updateBook(final TheClass theClass){
        TheClassDatabase.databaseWriteExecutor.execute(() -> classDao.updateBook(theClass));
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public CompletableFuture<TheClass> findByIdFuture(final int classId) {
        return CompletableFuture.supplyAsync(() -> classDao.findById(classId), TheClassDatabase.databaseWriteExecutor);
    }

    public CompletableFuture<TheClass> findByNameFuture(final String className) {
        return CompletableFuture.supplyAsync(() -> classDao.findByName(className), TheClassDatabase.databaseWriteExecutor);
    }
}
