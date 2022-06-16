package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SendMsgg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_send_msgg);
    }
}