package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class Appliance_List_User extends AppCompatActivity implements View.OnClickListener{

    public Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        back = (Button) findViewById(R.id.back);






    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners



            //Sends home_user user to home_user
            case R.id.back:
                Intent intentgoback = new Intent(this, home_user.class);
                startActivity(intentgoback);
                break;



        }

    }
}
