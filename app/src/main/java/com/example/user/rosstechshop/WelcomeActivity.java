package com.example.user.rosstechshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 13/11/2016.
 */

public class WelcomeActivity extends AppCompatActivity {

    private Button mBusinessButton;
    private Button mCustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mBusinessButton = (Button) findViewById(R.id.business_button);
        mBusinessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mCustomerButton = (Button) findViewById(R.id.customer_button);
        mCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }
}
