package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class ManageGenerators_Power_Utility extends AppCompatActivity implements View.OnClickListener{

    public Button GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        GoBack = (Button) findViewById(R.id.BackButton);





    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

            //Sends PowerUtility user to power_utility
            case R.id.GoBack:
                Intent intentback = new Intent(this, power_utility.class);
                startActivity(intentback);
                break;



        }

    }
}
