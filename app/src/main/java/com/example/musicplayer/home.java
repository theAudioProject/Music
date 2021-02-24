package com.example.musicplayer;

import android.os.Bundle;

import com.example.musicplayer.ui.main.PageAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//import com.example.musicplayer.ui.main.SectionsPagerAdapter;

public class home extends AppCompatActivity {

    private static final String TAG = "home";

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabItem tabSongs, tabAlbum, tabArtist, tabGenre, tabPlaylist, tabFolder, tabFav;
    public PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabSongs = (TabItem) findViewById(R.id.home_tab1);
        tabAlbum = (TabItem) findViewById(R.id.home_tab2);
        tabArtist = (TabItem) findViewById(R.id.home_tab3);
        tabGenre = (TabItem) findViewById(R.id.home_tab4);
        tabPlaylist = (TabItem) findViewById(R.id.home_tab5);
        tabFolder = (TabItem) findViewById(R.id.home_tab6);
        tabFav = (TabItem) findViewById(R.id.home_tab7);

        viewPager = findViewById(R.id.view_pager);


        pageAdapter = new PageAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                Log.d(TAG, "onTabSelected: " + tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 1:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 2:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 3:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 4:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 5:
                        pageAdapter.notifyDataSetChanged();
                        break;
                    case 6:
                        pageAdapter.notifyDataSetChanged();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        /*
        tabLayout.removeOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
         */

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}