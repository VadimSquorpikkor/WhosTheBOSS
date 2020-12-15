package com.squorpikkor.app.whostheboss;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;

//class MainViewModel extends ViewModel {
class MainViewModel extends AndroidViewModel {

    /*ArrayList<Pedal> pedalList;

    public MainViewModel() {
        pedalList = createPedalList();
    }

    public ArrayList<Pedal> getPedalList() {
        return pedalList;
    }

    private ArrayList<Pedal> createPedalList() {
        ArrayList<Pedal> list = new ArrayList<>();
        list.add(new Pedal("Distortion", "DS-1", R.drawable.ds_1, 1981, 0));
        return list;
    }*/

    private MutableLiveData<ArrayList<Pedal>> pedalList = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<ArrayList<Pedal>> getPedalList() {
        return pedalList;
    }

}
