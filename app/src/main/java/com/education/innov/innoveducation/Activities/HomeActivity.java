package com.education.innov.innoveducation.Activities;

import android.app.SearchManager;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.education.innov.innoveducation.Fragment.ClasseFragment;
import com.education.innov.innoveducation.Fragment.LeftFragmentNaviguation;
import com.education.innov.innoveducation.Fragment.ListActivitiesFragment;
import com.education.innov.innoveducation.Fragment.ProfileFragment;
import com.education.innov.innoveducation.Fragment.RightFragmentNaviguation;
import com.education.innov.innoveducation.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class HomeActivity extends AppCompatActivity {
    private TextView messageView;
    private SearchView searchView;
    Toolbar toolbar;
    private android.view.Menu m = null;
    boolean doubleBackToExitPressedOnce = false;
    DrawerLayout drawerLayout ;
    LeftFragmentNaviguation drawerLeftFragment ;
    RightFragmentNaviguation drawerRightFragment ;
    private Fragment currentFragment=null;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*** ToolBar ***.
         *
         */
        // Find the toolbar view inside the activity layout
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setUpToolbar();
        setUpDrawer();

        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
               // if(currentFragment!=null)
                   // getSupportFragmentManager().beginTransaction().remove(currentFragment);
                switch (tabId) {
                    case R.id.tab_classroom:
                        currentFragment=new ClasseFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_id, currentFragment).
                                addToBackStack("gg").
                                commit();

                        //      Toast.makeText(getApplicationContext(), tabId+"tabIdSelected", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.tab_friends:
                        currentFragment=new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_id, currentFragment).commit();
                        break;

                    default:
                        return;
                }
            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {

                Toast.makeText(getApplicationContext(), tabId + "", Toast.LENGTH_LONG).show();
            }
        });


        //BottomBarTab nearby = bottomBar.getTabWithId(R.id.tab_nearby);
        //nearby.setBadgeCount(5);
    }

    private void setUpToolbar() {

        //toolbar.setTitle("Associations Tunisiennes");
        toolbar.inflateMenu(R.menu.menu_main);
        //toolbar.setVisibility(View.INVISIBLE);
        m = toolbar.getMenu();
        //m.getItem(0).getsetVisible(false);
        setSupportActionBar(toolbar);
    }

    private void setUpDrawer() {

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        // to lock swipe left and right
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        drawerLeftFragment = (LeftFragmentNaviguation) getSupportFragmentManager().findFragmentById(R.id.nav_drw_left_fragment);
        drawerRightFragment = (RightFragmentNaviguation) getSupportFragmentManager().findFragmentById(R.id.nav_drw_right_fragment);
        drawerLeftFragment.setUpDrawer(drawerLayout, toolbar);
        drawerRightFragment.setUpDrawer(drawerLayout, toolbar);

    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Inflate menu to add items to action bar if it is present.
        inflater.inflate(R.menu.menu_main, menu);
        // Associate searchable configuration with the SearchView
        int id =0;

        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));


        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.id_chat) {
            drawerLayout.openDrawer(GravityCompat.END); /*Opens the Right Drawer*/
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //super.onBackPressed();
            //MainActivity.this.finish();


            if (doubleBackToExitPressedOnce) {
                moveTaskToBack(true);
                return;
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "clicker une autre fois pour sortir", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }
    }

}
