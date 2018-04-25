package com.my_company.atm24_app.activitiesClasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;


import com.my_company.atm24_app.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public ArrayList<Order> requestsArray = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Order order = new Order("12345444","1234","г.Омск ул.Капенгаген","14.04 15:20");
        Order reqView2 = new Order("132456","1111","г.Омск ул. Лукашевича 21","14.04 12:30");
        Order reqView = new Order("11111","1111","г.Омск ул. Мира","10.01 15:00");
        requestsArray.add(order);
        requestsArray.add(reqView2);
        requestsArray.add(reqView);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new OrderAdapter(requestsArray,MainActivity.this);
        mRecyclerView.setAdapter(mAdapter);

        ImageButton settingss = (ImageButton) findViewById(R.id.settingsImage);
        settingss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                popupMenu.inflate(R.menu.popup_menu_main);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId()){
                            case R.id.sets:
                                Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
                                //TODO подумать как передать статус  bundle.putStringArrayList("requests_status",requestsArray.;);
                                //И нкжно ли если будет бд и если можно спрашивать и красить там
                                startActivity(intent);
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });
    }

}
