package com.my_company.atm24_app.activitiesClasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.my_company.atm24_app.R;

public class OrderTotalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_total_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.ticket);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageButton settings = (ImageButton) findViewById(R.id.settingsImageButton);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(OrderTotalInfoActivity.this,view);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId()){
                            case R.id.first: //photo
                                Intent intent = new Intent(OrderTotalInfoActivity.this,PhotoAdding.class);
                                startActivity(intent);
                                return true;
                            case R.id.second://comment
                                Intent intent2 = new Intent(OrderTotalInfoActivity.this,CommentActivity.class);
                                startActivity(intent2);
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new SampleFragmentAdapter(getSupportFragmentManager(),OrderTotalInfoActivity.this));

        tabLayout.setupWithViewPager(viewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderTotalInfoActivity.this,WorkTimeActivity.class);
                startActivity(intent);
            }
        });
    }

}
