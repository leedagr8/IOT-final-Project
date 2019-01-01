package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Switch extends AppCompatActivity implements View.OnClickListener {


    public Button HReg, HLog, PReg, PLog, UReg, ULog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        //Initialize buttons
        HReg = (Button) findViewById(R.id.HReg);
        HLog = (Button) findViewById(R.id.HLog);
        PReg = (Button) findViewById(R.id.PReg);
        PLog = (Button) findViewById(R.id.PLog);
        UReg = (Button) findViewById(R.id.UReg);
        ULog = (Button) findViewById(R.id.ULog);

        //Set listeners

        HReg.setOnClickListener(Switch.this);
        HLog.setOnClickListener(Switch.this);
        PReg.setOnClickListener(Switch.this);
        PLog.setOnClickListener(Switch.this);
        UReg.setOnClickListener(Switch.this);
        ULog.setOnClickListener(Switch.this);

    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.HReg:
                Intent newRegisterIntent = new Intent(getApplicationContext(),NewUser .class);
                startActivity(newRegisterIntent);
                break;

          //  case R.id.PLog:

            //    startActivity(new Intent(getApplicationContext(), powerlogin.class));
            //    break;

           // case R.id.HLog:
           //     Intent Hlog = new Intent(getApplicationContext(), HomeLogin.class);
           //     startActivity(Hlog);
           //     break;

            case R.id.PReg:
                Intent Preg = new Intent(getApplicationContext(), PowerReg.class);
                startActivity(Preg);
                break;



            case R.id.UReg:
                Intent Ureg = new Intent(getApplicationContext(), UtilReg.class);
                startActivity(Ureg);
                break;

            case R.id.ULog:
                Intent Ulog = new Intent(getApplicationContext(), utillogin.class);
                startActivity(Ulog);
                break;
        }
        if(v == PLog){
               startActivity(new Intent(getApplicationContext(), powerlogin.class));
        }
        if(v == HLog){
            Intent Hlog = new Intent(getApplicationContext(), HomeLogin.class);
                 startActivity(Hlog);
        }
    }
}
