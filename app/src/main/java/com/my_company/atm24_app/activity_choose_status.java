package com.my_company.atm24_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_choose_status extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_status);

        Button onWorkBtn = findViewById(R.id.onWorkBtn);
        Button onTestBtn = findViewById(R.id.onTestBtn);
        Button completeBtn = findViewById(R.id.completeBtn);
        Button needIncasBtn = findViewById(R.id.needIncasBtn);
        Button doneBtn = findViewById(R.id.nextBtn);

        //TODO btns set status to request , add to DB
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_choose_status.this,WorksActivity.class);
                startActivity(intent);
            }
        });
    }
}
