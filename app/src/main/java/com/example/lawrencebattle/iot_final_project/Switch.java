package com.example.lawrencebattle.iot_final_project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class Switch extends AppCompatActivity implements View.OnClickListener {

    public TextView SenseView;
    // public EditText UserNameIP, PasswordIP;
    public Button HomeReg, HomeLog, PowReg, PowLog, Utilreg, UtilLog;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declare Buttons
        HomeReg = (Button) findViewById(R.id.HomeReg);
        HomeLog = (Button) findViewById(R.id.HomeLog);
        PowReg = (Button) findViewById(R.id.PowReg);
        PowLog = (Button) findViewById(R.id.PowLog);
        Utilreg = (Button) findViewById(R.id.Utilreg);
        UtilLog = (Button) findViewById(R.id.UtilLog);

        //Action Listeners
        HomeReg.setOnClickListener(Switch.this);
        HomeLog.setOnClickListener(Switch.this);
        PowReg.setOnClickListener(Switch.this);
        PowLog.setOnClickListener(Switch.this);
        Utilreg.setOnClickListener(Switch.this);
        UtilLog.setOnClickListener(Switch.this);

    }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.HomeReg:
                    Intent intent = new Intent(Switch.this, Switch.class);
                    startActivity(intent);
                    break;

                case R.id.HomeLog:
                    Intent intent2 = new Intent(Switch.this, Switch.class);
                    startActivity(intent2);
                    break;

                case R.id.PowReg:
                    Intent intent3 = new Intent(Switch.this, Switch.class);
                    startActivity(intent3);
                    break;

                case R.id.PowLog:
                    Intent intent4 = new Intent(Switch.this, Switch.class);
                    startActivity(intent4);
                    break;

                case R.id.Utilreg:
                    Intent intent5 = new Intent(Switch.this, Switch.class);
                    startActivity(intent5);
                    break;

                case R.id.UtilLog:
                    Intent intent6 = new Intent(Switch.this, Switch.class);
                    startActivity(intent6);
                    break;




            }
        }
    }

