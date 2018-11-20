package com.example.android.bestcell;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.bestcell.adapter.DeviceModelListAdapter;
import com.example.android.bestcell.models.Manufacturer;
import com.example.android.bestcell.models.Model;

import org.parceler.Parcels;

public class DeviceModelListActivity extends AppCompatActivity implements DeviceModelListAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
        Manufacturer phone = Parcels.unwrap(getIntent().getParcelableExtra("manufacturer"));
        DeviceModelListAdapter adapter = new DeviceModelListAdapter(this, phone.getModels(), this);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(Model data) {
        Intent intent = new Intent(DeviceModelListActivity.this, DeviceInfoActivity.class);
        intent.putExtra("model", Parcels.wrap(data));
        startActivity(intent); // start Intent
    }
}
