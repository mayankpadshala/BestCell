package com.example.android.bestcell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AndroidPhoneActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_phone);

        ArrayList<Phones> phones = new ArrayList<Phones>();

        phones.add(new Phones("Samsung"));
        phones.add(new Phones("OnePlus"));
        phones.add(new Phones("Xiaomi"));
        phones.add(new Phones("Vivo"));
        phones.add(new Phones("Oppo"));
        phones.add(new Phones("Asus"));
        phones.add(new Phones("Blackberry"));
        phones.add(new Phones("Lenovo"));
        phones.add(new Phones("Micromax"));
        phones.add(new Phones("Lava"));
        phones.add(new Phones("Intex"));
        phones.add(new Phones("Karbon"));
        phones.add(new Phones("Yu Mobiles"));

        PhonesAdapter adapter = new PhonesAdapter(this, phones);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
