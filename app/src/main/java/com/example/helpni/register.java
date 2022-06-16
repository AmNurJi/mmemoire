package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class register extends AppCompatActivity {

    Button btnCre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register);

        btnCre =findViewById(R.id.button2);

        btnCre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(register.this,HomeSign.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void login(View v){

        Intent i=new Intent(register.this,MainActivity.class);
        startActivity(i);
        finish();
    }



}