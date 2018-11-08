package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ManageAccount extends AppCompatActivity implements View.OnClickListener{

    public Button GoBack;
    public EditText UpdatePassword,updatePasswordConfirm,PhoneNumber,UpdateEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        GoBack = (Button) findViewById(R.id.BackButton);

        //Edit Texts
        UpdatePassword = (EditText) findViewById(R.id.UpdatePassword);
        updatePasswordConfirm = (EditText) findViewById(R.id.updatePasswordConfirm);
        PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
        UpdateEmail = (EditText) findViewById(R.id.UpdateEmail);




    }

    //Not sure if there should be an @Override here
    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            //Action Listeners

            //Sends Homeuser user to home_user
            case R.id.GoBack:
                Intent intentback = new Intent(this, home_user.class);
                startActivity(intentback);
                break;




        }

    }
}
