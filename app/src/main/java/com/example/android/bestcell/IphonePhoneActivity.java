package com.example.android.bestcell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IphonePhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_phone);

        ArrayList<Phones> phones = new ArrayList<Phones>();

        phones.add(new Phones("I Phone XS Max"));
        phones.add(new Phones("I Phone XS"));
        phones.add(new Phones("I Phone XR"));
        phones.add(new Phones("I Phone X"));
        phones.add(new Phones("I Phone 8 PLus"));
        phones.add(new Phones("I Phone 8"));
        phones.add(new Phones("I Phone 7 Plus"));
        phones.add(new Phones("I Phone 7"));
        phones.add(new Phones("I Phone SE"));
        phones.add(new Phones("I Phone 6S Plus"));
        phones.add(new Phones("I Phone 6S"));
        phones.add(new Phones("I Phone 6 Plus"));
        phones.add(new Phones("I Phone 6"));
        phones.add(new Phones("I Phone 5S"));
        phones.add(new Phones("I Phone 5C"));
        phones.add(new Phones("I Phone 5"));
        phones.add(new Phones("I Phone 4S"));
        phones.add(new Phones("I Phone 4"));

        PhonesAdapter adapter = new PhonesAdapter(this, phones);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
