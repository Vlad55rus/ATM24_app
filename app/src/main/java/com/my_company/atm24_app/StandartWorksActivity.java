package com.my_company.atm24_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StandartWorksActivity extends AppCompatActivity {

    protected StringBuilder textForPreviousActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standart_works);

        Button nextBtn = (Button) findViewById(R.id.nextBtn3);

        Button testPOBtn = (Button) findViewById(R.id.testPOBtn);
        Button replaceJournal = (Button) findViewById(R.id.replaceJournal);
        Button testBtn = (Button) findViewById(R.id.testBtn);
        Button pickingElectrBtn = (Button) findViewById(R.id.pickingElectrBtn);
        Button checkingBtn = (Button) findViewById(R.id.checkingBtn);

        final EditText textAdded = (EditText) findViewById(R.id.textAdded);

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textForPreviousActivity.append(R.string.tests_string);
            }
        });
        testPOBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textForPreviousActivity.append(R.string.testPO_string);
            }
        });
        replaceJournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textForPreviousActivity.append(R.string.replaceJournal_string);
            }
        });
        pickingElectrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textForPreviousActivity.append(R.string.pickingElectr_string);
            }
        });
        checkingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textForPreviousActivity.append(R.string.checking_string);
            }
        });

        textAdded.setText(textForPreviousActivity);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StandartWorksActivity.this,WorksActivity.class);
                Bundle bundle = new Bundle();
                bundle.getChar(textAdded.toString());
                startActivity(intent,bundle);
            }
        });
    }
}
