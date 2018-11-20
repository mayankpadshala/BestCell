package com.example.android.bestcell;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.bestcell.models.Manufacturer;
import com.example.android.bestcell.models.Model;

import org.parceler.Parcels;

public class DeviceInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Model model = Parcels.unwrap(getIntent().getParcelableExtra("model"));

        TextView deviceName = findViewById(R.id.name);
        deviceName.setText(model.getName());
    }
}
