package com.squorpikkor.app.whostheboss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.whostheboss.adapters.AdapterDevice;

public class DeviceFragment extends Fragment {

    public static DeviceFragment newInstance() {
        return new DeviceFragment();
    }

    private AdapterDevice adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_device, container, false);
        MainViewModel mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        RecyclerView foundRecyclerView = view.findViewById(R.id.recycler_main);
        adapter = new AdapterDevice();
        foundRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        foundRecyclerView.setAdapter(adapter);
        adapter.setOnDeviceClickListener(mViewModel::openDeviceInfo);
        mViewModel.getDeviceList().observe(getViewLifecycleOwner(), list -> adapter.setList(list));

        return view;
    }
}
