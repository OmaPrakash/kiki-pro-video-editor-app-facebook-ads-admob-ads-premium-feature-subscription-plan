package com.ridercode.provideo_editor.phototovideo.tablayout;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public abstract class SlidingTabAdapter extends FragmentPagerAdapter {

    protected abstract String getTitle(int position);

    protected abstract int getIcon(int position);

    public SlidingTabAdapter(FragmentManager fm) {
        super(fm);
    }
}