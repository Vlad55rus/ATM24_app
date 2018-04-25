package com.my_company.atm24_app.activitiesClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.my_company.atm24_app.R;

public class WorksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_works);

        Button standartWorksBtn = (Button) findViewById(R.id.standartWorkBtn);
        Button ownWorksBtn = (Button) findViewById(R.id.ownWorksBtn);
        Button nextBtn = (Button) findViewById(R.id.nextBtn2);
        EditText worksText = (EditText) findViewById(R.id.worksText);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Bundle bundle = new Bundle();
        //TODO получение текста с активити
        standartWorksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorksActivity.this,StandartWorksActivity.class);
                startActivity(intent);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorksActivity.this,PhotoAdding.class);
                startActivity(intent);
            }
        });
    }
}
