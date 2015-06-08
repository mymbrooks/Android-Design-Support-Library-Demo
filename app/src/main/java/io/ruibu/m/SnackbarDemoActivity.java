package io.ruibu.m;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SnackbarDemoActivity extends AppCompatActivity {
    private CoordinatorLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_demo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        cl = (CoordinatorLayout) findViewById(R.id.cl);
        Snackbar snackbar = Snackbar
                .make(cl, "提示栏", Snackbar.LENGTH_LONG)
                .setAction("我知道了", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackbarDemoActivity.this, "我知道了", Toast.LENGTH_SHORT).show();
                    }
                });

        snackbar.show();
    }
}