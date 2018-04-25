package com.my_company.atm24_app.activitiesClasses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.my_company.atm24_app.R;


//TODO чекбокс
public class SettingsActivity extends Activity {
    private String identificator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

        CheckBox check = (CheckBox) findViewById(R.id.checkBoxColorsShow);
        Button btn = (Button) findViewById(R.id.btn);

        if(check.isChecked()){
//            switch(requestsArray.get(position).getStatus()){
//                case "1111":
//                    holder.btn.setBackgroundColor(Color.GREEN);
//                    break;
//                case "1234":
//                    holder.btn.setBackgroundColor(Color.YELLOW);
//                    break;
//            }
        }

        EditText ident = findViewById(R.id.id_textfield);
        identificator = ident.getText().toString();

        Button donebtn = findViewById(R.id.doneBtn);
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
