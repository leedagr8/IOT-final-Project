package com.example.lawrencebattle.iot_final_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PowerUtility extends Activity{

    private Bundle bundle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.user_home);

        final Button ApplianceButton = (Button) findViewById(R.id.ApplianceButton);
        final Button ManageAcctButton = (Button) findViewById(R.id.ManageAcctButton);
        final Button LogoutButton = (Button) findViewById(R.id.LogoutButton);

        ApplianceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                bundle = getIntent().getExtras();
                Intent communityActivity = new Intent(getBaseContext(),CommunityHomeActivity.class);
                communityActivity.putExtras(bundle);
                startActivity(communityActivity);
            }
        });


        LogoutButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        ManageAcctButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                bundle = getIntent().getExtras();
                Intent accountActivity = new Intent(getBaseContext(),ManageAccountActivity.class);
                accountActivity.putExtras(bundle);
                startActivity(accountActivity);
            }
        });

    }
}
