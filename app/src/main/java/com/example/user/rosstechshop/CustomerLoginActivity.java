package com.example.user.rosstechshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class CustomerLoginActivity extends AppCompatActivity {


    ListView mListView;

    private ArrayList<String> setUpStringsList() {
        ArrayList<String> stringsList = new ArrayList<String>();

        String[] strings = {
                "Jack Jarvis",
                "Victor McDade",
                "Winston Ingram",
                "Tam Mullen",
                "Isa Brennan",
                "Boaby the Barman",
                "Naveed Harrid"
        };

        for (int i = 0; i < strings.length; i++) {
            stringsList.add(strings[i]);
        }
        return stringsList;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        mListView = (ListView)findViewById(R.id.my_listview);


    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1,
            setUpStringsList());

        mListView.setAdapter(adapter);

    }


}


