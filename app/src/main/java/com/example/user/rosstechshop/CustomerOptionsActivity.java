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

    Button mAddPaymentMethod;
    Button mViewAccountsButton;
    Button mShopOnlineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_options);

        mViewAccountsButton = (Button) findViewById(R.id.view_accounts_button);
        mViewAccountsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
                Customer customer = (Customer) intent.getSerializableExtra("customer");
                Intent intent2 = new Intent(CustomerOptionsActivity.this, CustomerAccountsActivity.class);
                intent2.putExtra("customer", customer);
                startActivity(intent2);
            }
        });

        mShopOnlineButton = (Button) findViewById(R.id.shop_online_button);
        mShopOnlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
                Customer customer = (Customer) intent.getSerializableExtra("customer");
                Intent intent2 = new Intent(CustomerOptionsActivity.this, OnlineShopActivity.class);
                intent2.putExtra("customer", customer);
                startActivity(intent2);
            }
        });

        mAddPaymentMethod = (Button) findViewById(R.id.add_payment_type_button);
        mAddPaymentMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
                Customer customer = (Customer) intent.getSerializableExtra("customer");
                Intent intent2 = new Intent(CustomerOptionsActivity.this, AddPaymentMethodActivity.class);
                intent2.putExtra("customer", customer);
                startActivity(intent2);

            }


        });
    }
}
