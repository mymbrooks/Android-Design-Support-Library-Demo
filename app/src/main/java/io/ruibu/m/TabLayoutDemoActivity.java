package io.ruibu.m;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import io.ruibu.adapter.TablayoutFragmentPagerAdapter;

public class TabLayoutDemoActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private TabLayout tl;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tab_layout_demo);

            tl = (TabLayout) findViewById(R.id.tl);
            tl.setTabTextColors(Color.WHITE, Color.GRAY);

            vp = (ViewPager) findViewById(R.id.vp);
            List<Fragment> listFragment = new ArrayList<>();
            listFragment.add(new Tab1Fragment());
            listFragment.add(new Tab2Fragment());
            listFragment.add(new Tab3Fragment());

            TablayoutFragmentPagerAdapter adapter = new TablayoutFragmentPagerAdapter(getSupportFragmentManager(), listFragment);
            vp.setAdapter(adapter);
            vp.setCurrentItem(0);
            vp.setOffscreenPageLimit(2);
            vp.addOnPageChangeListener(this);

            tl.setupWithViewPager(vp);
            tl.setTabsFromPagerAdapter(adapter);
        } catch (Exception e) {
            Log.d("Tabs", e.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tab_layout_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
