package com.anfaas.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class pagerAdapter extends FragmentPagerAdapter
{
    List<Fragment> fragmentList=new ArrayList<>();
    List<String> fragmentName=new ArrayList<>();
    public pagerAdapter(@NonNull FragmentManager fm) {
                super(fm);
            }
            public  void addFragment(Fragment fragment,String name)
            {
                fragmentList.add(fragment);
                fragmentName.add(name);
            }
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }
            @Override
            public int getCount() {
                return fragmentList.size();
            }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return  fragmentName.get(position);
    }
}
