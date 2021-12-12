package com.squorpikkor.app.whostheboss;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.squorpikkor.app.whostheboss.data.DataEntity;

import java.util.List;

public class MainViewModel  extends AndroidViewModel {

    private final MutableLiveData<List<Device>> deviceList;
    private int position;
    private final DataEntity dataEntity;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dataEntity = new DataEntity();
        deviceList = new MutableLiveData<>();
        deviceList.setValue(dataEntity.getAllDev());
    }

    public void openDeviceInfo(int position) {
    }


    public LiveData<List<Device>> getDeviceList() {
        return deviceList;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setCategory(int cat) {
        deviceList.setValue(dataEntity.getAllDevByCat(cat));
    }

}
