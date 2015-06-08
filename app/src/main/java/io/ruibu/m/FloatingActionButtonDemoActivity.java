package io.ruibu.m;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FloatingActionButtonDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_demo);

        FloatingActionButton fbtn = (FloatingActionButton) findViewById(R.id.fbtn);
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloatingActionButtonDemoActivity.this, "你点击了浮动按钮！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}