package com.example.lawrencebattle.iot_final_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_user extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.home_user);

        final Button ApplianceButton = (Button) findViewById(R.id.ApplianceButton);
        final Button ManageAcctButton = (Button) findViewById(R.id.ManageAcctButton);
        final Button LogoutButton = (Button) findViewById(R.id.LogoutButton);
    }
}
