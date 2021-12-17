package com.squorpikkor.app.whostheboss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DeviceInfoFragment extends Fragment {

    View view;
    boolean isShown;
    TextView descSwitch;
    LinearLayout descView;
    private static final String POSITION = "position";
    int position;

    public static DeviceInfoFragment newInstance(int position) {
        DeviceInfoFragment fragment = new DeviceInfoFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    /*public static DeviceInfoFragment newInstance(int position) {
        DeviceInfoFragment fragment = new DeviceInfoFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (getArguments() != null) position = getArguments().getInt(POSITION);
        else position = 0;

        view = inflater.inflate(R.layout.fragment_pedal, container, false);

        if (getArguments() != null) position = getArguments().getInt(POSITION);
        else position = 0;

        TextView nameView = view.findViewById(R.id.name);
        TextView shortNameView = view.findViewById(R.id.short_name);
        ImageView imageView = view.findViewById(R.id.image);
        TextView yearView = view.findViewById(R.id.years);
        descView = view.findViewById(R.id.description_view);
        TextView descText = view.findViewById(R.id.description_text);
        descSwitch = view.findViewById(R.id.description_switch);
        descView.setVisibility(View.GONE);

        MainViewModel model = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
//        Device device = model.getDeviceList().getValue().get(model.getPosition());
        Device device = model.getDeviceList().getValue().get(position);

        nameView.setText(device.getName());
        shortNameView.setText(device.getShortName());
        imageView.setImageResource(device.getBigImage());
        yearView.setText(device.getYears());
        String description = device.getDescription();
        descText.setText(description);

        descSwitch.setOnClickListener(view1 -> switchDescription());
        if (description.length() == 0) {
            descText.setVisibility(View.GONE);
            descView.setVisibility(View.GONE);
            descSwitch.setVisibility(View.GONE);
        }

        CheckBox wishBox = view.findViewById(R.id.wish_list);
        CheckBox haveBox = view.findViewById(R.id.have_it);

        wishBox.setOnClickListener(v->model.setWishList(wishBox.isChecked(), device.getId()));
        haveBox.setOnClickListener(v->model.setHaveList(haveBox.isChecked(), device.getId()));

        return view;
    }

    private void switchDescription() {
        isShown = !isShown;
        if (isShown) {
            descView.setVisibility(View.VISIBLE);
            descSwitch.setText(R.string.hide_description);
        } else {
            descView.setVisibility(View.GONE);
            descSwitch.setText(R.string.show_description);
        }
    }
}
