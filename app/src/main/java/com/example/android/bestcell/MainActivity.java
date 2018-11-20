package com.example.android.bestcell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.bestcell.adapter.CustomGridAdapter;
import com.example.android.bestcell.models.Platform;

import org.parceler.Parcels;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGrid = findViewById(R.id.gridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        final List<Platform> platforms = Platform.getData();
        CustomGridAdapter customAdapter = new CustomGridAdapter(getApplicationContext(), platforms);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                if(position == 1) {
                    Intent intent = new Intent(MainActivity.this, DeviceModelListActivity.class);
                    intent.putExtra("manufacturer", Parcels.wrap(platforms.get(position).getDeviceList().get(0)));
                    startActivity(intent); // start Intent
                } else {
                    Intent intent = new Intent(MainActivity.this, DeviceListActivity.class);
                    intent.putExtra("platform", Parcels.wrap(platforms.get(position)));
                    startActivity(intent); // start Intent
                }
            }
        });
    }
}
