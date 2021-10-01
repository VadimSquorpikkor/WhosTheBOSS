package com.squorpikkor.app.whostheboss.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.whostheboss.Device;
import com.squorpikkor.app.whostheboss.R;
import com.squorpikkor.app.whostheboss.Utils;

import java.util.ArrayList;
import java.util.List;

public class AdapterDevice extends RecyclerView.Adapter<AdapterDevice.DeviceViewHolder> {

    private List<Device> list = new ArrayList<>();

    /**Лисенер, который будет возвращать объект Nuclide по позиции выбранного элемента*/
    private OnDeviceClickListener onDeviceClickListener;

    public interface OnDeviceClickListener {
        void onDeviceClick(Device device);
    }

    public void setOnDeviceClickListener(OnDeviceClickListener onDeviceClickListener) {
        this.onDeviceClickListener = onDeviceClickListener;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setList(List<Device> list) {
        if (list==null) this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_device, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        Device device = list.get(position);
//        holder.img.setImageResource(device.getSmallImage());
        holder.img.setImageResource(Utils.getSmallImage(device.getShortName()));
        holder.shortName.setText(device.getShortName());
        holder.name.setText(device.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DeviceViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name;
        TextView shortName;

        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            shortName = itemView.findViewById(R.id.short_name);

            itemView.setOnClickListener(view -> {
                if (onDeviceClickListener != null) onDeviceClickListener.onDeviceClick(list.get(getAbsoluteAdapterPosition()));
            });
        }
    }
}
