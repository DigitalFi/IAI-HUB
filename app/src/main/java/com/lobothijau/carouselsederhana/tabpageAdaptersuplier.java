package com.lobothijau.carouselsederhana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Muhammad on 9/2/2018.
 */

public class tabpageAdaptersuplier extends FragmentStatePagerAdapter {

    String[] tabaray = new String[]{"News","Inspiration","My Stock",};
    Integer tabnumber = 3;

    public tabpageAdaptersuplier(FragmentManager fm) {
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
                SevenFragment f7 = new SevenFragment();
                return f7;
            case 1:
                EightFragment f8 = new EightFragment();
                return f8;
            case 2:
                NineFragment f9 = new NineFragment();
                return f9;
        }
        return null;
    }

}
