package com.example.android.bestcell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WindowsPhoneActivity extends AppCompatActivity {

    public static final String EXTRA_URL = "listName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows_phone);

        ArrayList<Phones> phones = new ArrayList<Phones>();

        phones.add(new Phones("Nokia Lumia 800"));
        phones.add(new Phones("Nokia Lumia 710"));
        phones.add(new Phones("Nokia Lumia 900"));
        phones.add(new Phones("Nokia Lumia 610"));
        phones.add(new Phones("Nokia Lumia 510"));
        phones.add(new Phones("Nokia Lumia 820"));
        phones.add(new Phones("Nokia Lumia 920"));
        phones.add(new Phones("Nokia Lumia 505"));
        phones.add(new Phones("Nokia Lumia 620"));
        phones.add(new Phones("Nokia Lumia 520"));
        phones.add(new Phones("Nokia Lumia 720"));
        phones.add(new Phones("Nokia Lumia 925"));
        phones.add(new Phones("Nokia Lumia 1020"));
        phones.add(new Phones("Nokia Lumia 625"));
        phones.add(new Phones("Nokia Lumia 1320"));
        phones.add(new Phones("Nokia Lumia 1520"));
        phones.add(new Phones("Nokia Lumia 2520"));
        phones.add(new Phones("Nokia Lumia 525"));
        phones.add(new Phones("Nokia Lumia Icon"));
        phones.add(new Phones("Nokia Lumia 930"));
        phones.add(new Phones("Nokia Lumia 630"));
        phones.add(new Phones("Nokia Lumia 530"));
        phones.add(new Phones("Nokia Lumia 730 Dual Sim"));
        phones.add(new Phones("Nokia Lumia 735"));
        phones.add(new Phones("Nokia Lumia 830"));


        phones.add(new Phones("Microsoft Lumia 535"));
        phones.add(new Phones("Microsoft Lumia 435"));
        phones.add(new Phones("Microsoft Lumia 532"));
        phones.add(new Phones("Microsoft Lumia 640"));
        phones.add(new Phones("Microsoft Lumia 640 XL"));
        phones.add(new Phones("Microsoft Lumia 540"));
        phones.add(new Phones("Microsoft Lumia 950"));
        phones.add(new Phones("Microsoft Lumia 950 XL"));
        phones.add(new Phones("Microsoft Lumia 550"));
        phones.add(new Phones("Microsoft Lumia 650"));


        PhonesAdapter adapter = new PhonesAdapter(this, phones);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView c = (TextView) view.findViewById(R.id.text1);
                String name = c.getText().toString();

                Intent detailsIntent = new Intent(WindowsPhoneActivity.this, DetailsActivity.class);
                detailsIntent.putExtra(EXTRA_URL,name);

                startActivity(detailsIntent);
            }
        });

    }
}
