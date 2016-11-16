package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 16/11/2016.
 */

public class CustomerAccountsActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_accounts);

        mListView = (ListView) findViewById(R.id.account_listview);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Customer customer = (Customer) intent.getSerializableExtra("customer");

        ArrayList<String> paymentOptions = customer.getPaymentOptionString();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(CustomerAccountsActivity.this,
                android.R.layout.simple_list_item_1,
                paymentOptions);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String) mListView.getItemAtPosition(position);
                Log.d("ListView:", selected + " selected");
                Intent intent = new Intent(CustomerAccountsActivity.this, CustomerOptionsActivity.class);

                startActivity(intent);

            }

        });
    }
}
