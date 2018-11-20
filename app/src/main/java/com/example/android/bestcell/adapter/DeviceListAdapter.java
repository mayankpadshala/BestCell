package com.example.android.bestcell.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.bestcell.models.Manufacturer;
import com.example.android.bestcell.R;

import java.util.List;

public class DeviceListAdapter extends ArrayAdapter<Manufacturer> {

    ClickListener listener;

    public DeviceListAdapter(Context context, List<Manufacturer> manufacturers, ClickListener listener) {
        super(context, 0, manufacturers);
        this.listener = listener;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phones, parent, false);
        }

        final Manufacturer manufacturer = getItem(position);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(manufacturer);
            }
        });

        TextView currentWord = listItemView.findViewById(R.id.text1);

        currentWord.setText(manufacturer.getName());

        return listItemView;
    }

    public interface ClickListener {
        void onItemClick(Manufacturer data);
    }
}
