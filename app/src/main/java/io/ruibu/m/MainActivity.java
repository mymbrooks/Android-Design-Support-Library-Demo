package io.ruibu.m;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTextInputLayoutDemo = (Button) findViewById(R.id.btnTextInputLayoutDemo);
        btnTextInputLayoutDemo.setTransformationMethod(null);
        btnTextInputLayoutDemo.setOnClickListener(this);

        Button btnFloatingActionButtonDemo = (Button) findViewById(R.id.btnFloatingActionButtonDemo);
        btnFloatingActionButtonDemo.setOnClickListener(this);
        btnFloatingActionButtonDemo.setTransformationMethod(null);

        Button btnSnackbarDemo = (Button) findViewById(R.id.btnSnackbarDemo);
        btnSnackbarDemo.setOnClickListener(this);
        btnSnackbarDemo.setTransformationMethod(null);

        Button btnTabLayoutDemo = (Button) findViewById(R.id.btnTabLayoutDemo);
        btnTabLayoutDemo.setOnClickListener(this);
        btnTabLayoutDemo.setTransformationMethod(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTextInputLayoutDemo:
                intent = new Intent();
                intent.setClass(MainActivity.this, TextInputLayoutDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.btnFloatingActionButtonDemo:
                intent = new Intent();
                intent.setClass(MainActivity.this, FloatingActionButtonDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSnackbarDemo:
                intent = new Intent();
                intent.setClass(MainActivity.this, SnackbarDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.btnTabLayoutDemo:
                intent = new Intent();
                intent.setClass(MainActivity.this, TabLayoutDemoActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}