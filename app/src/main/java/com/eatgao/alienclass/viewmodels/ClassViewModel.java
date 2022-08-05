package com.eatgao.alienclass.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.eatgao.alienclass.repository.ClassRepository;

import java.util.List;

public class ClassViewModel extends AndroidViewModel {
    private final ClassRepository classRepository;
    private final LiveData<List<Class>> allClass;

    public ClassViewModel(@NonNull Application application) {
        super(application);
        classRepository = new ClassRepository(application);
        allClass = classRepository.getAll();
    }
}
