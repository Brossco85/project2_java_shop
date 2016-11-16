package com.example.user.rosstechshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by user on 16/11/2016.
 */

public class OnlineShopActivity extends AppCompatActivity {

    Spinner mShopSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shop);

        mShopSpinner = (Spinner) findViewById(R.id.shop_spinner);

        ArrayList<String> shops = Shop.allShops;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, shops);
        mShopSpinner.setAdapter(adapter);


    }
}
