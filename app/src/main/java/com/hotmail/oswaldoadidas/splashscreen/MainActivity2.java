package com.hotmail.oswaldoadidas.splashscreen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);

        viewPager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }

    public class SectionPagerAdapter extends FragmentPagerAdapter {
        public SectionPagerAdapter(FragmentManager fm){
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {


            switch (position){

                case 0:
                    return new FragmentoA();
                case 1:
                    return new FragmentoB();
                case 2:
                    return new FragmentoC();
                case 3:
                    return new FragmentoD();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position){

            switch (position){

                case 0:
                    return "fragmento A";

                case 1:
                    return "fragmento B";
                case 2:
                    return "fragmento C";
                case 3:
                    return "fragmento D";


            }
            return null;
        }

    }





}

