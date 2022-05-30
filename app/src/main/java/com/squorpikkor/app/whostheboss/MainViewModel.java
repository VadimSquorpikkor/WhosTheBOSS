package com.squorpikkor.app.whostheboss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.squorpikkor.app.whostheboss.data.DataEntity;

import java.util.List;

public class MainViewModel  extends AndroidViewModel {

    public static final int LINEAR = 0;
    public static final int GRID = 1;

    public static final String PREF_STYLE = "pref_style";


    private final MutableLiveData<List<Device>> deviceList;
    private int position;
    private final DataEntity dataEntity;
    private final MutableLiveData<Integer> listStyle;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dataEntity = new DataEntity();
        deviceList = new MutableLiveData<>();
        deviceList.setValue(dataEntity.getAllDev());
        listStyle = new MutableLiveData<>(SaveLoad.loadInt(PREF_STYLE));
    }

    public MutableLiveData<Integer> getListStyle() {
        return listStyle;
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

    public void toggleStyle() {
        if (listStyle.getValue()==null) listStyle.setValue(LINEAR);
        if (listStyle.getValue()==LINEAR) listStyle.setValue(GRID);
        else if (listStyle.getValue()==GRID) listStyle.setValue(LINEAR);
        SaveLoad.save(PREF_STYLE, listStyle.getValue());
    }

    public void setWishList(boolean add, String id) {
        if (add) dataEntity.addToWishList(id);
        else dataEntity.removeFromWishList(id);
    }

    public void setHaveList(boolean add, String id) {
        if (add) dataEntity.addToHaveList(id);
        else dataEntity.removeFromHaveList(id);
    }

    private boolean showWishesOnly;
    public void toggleWish() {
        showWishesOnly = !showWishesOnly;
        if (showWishesOnly) deviceList.setValue(dataEntity.getWishDev());
        else deviceList.setValue(dataEntity.getAllDev());
    }

    private boolean showHaveOnly;
    public void toggleHave() {
        showHaveOnly = !showHaveOnly;
        if (showHaveOnly) deviceList.setValue(dataEntity.getHaveDev());
        else deviceList.setValue(dataEntity.getAllDev());
    }
}
