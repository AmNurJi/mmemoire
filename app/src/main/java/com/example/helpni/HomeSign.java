package com.example.helpni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeSign extends AppCompatActivity {

    private ListView lsAsso;
    ArrayList<AssoItem> arag;
    C_agent c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sign);
       getSupportActionBar().setTitle("Associations");

        lsAsso=findViewById(R.id.listassoo);
        arag=new ArrayList<AssoItem>();
        arag.add(new AssoItem("Association","Shelter","8:00-18:00"));
        c=new C_agent(arag);
        lsAsso.setAdapter(c);

       /* AssoItem a=new AssoItem(editprenom.getText().toString(),Integer.parseInt(editage.getText().toString()));
        arag.add(a);

        */
        c.notifyDataSetChanged();
        lsAsso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent inn=new Intent(HomeSign.this,AssoProfile.class);
                startActivity(inn);

            }
        });

    }

    class C_agent extends BaseAdapter {

        ArrayList<AssoItem> arr_asso;
        public C_agent(ArrayList<AssoItem> la){
            this.arr_asso=la;
        }

        @Override
        public int getCount() {
            return arr_asso.size();
        }

        @Override
        public Object getItem(int i) {
            return arr_asso.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li=getLayoutInflater();
            View v =li.inflate(R.layout.list_asso,null);

            TextView txtnom,txtres,txtheure;

           txtnom =v.findViewById(R.id.txtnom);
           txtres=v.findViewById(R.id.txtres);
            txtheure=v.findViewById(R.id.txtheure);

            txtnom.setText(arr_asso.get(i).nom);
            txtres.setText(arr_asso.get(i).res);
            txtheure.setText(arr_asso.get(i).tim);

            return v;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sign,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.sentmesg){
            Intent i=new Intent(HomeSign.this,MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}