package com.squorpikkor.app.whostheboss.old_stuff;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class Pager extends FragmentStatePagerAdapter {

    private final int size;

    public Pager(@NonNull FragmentManager fm, int behavior, int size) {
        super(fm, behavior);
        this.size = size;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return PedalFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return size;
    }
}
