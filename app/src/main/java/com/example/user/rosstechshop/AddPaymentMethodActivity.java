package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class AddPaymentMethodActivity extends AppCompatActivity {

    Spinner mPaymentTypeSpinner;
    EditText mPaymentLimit;
    Button mAddPaymentTypeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment_method);

        mPaymentTypeSpinner = (Spinner) findViewById(R.id.payment_spinner);
        mPaymentLimit = (EditText) findViewById(R.id.payment_limit);
        mAddPaymentTypeButton = (Button) findViewById(R.id.add_payment_type_button);


        ArrayAdapter<CardType> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, CardType.values());
        mPaymentTypeSpinner.setAdapter(adapter);


        mAddPaymentTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String limit = mPaymentLimit.getText().toString();
                Integer limit2 = Integer.parseInt(limit);

                CardType card = (CardType) mPaymentTypeSpinner.getSelectedItem();
                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
                Customer customer = (Customer) intent.getSerializableExtra("customer");
                customer.addPaymentCard(card, limit2);

                Intent intent2 = new Intent(AddPaymentMethodActivity.this, CustomerOptionsActivity.class);
                intent2.putExtra("customer", customer);
                startActivity(intent2);
            }
        });




    }
}
