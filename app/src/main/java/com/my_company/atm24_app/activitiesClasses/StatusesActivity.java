package com.my_company.atm24_app.activitiesClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.my_company.atm24_app.R;

import java.util.ArrayList;

public class StatusesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_status);

        Button doneBtn = findViewById(R.id.nextBtn);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //TODO так как это будет по определнному заказу то в каждом клике менять статус заявки!
        //UPD Надо лишь в соответствующее поля БД записывать

        ArrayList<Status> arrList = new ArrayList<>();
        Status sva = new Status("Завершен");
        arrList.add(sva);

        mRecyclerView = (RecyclerView) findViewById(R.id.recViewStatuses);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new StatusAdapter(arrList,StatusesActivity.this);
        mRecyclerView.setAdapter(mAdapter);

        //TODO btns set status to request , add to DB
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StatusesActivity.this,WorksActivity.class);
                startActivity(intent);
            }
        });
    }
}
