package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class manage_home_Utility extends AppCompatActivity implements View.OnClickListener{

    public Button back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        back2 = (Button) findViewById(R.id.back2);






    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners



            //Sends utility user to utility
            case R.id.back2:
                Intent intentgoback = new Intent(this, utility.class);
                startActivity(intentgoback);
                break;



        }

    }
}
