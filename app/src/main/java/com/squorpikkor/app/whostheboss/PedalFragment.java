package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class
PedalFragment extends Fragment {

//    int position;
    View view;
    TextView nameView;
    TextView shortNameView;
    TextView yearView;
    ImageView imageView;

    /*public PedalFragment() {
        this.position = position;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pedal, container, false);
        nameView = view.findViewById(R.id.name);
        shortNameView = view.findViewById(R.id.short_name);
        imageView = view.findViewById(R.id.image);
        yearView = view.findViewById(R.id.years);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager pager=(ViewPager)view.findViewById(R.id.pager);
        pager.setAdapter(new Pager(getParentFragmentManager()));
        
        MainViewModel model = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        Pedal pedal = model.getPedal();
        nameView.setText(pedal.getName());
        shortNameView.setText(pedal.getShortName());
        imageView.setImageResource(pedal.getImage());
        yearView.setText(getYears(pedal.getYearStart(), pedal.getYearEnd()));
    }

    private String getYears(int start, int end) {
        String s,e;
        if (start==-1) s = "?";
        else s = String.valueOf(start);
        if (end == 0) e = "now";
        else e = String.valueOf(end);
        return s + " - " + e;
    }

}