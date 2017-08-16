package com.example.ofoegbuvalentine.evatronics.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ofoegbuvalentine.evatronics.fragments.AboutFragment;
import com.example.ofoegbuvalentine.evatronics.fragments.RequestFragment;
import com.example.ofoegbuvalentine.evatronics.fragments.VideosFragment;

/**
 * Created by Ofoegbu Valentine on 25/04/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs){
        super(fm);
        this.mNumberOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                RequestFragment requestFragment = new RequestFragment();
                return requestFragment;
            case 1:
                VideosFragment videosFragment = new VideosFragment();
                return videosFragment;
            case 2:
                AboutFragment aboutFragment = new AboutFragment();
                return aboutFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
