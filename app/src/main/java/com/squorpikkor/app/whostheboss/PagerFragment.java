package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PagerFragment extends Fragment {

    // Required empty public constructor
    public PagerFragment() {
    }

    public static PagerFragment newInstance() {
        return new PagerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pager, container, false);

        MainViewModel mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        ViewPager pager = view.findViewById(R.id.pager);
        if (mViewModel.getPedalList().getValue() != null) {
            pager.setAdapter(new Pager(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mViewModel.getPedalList().getValue().size()));
            pager.setCurrentItem(mViewModel.getPosition());
        }

        return view;
    }
}