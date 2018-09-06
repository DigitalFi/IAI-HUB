package com.lobothijau.carouselsederhana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Muhammad on 9/1/2018.
 */

public class tabpageAdapterpublic extends FragmentStatePagerAdapter {

    String[] tabaray = new String[]{"News","Inspiration","My Project",};
    Integer tabnumber = 3;

    public tabpageAdapterpublic(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabaray [position];
    }

    @Override
    public  int getCount(){
        return tabnumber;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                FourFragment f4 = new FourFragment();
                return f4;
            case 1:
                FiveFragment f5 = new FiveFragment();
                return f5;
            case 2:
                SixFragment f6 = new SixFragment();
                return f6;
        }
        return null;
    }

}
