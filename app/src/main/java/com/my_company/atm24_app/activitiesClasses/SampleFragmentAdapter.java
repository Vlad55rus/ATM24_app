package com.my_company.atm24_app.activitiesClasses;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleFragmentAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Проблема", "Информация"};
    private Context context;

    public SampleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override public int getCount() {
        return PAGE_COUNT;
    }

    @Override public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
