package com.example.ofoegbuvalentine.evatronics.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ofoegbuvalentine.evatronics.R;
import com.example.ofoegbuvalentine.evatronics.activities.AddRequestActivity;
import com.example.ofoegbuvalentine.evatronics.activities.MainActivity;


public class RequestFragment extends Fragment {
    private FloatingActionButton fab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       final  View rootView =  inflater.inflate(R.layout.fragment_request, container, false);

        fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddRequestActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}