package com.my_company.atm24_app.activitiesClasses;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.my_company.atm24_app.R;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoAdding extends AppCompatActivity {

    private static final int CAMERA_PIC_REQUEST = 1;
    String photodir;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_adding);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Button photoAddBtn = (Button) findViewById(R.id.photoAddBtn);
        Button readyBtn = (Button) findViewById(R.id.readyBtn);

        photoAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Намерение для запуска камеры
                    Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()); // название из даты

                    File file = new File(Environment.getExternalStorageDirectory(),timeStamp+".png");
                    Uri photodir1 = Uri.fromFile(file);

                    captureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photodir1);
                    startActivityForResult(captureIntent, CAMERA_PIC_REQUEST);

                    // записываю путь в String photodir
                   // photodir = photodir1.toString();
                    path = "file:///storage/emulated/0/20140311083841.png";
                    Uri uri = Uri.parse(path);


                } catch (ActivityNotFoundException e) {
                    // Выводим сообщение об ошибке
                    String errorMessage = "Ваше устройство не поддерживает съемку";
                    Toast toast = Toast.makeText(PhotoAdding.this, errorMessage, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
//TODO проверить работает ли )
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                // Вернулись от приложения Камера
                if (requestCode == CAMERA_PIC_REQUEST) {
                    if(data==null){

                        // передаём его в ImageView
                        ImageView picView = (ImageView)findViewById(R.id.imageView);

                        // пытаюсь по String photodir отобразить картинку
                        picView.setImageURI(Uri.fromFile(new File(photodir)));
                    }
                }
            }
        });

        readyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhotoAdding.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
