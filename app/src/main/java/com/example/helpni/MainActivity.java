package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        }
        public void register(View v){

            Intent i=new Intent(MainActivity.this,doYouRegister.class);
            startActivity(i);
        }

    public void re(View v){
        Intent i=new Intent(MainActivity.this,Message.class);
        startActivity(i);
    }

}
