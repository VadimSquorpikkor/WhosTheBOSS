package com.squorpikkor.app.whostheboss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.squorpikkor.app.whostheboss.data.DeviceDatabase;

import java.util.List;

public class MainViewModel  extends AndroidViewModel {

    private LiveData<List<Device>> deviceList;
    private static DeviceDatabase database;
    public static final String TAG = "tag";


    public MainViewModel(@NonNull Application application) {
        super(application);
        database = DeviceDatabase.getInstance(getApplication());
//        new InsertTask().execute();
        //database.deviceDAO().insertAll(DataEntity.getAll());
        deviceList = database.deviceDAO().getAllDevices();
        Log.e(TAG, "MainViewModel: deviceList - "+deviceList);
        Log.e(TAG, "MainViewModel: deviceList.getValue() - "+deviceList.getValue());
//        Log.e(TAG, "MainViewModel: "+deviceList.getValue().size());


    }

    public void openDeviceInfo(Device device) {
        Log.e(TAG, "openDeviceInfo: "+device.getShortName()+" - "+device.getName()+" - "+device.getCategory());
        Log.e(TAG, "openDeviceInfo: "+Utils.getSmallImage("od_1"));
    }

    public LiveData<List<Device>> getDeviceList() {
        return deviceList;
    }

    /*private static class InsertTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void...v) {
            database.deviceDAO().insertAll(DataEntity.getAll());
            return null;
        }
    }*/
}
