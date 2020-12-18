package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PedalFragment extends Fragment {

    int position;
    View view;
    TextView nameView;
    TextView shortNameView;
    ImageView imageView;

    public PedalFragment(int position) {
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pedal, container, false);
        nameView = view.findViewById(R.id.name);
        shortNameView = view.findViewById(R.id.short_name);
        imageView = view.findViewById(R.id.image);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainViewModel model = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        Pedal pedal = model.getPedal(position);
        nameView.setText(pedal.getName());
        shortNameView.setText(pedal.getShortName());
        imageView.setImageResource(pedal.getImage());
    }

}