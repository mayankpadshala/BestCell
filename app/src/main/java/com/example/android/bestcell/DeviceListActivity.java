package com.example.android.bestcell;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.bestcell.models.Manufacturer;
import com.example.android.bestcell.adapter.DeviceListAdapter;
import com.example.android.bestcell.models.Platform;

import org.parceler.Parcels;

public class DeviceListActivity extends AppCompatActivity implements DeviceListAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
        Platform platform = Parcels.unwrap(getIntent().getParcelableExtra("platform"));
        DeviceListAdapter adapter = new DeviceListAdapter(this, platform.getDeviceList(), this);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(Manufacturer data) {
        Intent intent = new Intent(DeviceListActivity.this, DeviceModelListActivity.class);
        intent.putExtra("manufacturer", Parcels.wrap(data));
        startActivity(intent); // start Intent
    }
}
