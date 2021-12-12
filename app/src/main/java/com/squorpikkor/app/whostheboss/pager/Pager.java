package com.squorpikkor.app.whostheboss.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.squorpikkor.app.whostheboss.DeviceFragment;
import com.squorpikkor.app.whostheboss.DeviceInfoFragment;

public class Pager extends FragmentStatePagerAdapter {

    private final int size;

    public Pager(@NonNull FragmentManager fm, int behavior, int size) {
        super(fm, behavior);
        this.size = size;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DeviceInfoFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return size;
    }
}
