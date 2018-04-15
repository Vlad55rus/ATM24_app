package com.my_company.atm24_app;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;




import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public ArrayList<RequestView> requestsArray = new ArrayList<>();

    //Drawable dividerDrawable = ContextCompat.getDrawable(this,R.drawable.ic_search); //TODO R.drawable.COLOR from DB ????


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        final RequestView requestView = new RequestView("12345444","1234","г.Омск ул.Капенгаген","14.04 15:20");
        RequestView reqView = new RequestView("11111","1111","г.Омск ул. Мира","10.01 15:00");
        requestsArray.add(requestView);
        requestsArray.add(reqView);

        Works works = new Works();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RequestAdapter(requestsArray,MainActivity.this);
        mRecyclerView.setAdapter(mAdapter);

        ImageButton settingss = findViewById(R.id.settingsImage);
        settingss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });


    }

}