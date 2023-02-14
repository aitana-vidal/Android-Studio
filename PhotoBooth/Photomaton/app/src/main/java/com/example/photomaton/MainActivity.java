package com.example.photomaton;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    private FloatingActionButton camera, save, calendar, exit;
    private ImageView photo;
    private EditText title;
    private Bitmap bmp;
    private String time, d, m , y, h, min;
    private DateFormat  tf;
    Date currentTime = Calendar.getInstance().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        camera = findViewById(R.id.camera);
        save = findViewById(R.id.save);
        calendar = findViewById(R.id.calendar);
        exit = findViewById((R.id.salida));
        save.setVisibility(View.GONE);
        calendar.setVisibility(View.GONE);
        //image
        photo = findViewById(R.id.photo);
        //edittext
        title = findViewById(R.id.name);

        //permisions
        checkCameraPermission();
        //buttons code
        //camera button
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id;
                id = view.getId();
                switch (id) {
                    case R.id.camera:
                        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(i, 0);
                        break;}
            }
        });

        //save button
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(title.getText());
                if(!name.equals("")){
                MediaStore.Images.Media.insertImage(getContentResolver(), bmp, name , "ey");
                Toast.makeText(getApplicationContext(), "Saved on Gallery", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "No image title", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //calendar button
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });


        //exit button

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        

    }
    //permissions
    private void checkCameraPermission() {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            Log.i("Warning", "The app hasn´t got camera permissions");
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.CAMERA}, 225);}
        else {Log.i("Message", "You have camera permissions");}}
    //camera intent result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            Bundle ext = data.getExtras();
            bmp = (Bitmap) ext.get("data");
            photo.setImageBitmap(bmp);
            //enables save and calendar buttons
            save.setVisibility(View.VISIBLE);
            calendar.setVisibility(View.VISIBLE);
            //changes editext to actual formatted date
            y = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
            m = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
            d = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
            tf = DateFormat.getTimeInstance(DateFormat.SHORT);
            DateFormat.getDateTimeInstance();
            time = y + "/" + m + "/" + d + " " + tf.format(currentTime);
            title.setText(time);
        }else{
            Toast.makeText(getApplicationContext(), "Picture not taken :(", Toast.LENGTH_SHORT).show();
        }
    }
    //calendar
    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH)+1,
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        tf = DateFormat.getTimeInstance(DateFormat.SHORT);
        time = y + "/" + m + "/" + d + " " + tf.format(currentTime);
        title.setText(time);
    }

}