package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button mBtnregister;
    private ImageView image1;
    private ImageView image2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }
    private void initView(){

        image1 = findViewById(R.id.imageView1);
        image2 = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView2);
        mBtnregister = findViewById(R.id.button);
        mBtnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }
    private void register() {
        Toast.makeText(MainActivity2.this,"开始注册",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

}
