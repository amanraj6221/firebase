package com.triyoka.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mRegisterBtn, mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRegisterBtn = findViewById(R.id.Register_btn);
        mLoginBtn = findViewById(R.id.login_btn);

        mRegisterBtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }

        });
        //handle login button click
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start LoginActivity
                startActivity(new Intent(MainActivity.this, LoginActivity.class));

            }
        });

    }
}