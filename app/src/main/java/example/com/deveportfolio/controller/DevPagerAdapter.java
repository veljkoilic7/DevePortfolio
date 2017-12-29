package example.com.deveportfolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import example.com.deveportfolio.views.AboutFragment;
import example.com.deveportfolio.views.ContactFragment;
import example.com.deveportfolio.views.SkillsFragment;
import example.com.deveportfolio.views.WorkFragment;

/**
 * Created by Korisnik on 13-Dec-17.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new AboutFragment();
            case 1:
                return new WorkFragment();
            case 2:
                return new SkillsFragment();
            case 3:
                return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "ABOUT";
            case 1:
                return "WORK";
            case 2:
                return "SKILLS";
            case 3:
                return "CONTACT";
        }

        return null;
    }
}
