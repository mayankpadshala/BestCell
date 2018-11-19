package com.example.android.bestcell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridAdapter extends BaseAdapter {
    Context context;
    int logos[];
    String text[];
    LayoutInflater inflter;
    public CustomGridAdapter(Context applicationContext, int[] logos, String[] text) {
        this.context = applicationContext;
        this.logos = logos;
        this.text = text;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return logos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.grid_item, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
        TextView textView = (TextView) view.findViewById(R.id.text);
        icon.setImageResource(logos[i]); // set logo images
        textView.setText(text[i]);
        return view;
    }
}
