package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PedalListFragment extends Fragment {

    ListView lvMain;
    ArrayList<Pedal> sourceList = new ArrayList<>();
    PedalAdapter pedalAdapter;

    public static PedalListFragment newInstance() {
        return new PedalListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_pedal_list, container, false);

        sourceList.add(new Pedal("Distortion", "DS-1", R.drawable.ds_1, 1981, 0));

        // находим список
        lvMain = view.findViewById(R.id.pedal_list);

        // создаем адаптер
        pedalAdapter = new PedalAdapter(getContext(),
                R.layout.pedal_list_item, sourceList);

        // присваиваем адаптер списку
        lvMain.setAdapter(pedalAdapter);

        //Лисенер для элемента ListView
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Create new fragment and transaction
                Fragment newFragment = new PedalFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }
        });

        return view;
    }

    /*@Override
    public void onResume() {
        super.onResume();
        sourceList.clear();
        sourceList.addAll(sourceList);
        lvMain.setAdapter(pedalAdapter);

    }*/
}