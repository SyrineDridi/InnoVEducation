package com.education.innov.innoveducation.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.education.innov.innoveducation.Fragment.ActivitiesFragment;
import com.education.innov.innoveducation.Fragment.CoursesFragment;
import com.education.innov.innoveducation.Fragment.HomeFragment;
import com.education.innov.innoveducation.Fragment.HomeworksFragment;
import com.education.innov.innoveducation.Fragment.ListActivitiesFragment;
import com.education.innov.innoveducation.Fragment.LoginFragment;
import com.education.innov.innoveducation.Fragment.RegisterFragment;
/**
 * Created by Syrine on 03/04/2017.
 */
public class ClassePagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;
    private static Fragment fg;
    Context ctx = null;
    private FragmentManager mFragmentManager;

    public ClassePagerAdapter(Context ctx, FragmentManager fragmentManager) {
        super(fragmentManager);
        mFragmentManager = fragmentManager;
        this.ctx = ctx;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return ListActivitiesFragment.newInstance(0, "Home");
            case 1:
                return CoursesFragment.newInstance(1, "Courses");
            case 2 :
                return  HomeworksFragment.newInstance(2,"Homeworks");
            default:
                return null;
        }
    }
    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Courses";
            case 2 :
                return "Homeworks";
        }
        return "default";
    }

}