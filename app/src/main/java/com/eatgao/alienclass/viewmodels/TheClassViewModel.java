package com.eatgao.alienclass.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.eatgao.alienclass.entities.TheClass;
import com.eatgao.alienclass.repository.TheClassRepository;

import java.util.List;

public class TheClassViewModel extends AndroidViewModel {
    private final TheClassRepository classRepository;
    private final LiveData<List<TheClass>> allClass;

    public TheClassViewModel(@NonNull Application application) {
        super(application);
        classRepository = new TheClassRepository(application);
        allClass = classRepository.getAllClass();
    }
}
