package com.example.android.bestcell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhonesAdapter extends ArrayAdapter<Phones> {

    public PhonesAdapter(Context context, ArrayList<Phones> phones) {
        super(context, 0, phones);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phones, parent, false);
        }

        Phones currentPhone = getItem(position);

        TextView currentWord = (TextView) listItemView.findViewById(R.id.text1);

        currentWord.setText(currentPhone.getName());

        return listItemView;
    }
}
