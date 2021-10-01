package com.squorpikkor.app.whostheboss;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.squorpikkor.app.whostheboss.data.DeviceDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainViewModel  extends AndroidViewModel {

    private LiveData<List<Device>> deviceList;
    private static DeviceDatabase database;
    public static final String TAG = "tag";


    public MainViewModel(@NonNull Application application) {
        super(application);
        database = DeviceDatabase.getInstance(getApplication());
        deviceList = database.deviceDAO().getAllDevices();
        Log.e(TAG, "MainViewModel: deviceList - "+deviceList);
        Log.e(TAG, "MainViewModel: deviceList.getValue() - "+deviceList.getValue());
        //deviceList = getDevicesByCategory(16);
    }

    public void openDeviceInfo(Device device) {
        Log.e(TAG, "openDeviceInfo: "+device.getShortName()+" - "+device.getName()+" - "+device.getCategory());
        Log.e(TAG, "openDeviceInfo: "+Utils.getSmallImage("od_1"));
    }

    public LiveData<List<Device>> getDeviceList() {
        return deviceList;
    }


    public LiveData<List<Device>> getDevicesByCategory(int cat) {
        Log.e(TAG, "♦getDevicesByCategory: "+6144%(2048*2));
        try {
            return new InsertTask().execute(cat).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class InsertTask extends AsyncTask<Integer, Void, LiveData<List<Device>>> {
        @Override
        protected LiveData<List<Device>> doInBackground(Integer... ints) {
            if (ints != null && ints.length > 0) {
                Log.e("TAG", "doInBackground: ");
                return database.deviceDAO().getDevicesByCategory(ints[0]);
            }
            return null;
        }
    }

}
