package com.example.android.bestcell.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.bestcell.R;
import com.example.android.bestcell.models.Platform;

import java.util.List;

public class CustomGridAdapter extends BaseAdapter {
    Context context;
    List<Platform> platforms;

    public CustomGridAdapter(Context applicationContext, List<Platform> platforms) {
        this.context = applicationContext;
        this.platforms = platforms;
    }

    @Override
    public int getCount() {
        return platforms.size();
    }

    @Override
    public Platform getItem(int i) {
        return platforms.get(i);
    }

    @Override
    public long getItemId(int i) {
        return platforms.get(i).getIcon();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(this.context).inflate(R.layout.grid_item, null); // inflate the layout
        ImageView icon = view.findViewById(R.id.icon); // get the reference of ImageView
        TextView textView = view.findViewById(R.id.text); // get the reference of TextView

        Platform platform = this.platforms.get(i);

        icon.setImageResource(platform.getIcon()); // set logo images
        textView.setText(platform.getPlatform()); // set the text for platform (OS)

        return view;
    }
}
