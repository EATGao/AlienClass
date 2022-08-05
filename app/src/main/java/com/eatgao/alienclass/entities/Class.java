package com.eatgao.alienclass.entities;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Class {
    @PrimaryKey(autoGenerate = true)
    public int cid;

    @ColumnInfo(name = "class_name")
    @NonNull
    public String className;

    @ColumnInfo(name = "class_day")
    @NonNull
    public String classDay;

    @ColumnInfo(name = "class_time")
    @NonNull
    public Date classTime;

    @ColumnInfo(name = "lecturer_name")
    @NonNull
    public String lecture_name;

    @ColumnInfo(name = "class_location")
    @NonNull
    public String classLocation;

    @ColumnInfo(name = "class_type")
    @NonNull
    public String classType;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @NonNull
    public String getClassName() {
        return className;
    }

    public void setClassName(@NonNull String className) {
        this.className = className;
    }

    @NonNull
    public String getClassDay() {
        return classDay;
    }

    public void setClassDay(@NonNull String classDay) {
        this.classDay = classDay;
    }

    @NonNull
    public Date getClassTime() {
        return classTime;
    }

    public void setClassTime(@NonNull Date classTime) {
        this.classTime = classTime;
    }

    @NonNull
    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(@NonNull String lecture_name) {
        this.lecture_name = lecture_name;
    }

    @NonNull
    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(@NonNull String classLocation) {
        this.classLocation = classLocation;
    }

    @NonNull
    public String getClassType() {
        return classType;
    }

    public void setClassType(@NonNull String classType) {
        this.classType = classType;
    }
}
