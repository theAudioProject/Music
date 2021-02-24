package com.example.musicplayer.ui.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.musicplayer.fragments_home.albumtab;
import com.example.musicplayer.fragments_home.artisttab;
import com.example.musicplayer.fragments_home.favtab;
import com.example.musicplayer.fragments_home.foldertab;
import com.example.musicplayer.fragments_home.genretab;
import com.example.musicplayer.fragments_home.playlisttab;
import com.example.musicplayer.fragments_home.songtab;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int noOfTabs;

    public PageAdapter(@NonNull FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    public PageAdapter(@NonNull FragmentManager fm, int behavior, int noOfTabs) {
        super(fm, behavior);
        this.noOfTabs = noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new songtab();
            case 1:
                return new albumtab();
            case 2:
                return new artisttab();
            case 3:
                return new genretab();
            case 4:
                return new playlisttab();
            case 5:
                return new foldertab();
            case 6:
                return new favtab();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}