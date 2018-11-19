package com.example.android.bestcell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.bestcell.WindowsPhoneActivity.EXTRA_URL;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String Name = intent.getStringExtra(EXTRA_URL);

        TextView text = (TextView)findViewById(R.id.name);
        text.setText(Name);
    }
}
