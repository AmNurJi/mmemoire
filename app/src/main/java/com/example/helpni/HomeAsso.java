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

public class HomeAsso extends AppCompatActivity {


    private ListView lsA;
    ArrayList<MsgItem> ara;
    C_agent d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_asso);
        getSupportActionBar().setTitle("Messages");

        lsA=findViewById(R.id.listmsg);
        ara=new ArrayList<MsgItem>();
        ara.add(new MsgItem("Nourhane h","12:03"));
        d=new C_agent(ara);
        lsA.setAdapter(d);

       /* AssoItem a=new AssoItem(editprenom.getText().toString(),Integer.parseInt(editage.getText().toString()));
        arag.add(a);

        */
        d.notifyDataSetChanged();

        lsA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent inn=new Intent(HomeAsso.this,Message.class);
                startActivity(inn);

            }
        });
    }

    class C_agent extends BaseAdapter {

        ArrayList<MsgItem> arr_sign;
        public C_agent(ArrayList<MsgItem> la){
            this.arr_sign=la;
        }

        @Override
        public int getCount() {
            return arr_sign.size();
        }

        @Override
        public Object getItem(int i) {
            return arr_sign.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li=getLayoutInflater();
            View v =li.inflate(R.layout.list_v,null);

            TextView txtnom,txtheure;

            txtnom =v.findViewById(R.id.textView9);
            txtheure=v.findViewById(R.id.textView17);

            txtnom.setText(arr_sign.get(i).nomm);
            txtheure.setText(arr_sign.get(i).timm);

            return v;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.posrep){
            Intent i=new Intent(HomeAsso.this,MainActivity.class);
            startActivity(i);
        }
       else if(id==R.id.negarep){
            Intent d=new Intent(HomeAsso.this,AssoProfile.class);
            startActivity(d);
        }





        return super.onOptionsItemSelected(item);
    }
}