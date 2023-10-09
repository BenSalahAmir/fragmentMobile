package com.example.workshop3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment2 extends Fragment {

Button gofrag;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_2, container, false);
        gofrag = view.findViewById(R.id.gofrag);
        gofrag.setOnClickListener(e->{
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new fragment1()).commit();
        });
        return view;

    }
}