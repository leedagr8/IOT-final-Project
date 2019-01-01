package com.example.lawrencebattle.iot_final_project;

<<<<<<< HEAD
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Switch extends AppCompatActivity implements View.OnClickListener {
=======
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
>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32


    public Button HReg, HLog, PReg, PLog, UReg, ULog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
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
=======
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

>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32
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

