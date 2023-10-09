package com.example.workshop3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button frag1 , frag2 ,frag3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1= findViewById(R.id.frag1);
        frag2= findViewById(R.id.frag2);
        frag3= findViewById(R.id.frag3);


        frag1.setOnClickListener(view ->{
            getSupportFragmentManager().beginTransaction().add(R.id.frame,new fragment1()).commit();
                }

        );

        frag2.setOnClickListener(view ->{
                    getSupportFragmentManager().beginTransaction().add(R.id.frame,new Fragment2()).commit();
                }

        );
        frag3.setOnClickListener(view ->{
                    getSupportFragmentManager().beginTransaction().add(R.id.frame,new Fragment3()).commit();
                }

        );
    }
}