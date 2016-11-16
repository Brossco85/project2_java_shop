package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 16/11/2016.
 */

public class CustomerOptionsActivity extends AppCompatActivity {


    Button mViewAccountsButton;
    Button mShopOnlineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_options);

        mViewAccountsButton = (Button) findViewById(R.id.view_accounts_button);
        mViewAccountsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerOptionsActivity.this, NewCustomerActivity.class);
                startActivity(intent);
            }
        });

        mShopOnlineButton = (Button) findViewById(R.id.shop_online_button);
        mViewAccountsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            Create online shop Activity
            }
        });

    }
}
