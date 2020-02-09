package com.example.toshiba.marketmonitoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Toshiba on 30-Jan-20.
 */

public class Local_market extends AppCompatActivity {
    Button complainbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localmarket);
        complainbtn = (Button) findViewById(R.id.button1);

        complainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Local_market.this, Complain.class);
                startActivity(intent);
            }
        });

    }
}
