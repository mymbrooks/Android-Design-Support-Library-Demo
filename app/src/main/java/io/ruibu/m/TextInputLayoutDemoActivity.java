package io.ruibu.m;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TextInputLayoutDemoActivity extends AppCompatActivity {
    private TextInputLayout tlUserName;
    private TextInputLayout tlPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinputlayout_demo);

        tlUserName = (TextInputLayout) findViewById(R.id.tlUserName);
        tlPassword = (TextInputLayout) findViewById(R.id.tlPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tlUserName.getEditText().getText().toString().equals("")) {
                    tlUserName.setError("用户名不能为空！");
                    return;
                }

                if (tlPassword.getEditText().getText().toString().equals("")) {
                    tlPassword.setError("密码不能为空！");
                    return;
                }

                Toast.makeText(TextInputLayoutDemoActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
            }
        });
    }

}