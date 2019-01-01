package com.example.lawrencebattle.iot_final_project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;

public class home_main extends AppCompatActivity implements View.OnClickListener{


    public Button  Logout,Alarm,webcam;
    String url = "http://192.168.1.68/html/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);


        Logout = (Button) findViewById(R.id.Logout);
        Alarm = (Button) findViewById(R.id.Alarm);
        webcam = (Button) findViewById(R.id.Webcam);

        Alarm.setOnClickListener(home_main.this);
        Logout.setOnClickListener(home_main.this);
        webcam.setOnClickListener(home_main.this);


    }

    @Override
    public void onClick(View v) {

        if(v == Logout){
            Intent intent = new Intent(getApplicationContext(),  MainActivity.class);
            startActivity(intent);        }
        if(v == Alarm){
            Intent intent2 = new Intent(getApplicationContext(), alarmSystem.class);
            startActivity(intent2);        }
        if(v == webcam){
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent3);        }

    }
}
