package com.my_company.atm24_app.activitiesClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.my_company.atm24_app.R;

public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        EditText multiText = (EditText) findViewById(R.id.multiComment);
        Button readyBtn = (Button) findViewById(R.id.readyBtn2);

        readyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommentActivity.this,OrderTotalInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
