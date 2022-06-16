package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class doYouRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_do_you_register);
    }

    public void asSignal(View v){
        Intent i=new Intent(doYouRegister.this,register.class);
        startActivity(i);
    }
    public void asAsso(View v){
        Intent i=new Intent(doYouRegister.this,regiAsso.class);
        startActivity(i);
    }
}