package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Market extends AppCompatActivity implements View.OnClickListener{

    public Button GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        GoBack = (Button) findViewById(R.id.BackButton);


        //Sends User to a specific website
        setContentView(R.layout.activity_market);

        String url = "https://www.seia.org/solar-industry-research-data";

        WebView gens=(WebView) findViewById(R.id.market_site);

        gens.loadUrl(url);


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
