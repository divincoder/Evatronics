package com.example.ofoegbuvalentine.evatronics.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ofoegbuvalentine.evatronics.R;
import com.example.ofoegbuvalentine.evatronics.activities.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideosFragment extends Fragment {

    public VideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_videos, container, false);
        return rootView;
    }

}
