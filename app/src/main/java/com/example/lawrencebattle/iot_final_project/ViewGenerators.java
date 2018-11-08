package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ViewGenerators extends AppCompatActivity implements View.OnClickListener {

    public Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        BackButton = (Button) findViewById(R.id.BackButton);


        //Sends User to a specific website
        setContentView(R.layout.activity_view__generators);

        String url = "https://services.swpc.noaa.gov/images/geospace-1-day.png";

         WebView gens=(WebView) findViewById(R.id.generator_site);

         gens.loadUrl(url);


    }

  //Not sure if there should be an @Override here
   @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

            //Sends PowerUtility user to MainActivity
            case R.id.BackButton:
                Intent intentback = new Intent(this, power_utility.class);
                startActivity(intentback);
                break;



        }

    }
}
