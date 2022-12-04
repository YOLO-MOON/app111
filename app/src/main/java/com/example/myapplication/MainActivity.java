package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mIvIcon;
    private EditText mEtAccount;
    private EditText mEtPassword;
    private Button mBtnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        mIvIcon = findViewById(R.id.iv_icon);
        mEtAccount = findViewById(R.id.et_account1);
        mEtPassword = findViewById(R.id.et_password);
        mBtnlogin = findViewById(R.id.btn_login);
        mBtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }
    private void login(){
        String account =mEtAccount.getText().toString();
        String password =mEtPassword.getText().toString();
        if(account.equals("123456")&&password.equals("123456")) {
            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);

        }
        else   Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();

    }

}