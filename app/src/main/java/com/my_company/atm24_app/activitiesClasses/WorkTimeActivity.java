package com.my_company.atm24_app.activitiesClasses;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.my_company.atm24_app.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WorkTimeActivity extends AppCompatActivity {

    boolean timeOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worktime);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();

        final EditText arriveTime = (EditText) findViewById(R.id.arriveTime2);
        final EditText startWorkTime = (EditText) findViewById(R.id.startWorkTime2);
        final EditText endWorkTime = (EditText) findViewById(R.id.endWorkTime2);
        final EditText awayTime = (EditText) findViewById(R.id.awayTime);

        Button doneBtn = (Button) findViewById(R.id.doneBtn);

        final AlertDialog.Builder builder = new AlertDialog.Builder(WorkTimeActivity.this);
        builder.setTitle("Предупреждение")
                .setMessage("Заполните все поля")
                .setCancelable(false)
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        final AlertDialog.Builder builderTwo = new AlertDialog.Builder(WorkTimeActivity.this);
        builderTwo.setTitle("Предупреждение")
                .setMessage("Некорректно заполнено время")
                .setCancelable(false)
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });


        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String arrive = arriveTime.getText().toString();
                final String start = startWorkTime.getText().toString();
                final String end = endWorkTime.getText().toString();
                final String away = awayTime.getText().toString();


                try {

                    DateFormat format = new SimpleDateFormat("HH:mm",new Locale("en"));

                    Date arrive_time = format.parse(arrive);
                    Date start_time = format.parse(start);
                    Date end_time = format.parse(end);
                    Date away_time = format.parse(away);

                    long arriveMills = arrive_time.getTime();
                    long startMills = start_time.getTime();
                    long endMills = end_time.getTime();
                    long awayMills = away_time.getTime();

                    if((startMills > arriveMills) && (endMills > startMills) && (awayMills > endMills)) {

                        timeOk = true;
                    }
                    else
                        timeOk = false;
                }
                catch (ParseException e){
                    e.printStackTrace();
                }

                if(arrive.isEmpty() || start.isEmpty() || end.isEmpty() || away.isEmpty()){
                    AlertDialog alert = builder.create();
                    alert.show();
                }
                else if(!timeOk){
                    AlertDialog alertTwo = builderTwo.create();
                    alertTwo.show();
                }
                else{
                    //TODO здесь будет запись в бд
                    Intent intent = new Intent(WorkTimeActivity.this,StatusesActivity.class);
                    startActivity(intent);
                }
            }
        });




    }
}
