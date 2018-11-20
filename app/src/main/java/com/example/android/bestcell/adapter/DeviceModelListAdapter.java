package com.example.android.bestcell.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.bestcell.R;
import com.example.android.bestcell.models.Model;

import java.util.List;

public class DeviceModelListAdapter extends ArrayAdapter<Model> {

    ClickListener listener;

    public DeviceModelListAdapter(Context context, List<Model> models, ClickListener listener) {
        super(context, 0, models);
        this.listener = listener;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phones, parent, false);
        }

        final Model model = getItem(position);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(model);
            }
        });

        TextView currentWord = listItemView.findViewById(R.id.text1);

        currentWord.setText(model.getName());

        return listItemView;
    }

    public interface ClickListener {
        void onItemClick(Model data);
    }
}
