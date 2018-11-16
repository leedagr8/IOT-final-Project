package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Switch;


public class appliance_List_User extends AppCompatActivity implements View.OnClickListener{

    public Button back;
    public Switch washerswitch, dryerswitch,fridgeswitch,livinglights,livinglights4,officelight,masterlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button
        back = (Button) findViewById(R.id.back);

        //Switches

        washerswitch = (Switch) findViewById(R.id.washerswitch);
        dryerswitch = (Switch) findViewById(R.id.dryerswitch);
        fridgeswitch = (Switch) findViewById(R.id.fridgeswitch);
        livinglights = (Switch) findViewById(R.id.livinglights);
        livinglights4 = (Switch) findViewById(R.id.livinglights4);//Spare Bedroom
        officelight = (Switch) findViewById(R.id.officelight);
        masterlight = (Switch) findViewById(R.id.masterlight);




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

            case R.id.washerswitch:
                Boolean switchState = washerswitch.isChecked();
                break;

            case R.id.dryerswitch:
                Boolean switchState1 = dryerswitch.isChecked();
                break;

                case R.id.fridgeswitch:
                Boolean switchState2 = fridgeswitch.isChecked();
                break;

                case R.id.livinglights:
                Boolean switchState3 = livinglights.isChecked();
                break;

                case R.id.livinglights4:
                Boolean switchState4 = livinglights4.isChecked();
                break;

                case R.id.officelight:
                Boolean switchState5 = officelight.isChecked();
                break;

                case R.id.masterlight:
                Boolean switchState6 = masterlight.isChecked();
                break;


        }

    }
}
