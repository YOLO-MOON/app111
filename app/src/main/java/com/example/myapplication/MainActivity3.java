package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private ImageView button;
    private TextView username1;
    private TextView password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
    }
    private void initView(){
        button = findViewById(R.id.button111);
        username1 = findViewById(R.id.et_account222);
        password1 = findViewById(R.id.et_password2131);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {
        String account =username1.getText().toString();
        String password =password1.getText().toString();
        Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();


    }
}
