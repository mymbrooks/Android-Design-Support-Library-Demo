package io.ruibu.m;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private DrawerLayout dl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout) findViewById(R.id.dl);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        NavigationView nv = (NavigationView) findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_sub_item_1:
                        intent = new Intent();
                        intent.setClass(MainActivity.this, TextInputLayoutDemoActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_sub_item_2:
                        intent = new Intent();
                        intent.setClass(MainActivity.this, FloatingActionButtonDemoActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_sub_item_3:
                        intent = new Intent();
                        intent.setClass(MainActivity.this, SnackbarDemoActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_sub_item_4:
                        intent = new Intent();
                        intent.setClass(MainActivity.this, TabLayoutDemoActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_sub_item_5:
                        intent = new Intent();
                        intent.setClass(MainActivity.this, CoordinatorLayoutDemoActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

                dl.closeDrawers();

                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                dl.openDrawer(GravityCompat.START);
                break;
            default:
                break;
        }

        return true;
    }
}