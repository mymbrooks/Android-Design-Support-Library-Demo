package io.ruibu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Brooks on 2015-06-13.
 */
public class TablayoutFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> listFragment;

    public TablayoutFragmentPagerAdapter(FragmentManager fm, List<Fragment> listFragment) {
        super(fm);

        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab1";
            case 1:
                return "Tab2";
            case 2:
                return "Tab3";
            default:
                return "";
        }
    }
}