package com.example.lawrencebattle.iot_final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class utility extends AppCompatActivity implements View.OnClickListener {


    public Button view_home, manage_home, generator_view,market_buttom, logout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declare Buttons
        view_home = (Button) findViewById(R.id.view_home);
        manage_home = (Button) findViewById(R.id.manage_home);
        generator_view = (Button) findViewById(R.id.generator_view);
        market_buttom = (Button) findViewById(R.id.market_buttom);
        logout_button = (Button) findViewById(R.id.logout_button);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

            //Sends Utility user to view_home_Utility
            case R.id.view_home:
                Intent intentviewgens= new Intent(this, view_home_Utility.class);
                startActivity(intentviewgens);
                break;

            //Sends Utility user to manage_home_Utility
            case R.id.manage_home:
                Intent intentmanagegens = new Intent(this, manage_home_Utility.class);
                startActivity(intentmanagegens);
                break;

            //Sends Utility user to generator_Utility
            case R.id.generator_view:
                Intent intentgen = new Intent(this, generator_Utility.class);
                startActivity(intentgen);
                break;

            //Sends Utility user to market_Utility
            case R.id.market_buttom:
                Intent intentmarket = new Intent(this, market_Utility.class);
                startActivity(intentmarket);
                break;

            //Sends Utility user to MainActivity
            case R.id.logout_button:
                Intent intentlogout = new Intent(this, MainActivity.class);
                startActivity(intentlogout);
                break;



        }

    }
}
