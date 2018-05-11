package com.teamphoenix.user.fragmentstute;

import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements PlusOneFragment.OnFragmentInteractionListener {
    SelectionsStatePageAdapter mSelectionsStatePageAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSelectionsStatePageAdapter = new SelectionsStatePageAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPage(viewPager);
        setViewPagerItem(0);
    }

    private void setupViewPage(ViewPager viewPager){
        SelectionsStatePageAdapter selectionsStatePageAdapter = new SelectionsStatePageAdapter(getSupportFragmentManager());
        selectionsStatePageAdapter.addFragment(new PlusOneFragment(),"PlusOneFragment");
        viewPager.setAdapter(selectionsStatePageAdapter);
    }
    public void setViewPagerItem(int item){
        viewPager.setCurrentItem(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
