package com.squorpikkor.app.whostheboss.pager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.squorpikkor.app.whostheboss.MainViewModel;
import com.squorpikkor.app.whostheboss.R;

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
        if (mViewModel.getDeviceList().getValue() != null) {
            pager.setAdapter(new Pager(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mViewModel.getDeviceList().getValue().size()));
            pager.setCurrentItem(mViewModel.getPosition());
        }

        return view;
    }
}
