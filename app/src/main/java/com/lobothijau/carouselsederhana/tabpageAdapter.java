package com.lobothijau.carouselsederhana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Muhammad on 8/31/2018.
 */
public class tabpageAdapter extends FragmentStatePagerAdapter {

    String[] tabaray = new String[]{"News","Inspiration","Portofolio"};
    Integer tabnumber = 3;

    public tabpageAdapter(FragmentManager fm) {
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
                OneFragment f1 = new OneFragment();
                return f1;
            case 1:
                TwoFragment f2 = new TwoFragment();
                return f2;
            case 2:
                ThreeFragment f3 = new ThreeFragment();
                return f3;
        }
        return null;
    }
}
