package com.rongchaozhou.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new SightseeingFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else if (position == 3) {
            return new ShoppingFragment();
        } else {
            return new NightLifeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_city);
        } else if (position == 1) {
            return mContext.getString(R.string.category_sightseeing);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museum);
        } else if (position == 3) {
            return mContext.getString(R.string.category_shopping);
        } else {
            return mContext.getString(R.string.category_night_life);
        }
    }
}
