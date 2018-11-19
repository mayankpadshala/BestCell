package com.example.android.bestcell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;
    int logos[] = {R.drawable.ic_android_black_24dp, R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp};

    String text[] = {"Android", "Iphone", "Windows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGrid = (GridView) findViewById(R.id.gridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomGridAdapter customAdapter = new CustomGridAdapter(getApplicationContext(), logos, text);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, AndroidPhoneActivity.class);
                    startActivity(intent); // start Intent
                }

                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, IphonePhoneActivity.class);
                    startActivity(intent); // start Intent
                }

                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, WindowsPhoneActivity.class);
                    startActivity(intent); // start Intent
                }
            }
        });
    }
}
