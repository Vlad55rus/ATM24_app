package com.my_company.atm24_app.activitiesClasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.my_company.atm24_app.R;

public class StandartWorksActivity extends AppCompatActivity {

    protected String textForPreviousActivity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standart_works);

//        Button nextBtn = (Button) findViewById(R.id.nextBtn3);
//
//        Button testPOBtn = (Button) findViewById(R.id.testPOBtn);
//        Button replaceJournal = (Button) findViewById(R.id.replaceJournal);
//        Button testBtn = (Button) findViewById(R.id.testBtn);
//        Button pickingElectrBtn = (Button) findViewById(R.id.pickingElectrBtn);
//        Button checkingBtn = (Button) findViewById(R.id.checkingBtn);
//
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
//
//        final EditText textAdded = (EditText) findViewById(R.id.textAdded);
//
//        testBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textForPreviousActivity += " Тестирование;";
//                textAdded.setText(textForPreviousActivity);
//            }
//        });
//        testPOBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textForPreviousActivity += " Тестирование ПО;";
//                textAdded.setText(textForPreviousActivity);
//            }
//        });
//        replaceJournal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textForPreviousActivity += " Замена журнальной ленты;";
//                textAdded.setText(textForPreviousActivity);
//            }
//        });
//        pickingElectrBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textForPreviousActivity += " Снятие электронного журнала;";
//                textAdded.setText(textForPreviousActivity);
//            }
//        });
//        checkingBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textForPreviousActivity += " Осмотр;";
//                textAdded.setText(textForPreviousActivity);
//            }
//        });
//
//        textAdded.setText(textForPreviousActivity);
//
//        nextBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(StandartWorksActivity.this,WorksActivity.class);
//               // Bundle bundle = new Bundle();
//               // bundle.getChar(textAdded.toString());
//                startActivity(intent);
//            }
//        });
    }
}
