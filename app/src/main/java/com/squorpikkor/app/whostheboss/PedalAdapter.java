package com.squorpikkor.app.whostheboss;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class PedalAdapter extends ArrayAdapter<Pedal> {

    private final LayoutInflater inflater;
    private final int layout;
    private final List<Pedal> sourceList;

    PedalAdapter(Context context, int resource, List<Pedal> sourceList) {
        super(context, resource, sourceList);
        this.sourceList = sourceList;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @SuppressWarnings("NullableProblems")
    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View view = inflater.inflate(this.layout, parent, false);

        Pedal pedal = sourceList.get(position);
        ((TextView)view.findViewById(R.id.name)).setText(pedal.getName());
        ((TextView)view.findViewById(R.id.short_name)).setText(pedal.getShortName());
        ((ImageView)view.findViewById(R.id.image)).setImageResource(pedal.getImage());

        return view;
    }

}
