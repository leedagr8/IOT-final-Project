package com.example.lawrencebattle.iot_final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



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




    }

   @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

            //Sends PowerUtility user to View_Generators
            case R.id.view_generator:
                Intent intentviewgens= new Intent(this, ViewGenerators_Power_Utility.class);
                startActivity(intentviewgens);
                break;

            //Sends PowerUtility user to Manage_Generators
            case R.id.manage_generator:
            Intent intentmanagegens = new Intent(this, ManageGenerators_Power_Utility.class);
            startActivity(intentmanagegens);
            break;

            //Sends PowerUtility user to Market
            case R.id.market:
                Intent intentmarket = new Intent(this, Market_Power_Utility.class);
                startActivity(intentmarket);
                break;

            //Sends PowerUtility user to MainActivity
            case R.id.logout_button:
                Intent intentlogout = new Intent(this, MainActivity.class);
                startActivity(intentlogout);
                break;



        }

    }
}
