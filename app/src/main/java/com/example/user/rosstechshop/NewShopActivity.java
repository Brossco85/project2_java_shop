package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 15/11/2016.
 */

public class NewShopActivity extends AppCompatActivity {

    EditText mShopName;
    Button mCreateShopButton;
    Button mAllShopsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_customer);

        mCreateShopButton = (Button)findViewById(R.id.create_player_button);
        mShopName = (EditText)findViewById(R.id.name_text);{
        mCreateShopButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view){
                String name = mShopName.getText().toString();
                Shop shop = new Shop(name);

                Intent intent = new Intent(NewShopActivity.this, AddStockActivity.class);
                intent.putExtra("shop", shop);
                startActivity(intent);
            }
        });
    }
            mAllShopsButton = (Button)findViewById(R.id.all_customers_button);
            mAllShopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewShopActivity.this, ShopActivity.class);
                startActivity(intent);
            }
        });
        }
    }