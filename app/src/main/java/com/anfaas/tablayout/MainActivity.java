package com.anfaas.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager adapter =getSupportFragmentManager() ;
         pagerAdapter adapter1=new pagerAdapter(adapter);
         adapter1.addFragment(new fragmentOne(),"first");
         adapter1.addFragment(new fragmentTwo(),"second");


        ViewPager pager= findViewById(R.id.pager);
        TabLayout tabLayout=findViewById(R.id.tab);
        pager.setAdapter(adapter1);
tabLayout.setupWithViewPager(pager);
    }
}
