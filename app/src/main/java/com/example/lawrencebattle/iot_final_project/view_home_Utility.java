package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class view_home_Utility extends AppCompatActivity implements View.OnClickListener{

    public Button goBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        goBack3 = (Button) findViewById(R.id.goBack3);






    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners



            //Sends home_user user to home_user
            case R.id.goBack3:
                Intent intentgoback = new Intent(this, utility.class);
                startActivity(intentgoback);
                break;



        }

    }
}

