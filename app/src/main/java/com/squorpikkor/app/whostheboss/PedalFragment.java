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

    private static final String POSITION = "position";
    int position;
    View view;
    TextView nameView;
    TextView shortNameView;
    TextView yearView;
    ImageView imageView;

    /*public PedalFragment() {
        this.position = position;
    }*/

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param position Parameter 1.
     * @return A new instance of fragment PedalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PedalFragment newInstance(int position) {
        PedalFragment fragment = new PedalFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

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

        position = getArguments().getInt(POSITION);

//        ViewPager pager=(ViewPager)view.findViewById(R.id.pager);
//        pager.setAdapter(new Pager(getParentFragmentManager()));
        
        MainViewModel model = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        Pedal pedal = model.getPedal(position);
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