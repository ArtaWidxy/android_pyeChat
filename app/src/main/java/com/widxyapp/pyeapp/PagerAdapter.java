package com.widxyapp.pyeapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.widxyapp.pyeapp.Fragments.ChatsFragment;
import com.widxyapp.pyeapp.Fragments.UsersFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new ChatsFragment();
            case 1 :
                return new UsersFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0){
            title = "Chats";
        } else if (position == 1){
            title = "Users";
        }
        return title;
    }
}











