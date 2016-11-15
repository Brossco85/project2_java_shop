package com.example.user.rosstechshop;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by user on 14/11/2016.
 */

public class NewCustomerActivity extends AppCompatActivity {

    EditText mCustomerName;
    Button mCreateCustomerButton;
    Button mAllCustomersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_customer);

        mCreateCustomerButton = (Button)findViewById(R.id.create_player_button);
        mCustomerName = (EditText)findViewById(R.id.name_text);{
        mCreateCustomerButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view){
                String name = mCustomerName.getText().toString();
                Customer customer = new Customer(name);


                Intent intent = new Intent(NewCustomerActivity.this, AddPaymentMethodActivity.class);
                intent.putExtra("customer", customer);
                startActivity(intent);
    }
    });
}

        mAllCustomersButton = (Button)findViewById(R.id.all_customers_button);
        mAllCustomersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewCustomerActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}