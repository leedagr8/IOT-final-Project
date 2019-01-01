package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class utility extends AppCompatActivity implements View.OnClickListener{

    public Button viewHome, Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility);

        viewHome = (Button) findViewById(R.id.view_home);
        Logout = (Button) findViewById(R.id.logout_button);

        Logout.setOnClickListener(utility.this);
        viewHome.setOnClickListener(utility.this);
    }

    @Override
    public void onClick(View v) {

        if(v==viewHome){
            Intent intent = new Intent(getApplicationContext(),  class);
            startActivity(intent);
        }
        if(v == Logout){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        }
    }
}
