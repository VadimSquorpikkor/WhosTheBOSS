package com.squorpikkor.app.whostheboss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public MainViewModel mViewModel;
//    public static final String TAG = "..........";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        //fill the layout
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
//            fragment = PedalListFragment.newInstance();
            fragment = DeviceFragment.newInstance();
            //fill main container
            manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}