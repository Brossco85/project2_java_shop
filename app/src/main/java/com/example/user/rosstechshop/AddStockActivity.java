package com.example.user.rosstechshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 15/11/2016.
 */

public class AddStockActivity extends AppCompatActivity {

    EditText mItemName;
    EditText mItemBrand;
    EditText mItemPrice;
    Button mAddToStock;
    Button mBacktoShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stock);

        mItemName = (EditText) findViewById(R.id.item_name);
        mItemBrand = (EditText) findViewById(R.id.item_brand);
        mItemPrice = (EditText) findViewById(R.id.item_price);
        mAddToStock = (Button) findViewById(R.id.add_to_stock);
        mBacktoShop = (Button) findViewById(R.id.back_to_shops);

        mAddToStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mItemName.getText().toString();
                String brand = mItemBrand.getText().toString();
                String priceText = mItemPrice.getText().toString();
                Integer price = Integer.parseInt(priceText);

                Item item = new Item(name, brand, price);

                Intent intent = getIntent();
                Bundle extras = intent.getExtras();

                Shop shop = (Shop)intent.getSerializableExtra("shop");
                shop.addStock(item);
                Toast.makeText(AddStockActivity.this, R.string.stock_added_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mBacktoShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AddStockActivity.this, ShopActivity.class);
                startActivity(intent2);
            }
        });


            }
}
