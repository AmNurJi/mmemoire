package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AssoProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_asso_profile);
    }

    public void re(View v) {
        Intent i = new Intent(AssoProfile.this, SendMsgg.class);
        startActivity(i);
    }
}