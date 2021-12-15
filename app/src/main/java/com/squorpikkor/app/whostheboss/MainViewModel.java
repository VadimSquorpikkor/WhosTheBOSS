package com.squorpikkor.app.whostheboss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.whostheboss.data.DataEntity;

import java.util.List;

import static com.squorpikkor.app.whostheboss.App.TAG;

public class MainViewModel  extends AndroidViewModel {

    public static final int LINEAR = 0;
    public static final int GRID = 1;

//    public static final RecyclerView.LayoutManager linear = new LinearLayoutManager(getActivity())

    private final MutableLiveData<List<Device>> deviceList;
    private int position;
    private final DataEntity dataEntity;
    private final MutableLiveData<Integer> listStyle;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dataEntity = new DataEntity();
        deviceList = new MutableLiveData<>();
        deviceList.setValue(dataEntity.getAllDev());
        listStyle = new MutableLiveData<>(0);
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
        Log.e(TAG, "toggleStyle: "+listStyle.getValue());
        if (listStyle.getValue()==LINEAR) listStyle.setValue(GRID);
        else if (listStyle.getValue()==GRID) listStyle.setValue(LINEAR);
    }
}
