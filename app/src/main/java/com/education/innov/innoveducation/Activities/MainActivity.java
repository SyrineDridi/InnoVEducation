package com.education.innov.innoveducation.Activities;

import android.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.education.innov.innoveducation.Adapter.ClassePagerAdapter;
import com.education.innov.innoveducation.Adapter.ViewPagerAdapter;
import com.education.innov.innoveducation.R;

public class MainActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager=(ViewPager)findViewById(R.id.VpPager);
        pager.setAdapter(buildAdapter());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.event_sliding_tabs);
        tabLayout.setupWithViewPager(pager);

    }

    private PagerAdapter buildAdapter() {
        return(new ClassePagerAdapter(this, getSupportFragmentManager()));
    }
}