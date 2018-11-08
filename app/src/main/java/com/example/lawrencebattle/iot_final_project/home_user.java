package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class home_user extends AppCompatActivity implements View.OnClickListener{

    public Button LogoutButton,ManageAcctButton,ApplianceButton,HomeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        LogoutButton = (Button) findViewById(R.id.LogoutButton);
        ManageAcctButton = (Button) findViewById(R.id.ManageAcctButton);
        ApplianceButton = (Button) findViewById(R.id.ApplianceButton);
        HomeActivity = (Button) findViewById(R.id.HomeActivity);





    }

    //Not sure if there should be an @Override here
    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

/*            //Sends home_user user to ViewHomeActivity
            case R.id.HomeActivity:
                Intent intenthomeact = new Intent(this, HomeActivityClass.class);
                startActivity(intenthomeact;
                break;*/

            //Sends home_user user to ViewAppliances
            case R.id.ApplianceButton:
                Intent intentappliance = new Intent(this, ApplianceList.class);
                startActivity(intentappliance);
                break;

            //Sends home_user user to ManageAccount
            case R.id.ManageAcctButton:
                Intent intentmanage = new Intent(this, ManageAccount.class);
                startActivity(intentmanage);
                break;


            //Sends home_user user to MainActivity
            case R.id.LogoutButton:
                Intent intentlogout = new Intent(this, MainActivity.class);
                startActivity(intentlogout);
                break;



        }

    }
}
