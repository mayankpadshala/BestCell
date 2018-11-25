package com.example.android.bestcell;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.bestcell.adapter.FragmentTabAdapter;
import com.example.android.bestcell.models.Manufacturer;
import com.example.android.bestcell.models.Model;

import org.parceler.Parcels;

public class DeviceInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Model model = Parcels.unwrap(getIntent().getParcelableExtra("model"));

        getSupportActionBar().setTitle(model.getName());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        FragmentTabAdapter adapter = new FragmentTabAdapter(getSupportFragmentManager());
        adapter.addFragment(new ImagesFragment(), "Images");
        adapter.addFragment(new SpecFragment(), "Specification");
        adapter.addFragment(new PriceFragment(), "Price Quotes");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
