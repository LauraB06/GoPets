package com.example.pdr_m.gopets;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by laura on 25-Jun-17.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new AdoptionListFragment(); //AdoptionListFragment
            case 1:
                return new DonationListFragment(); //DonationListFragment
        }

        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }
}
