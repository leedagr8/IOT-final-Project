package com.example.lawrencebattle.iot_final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class power_utility extends AppCompatActivity implements View.OnClickListener {


    public Button view_generator, manage_generator, market, logout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declare Buttons
        view_generator = (Button) findViewById(R.id.view_generator);
        manage_generator = (Button) findViewById(R.id.manage_generator);
        market = (Button) findViewById(R.id.market);
        logout_button = (Button) findViewById(R.id.logout_button);

        //Action Listeners


    }

    @Override
    public void onClick(View v) {

    }
}
