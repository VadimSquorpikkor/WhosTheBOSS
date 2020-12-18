package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.squorpikkor.app.whostheboss.MainActivity.TAG;

public class PedalListFragment extends Fragment {

    ListView lvMain;
    ArrayList<Pedal> sourceList = new ArrayList<>();
    PedalAdapter pedalAdapter;
    MainViewModel mViewModel;
    View view;

    public static PedalListFragment newInstance() {
        return new PedalListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pedal_list, container, false);

        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        // находим список
        lvMain = view.findViewById(R.id.pedal_list);

        // создаем адаптер//
//        pedalAdapter = new PedalAdapter(getContext(), R.layout.pedal_list_item, sourceList);

        //todo убрать new PedalAdapter — иначе каждый раз будет создаваться объект класса
        mViewModel.getPedalList().observe(requireActivity(), users -> {
            sourceList = users;
            pedalAdapter = new PedalAdapter(getContext(), R.layout.pedal_list_item, sourceList);
            lvMain.setAdapter(pedalAdapter);
        });

        //Лисенер для элемента ListView
        lvMain.setOnItemClickListener((parent, view1, position, id) -> {
            mViewModel.setPosition(position);
            // Create new fragment and transaction
            Fragment newFragment = new PedalFragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();

        });

        return view;
    }


    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mViewModel.getPedalList().observe(requireActivity(), users -> {
            sourceList = mViewModel.getPedalList().getValue();
            lvMain.setAdapter(pedalAdapter);
        });
    }*/
}