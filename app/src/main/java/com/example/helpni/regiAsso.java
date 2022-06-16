package com.example.helpni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.Objects;

public class regiAsso extends AppCompatActivity {

    Button btnCrea;
    String[] items = {"Shelter","Food","Health",};
    AutoCompleteTextView autoComTxt;
    ArrayAdapter <String> adapterItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_regi_asso);

        btnCrea=findViewById(R.id.button);


        autoComTxt = findViewById(R.id.autoCom);
        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item_resources,items);
        autoComTxt.setAdapter(adapterItems);
        autoComTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=adapterView.getItemAtPosition(i).toString();
            }
        });
     btnCrea.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(regiAsso.this,HomeAsso.class);
             startActivity(i);
             finish();
         }
     });
    }
    public void login(View v){
        Intent i=new Intent(regiAsso.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}