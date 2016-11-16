package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class CustomerLoginActivity extends AppCompatActivity {

    private Button mAddCustomer;
    ListView mListView;

//    placeholder for arraylist of customers from mysql database

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        mAddCustomer = (Button) findViewById(R.id.new_customer_button);
        mAddCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerLoginActivity.this, NewCustomerActivity.class);
                startActivity(intent);
            }
        });


        mListView = (ListView) findViewById(R.id.my_listview);

        ArrayList<String> customers = Customer.allCustomers;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                customers);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String)mListView.getItemAtPosition(position);
                Log.d("ListView:", selected + " selected");
                Intent intent = new Intent(CustomerLoginActivity.this, CustomerOptionsActivity.class);

                startActivity(intent);

            }

        });

//        stopped the lesson on sql rows in order to look into sql databases, will go back to that once database is working.

//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

//        });

    }


}


