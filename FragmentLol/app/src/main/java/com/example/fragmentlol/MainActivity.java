package com.example.fragmentlol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button champion , spells ,aboutus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        champion = findViewById(R.id.champion);
        spells = findViewById(R.id.spells);
        aboutus = findViewById(R.id.aboutus);

        champion.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().add(R.id.frame,new fragment1()).commit();
        });

        spells.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().add(R.id.frame,new Fragment2()).commit();
        });

        aboutus.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().add(R.id.frame,new Fragment3()).commit();
        });


    }


}