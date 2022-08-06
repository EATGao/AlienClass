package com.eatgao.alienclass.entities;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity
public class TheClass {
    @PrimaryKey(autoGenerate = true)
    public int cid;

    @ColumnInfo(name = "the_class_name")
    @NonNull
    public String theClassName;

    @ColumnInfo(name = "class_day")
    @NonNull
    public String theClassDay;

    @ColumnInfo(name = "class_time")
    @NonNull
    public Date theClassTime;

    @ColumnInfo(name = "lecturer_name")
    @NonNull
    public String lecture_name;

    @ColumnInfo(name = "the_class_location")
    @NonNull
    public String theClassLocation;

    @ColumnInfo(name = "the_class_type")
    @NonNull
    public String theClassType;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @NonNull
    public String getTheClassName() {
        return theClassName;
    }

    public void setTheClassName(@NonNull String theClassName) {
        this.theClassName = theClassName;
    }

    @NonNull
    public String getTheClassDay() {
        return theClassDay;
    }

    public void setTheClassDay(@NonNull String theClassDay) {
        this.theClassDay = theClassDay;
    }

    @NonNull
    public Date getTheClassTime() {
        return theClassTime;
    }

    public void setTheClassTime(@NonNull Date theClassTime) {
        this.theClassTime = theClassTime;
    }

    @NonNull
    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(@NonNull String lecture_name) {
        this.lecture_name = lecture_name;
    }

    @NonNull
    public String getTheClassLocation() {
        return theClassLocation;
    }

    public void setTheClassLocation(@NonNull String theClassLocation) {
        this.theClassLocation = theClassLocation;
    }

    @NonNull
    public String getTheClassType() {
        return theClassType;
    }

    public void setTheClassType(@NonNull String theClassType) {
        this.theClassType = theClassType;
    }
}
