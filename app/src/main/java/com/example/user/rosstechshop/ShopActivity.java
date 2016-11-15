package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class ShopActivity extends AppCompatActivity {

    private Button mAddShop;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        mAddShop = (Button) findViewById(R.id.new_shop_button);
        mAddShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShopActivity.this, NewShopActivity.class);
                startActivity(intent);
            }
        });

        mListView = (ListView) findViewById(R.id.my_listview);

            ArrayList<String> shops = Shop.allShops;

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    shops);

            mListView.setAdapter(adapter);
    }
}
