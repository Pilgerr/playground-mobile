package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.playgroundmobile.R;

public class MainActivity extends AppCompatActivity {

    Button btn_open_registerUserActivity;
    Button btn_open_viewUserActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open_registerUserActivity = findViewById(R.id.btn_open_registerUserAcitivity);
        btn_open_viewUserActivity = findViewById(R.id.btn_open_viewUserAcitivity);

        btn_open_registerUserActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterUser.class));
            }
        });

        btn_open_viewUserActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ViewUsers.class));
            }
        });
    }
}