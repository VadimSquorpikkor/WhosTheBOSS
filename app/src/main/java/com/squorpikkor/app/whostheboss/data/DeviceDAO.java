package com.squorpikkor.app.whostheboss.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.squorpikkor.app.whostheboss.Device;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface DeviceDAO {
    @Query("SELECT * FROM devices")
    LiveData<List<Device>> getAllDevices();

    @Insert
    void insertAll(Device... devices);
}
