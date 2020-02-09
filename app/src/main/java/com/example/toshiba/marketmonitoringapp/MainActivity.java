package com.example.toshiba.marketmonitoringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button importers, holsellers, localmarket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        importers = (Button)findViewById(R.id.btn_importer);
        holsellers = (Button) findViewById(R.id.btn_holsellers);
        localmarket = (Button) findViewById(R.id.btn_localmarket);

        importers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Importer_activity.class);
                startActivity(intent);
            }
        });

        holsellers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Holsellers_activity.class);
                startActivity(intent);
            }
        });

        localmarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Local_market.class);
                startActivity(intent);
            }
        });
    }
}
