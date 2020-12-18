package com.squorpikkor.app.whostheboss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import static com.squorpikkor.app.whostheboss.MainActivity.TAG;

public class MainViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Pedal>> pedalList;

    public MutableLiveData<ArrayList<Pedal>> getPedalList() {
        if (pedalList == null) {
            pedalList = new MutableLiveData<>();
            loadList();
        }
        return pedalList;
    }

    private void loadList() {
        ArrayList<Pedal> list = new ArrayList<>();
        list.add(new Pedal("Distortion", "DS-1", R.drawable.ds_1, 1981, 0));
        pedalList.setValue(list);
    }

    public Pedal getPedal(int position) {
        return pedalList.getValue().get(position);
    }
}
