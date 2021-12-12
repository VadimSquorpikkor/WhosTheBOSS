package com.squorpikkor.app.whostheboss;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.whostheboss.adapters.AdapterDevice;
import com.squorpikkor.app.whostheboss.pager.PagerFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.text.util.Linkify.ALL;
import static com.squorpikkor.app.whostheboss.Device.ACOUSTIC;
import static com.squorpikkor.app.whostheboss.Device.AMP_EMULATOR;
import static com.squorpikkor.app.whostheboss.Device.BASS_PEDALS;
import static com.squorpikkor.app.whostheboss.Device.CHORUS;
import static com.squorpikkor.app.whostheboss.Device.DELAY_REVERB;
import static com.squorpikkor.app.whostheboss.Device.DISTORTION_OVERDRIVE;
import static com.squorpikkor.app.whostheboss.Device.DYNAMICS_FILTER;
import static com.squorpikkor.app.whostheboss.Device.OTHERS;
import static com.squorpikkor.app.whostheboss.Device.PITCH_MODULATION;
import static com.squorpikkor.app.whostheboss.Device.SERIES_10;
import static com.squorpikkor.app.whostheboss.Device.SERIES_20;
import static com.squorpikkor.app.whostheboss.Device.WAZA_CRAFT;

public class DeviceFragment extends Fragment {

    public static DeviceFragment newInstance() {
        return new DeviceFragment();
    }

    private AdapterDevice adapter;
    MainViewModel mViewModel;
    HashMap<String, Integer> catMap;
//    String[] spinnerList;
    ArrayList<String> spinnerList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_device, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        RecyclerView foundRecyclerView = view.findViewById(R.id.recycler_main);
        adapter = new AdapterDevice();
        foundRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        foundRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this::openDeviceInfo);
        mViewModel.getDeviceList().observe(getViewLifecycleOwner(), list -> adapter.setList(list));

        initMap();
//        spinnerList = new String[catMap.size()];
        spinnerList = new ArrayList<>();
        for (Map.Entry<String, Integer> mapEntry : catMap.entrySet()) {
            spinnerList.add(mapEntry.getKey());
        }

        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayList<String> newList = new ArrayList<>(spinnerList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_spinner_item, newList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String)adapterView.getItemAtPosition(i);
                Log.e("TAG", "onItemSelected: "+catMap.get(item));
                mViewModel.setCategory(catMap.get(item));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }

    //todo переместить в VIEW_MODEL?
    private void initMap() {
        catMap = new HashMap<>();
        catMap.put("All", ALL);
        catMap.put("Distortion/Overdrive", DISTORTION_OVERDRIVE);
        catMap.put("Delay/Reverb", DELAY_REVERB);
        catMap.put("Pitch/Modulation", PITCH_MODULATION);
        catMap.put("Dynamics/Filters", DYNAMICS_FILTER);
        catMap.put("Acoustic", ACOUSTIC);
        catMap.put("Bass pedals", BASS_PEDALS);
        catMap.put("20 Series", SERIES_20);
//        catMap.put("", SERIES_200);
//        catMap.put("", SERIES_500);
        catMap.put("Amp emulators", AMP_EMULATOR);
        catMap.put("Chorus", CHORUS);
        catMap.put("WAZA Craft", WAZA_CRAFT);
        catMap.put("Others", OTHERS);
        catMap.put("10 Series", SERIES_10);
    }

    public void openDeviceInfo(int position) {
        mViewModel.setPosition(position);
        // Create new fragment and transaction


        Fragment newFragment = PagerFragment.newInstance();
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
}
