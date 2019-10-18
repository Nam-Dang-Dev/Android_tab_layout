package com.example.layout_tab;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.layout_tab.Fragment.firstFragment;
import com.example.layout_tab.Fragment.secondFragment;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {

        if(position ==0){
            firstFragment tabOne = new firstFragment();
            return tabOne;
        }else if (position == 1){
            secondFragment tabTwo = new secondFragment();
            return tabTwo;

        }
        return null;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }


}
