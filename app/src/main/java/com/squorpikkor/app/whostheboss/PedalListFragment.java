package com.squorpikkor.app.whostheboss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.squorpikkor.app.whostheboss.MainActivity.TAG;
import static com.squorpikkor.app.whostheboss.Pedal.ACOUSTIC;
import static com.squorpikkor.app.whostheboss.Pedal.ALL;
import static com.squorpikkor.app.whostheboss.Pedal.AMP_EMULATOR;
import static com.squorpikkor.app.whostheboss.Pedal.BASS_PEDALS;
import static com.squorpikkor.app.whostheboss.Pedal.CHORUS;
import static com.squorpikkor.app.whostheboss.Pedal.DELAY_REVERB;
import static com.squorpikkor.app.whostheboss.Pedal.DISTORTION_OVERDRIVE;
import static com.squorpikkor.app.whostheboss.Pedal.DYNAMICS_FILTER;
import static com.squorpikkor.app.whostheboss.Pedal.OTHERS;
import static com.squorpikkor.app.whostheboss.Pedal.PITCH_MODULATION;
import static com.squorpikkor.app.whostheboss.Pedal.SERIES_20;
import static com.squorpikkor.app.whostheboss.Pedal.SERIES_200;
import static com.squorpikkor.app.whostheboss.Pedal.SERIES_500;
import static com.squorpikkor.app.whostheboss.Pedal.WAZA_CRAFT;

public class PedalListFragment extends Fragment {

    ListView lvMain;
    ArrayList<Pedal> sourceList = new ArrayList<>();
    PedalAdapter pedalAdapter;
    MainViewModel mViewModel;
    View view;

    HashMap<String, Integer> catMap;

    //todo переместить в VIEW_MODEL?
    private void initMap() {
        catMap = new HashMap<>();
        catMap.put("All", ALL);
        catMap.put("Distortion/Overdrive", DISTORTION_OVERDRIVE);
        catMap.put("Delay/Reverb", DELAY_REVERB);
        catMap.put("Pitch/Modulation", PITCH_MODULATION);
        catMap.put("Dynamics/Filters", DYNAMICS_FILTER);
        catMap.put("Acoustic", ACOUSTIC);
        catMap.put("Bass pedals", BASS_PEDALS);
        catMap.put("20 Series", SERIES_20);
//        catMap.put("", SERIES_200);
//        catMap.put("", SERIES_500);
        catMap.put("Amp emulators", AMP_EMULATOR);
        catMap.put("Chorus", CHORUS);
        catMap.put("WAZA Craft", WAZA_CRAFT);
        catMap.put("Others", OTHERS);
    }

    String[] spinnerList;

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

        //todo убрать new PedalAdapter — иначе каждый раз будет создаваться объект класса
        mViewModel.getPedalList().observe(requireActivity(), users -> {
            sourceList = users;
            // создаем адаптер//
            pedalAdapter = new PedalAdapter(getContext(), R.layout.pedal_list_item, sourceList);
            lvMain.setAdapter(pedalAdapter);
        });

        //Лисенер для элемента ListView
        lvMain.setOnItemClickListener((parent, view1, position, id) -> {
            mViewModel.setPosition(position);
            // Create new fragment and transaction
//            Fragment newFragment = PedalFragment.newInstance(position);
            Fragment newFragment = PagerFragment.newInstance(position);
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        });

        initMap();
        spinnerList = new String[catMap.size()];
        int index = 0;
        for (Map.Entry<String, Integer> mapEntry : catMap.entrySet()) {
            spinnerList[index] = mapEntry.getKey();
            index++;
        }

        Spinner spinner = view.findViewById(R.id.spinner);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, spinnerList);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                String item = (String)parent.getItemAtPosition(position);
                mViewModel.setPedalListByCategory(catMap.get(item));
                lvMain.setAdapter(pedalAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);

        return view;
    }

}