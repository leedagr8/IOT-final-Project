package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView SenseView;
    public EditText UserNameIP, PasswordIP;
    public Button LoginButton, ResetButton, Register, LogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare TextView
        SenseView = (TextView) findViewById(R.id.SenseView);

        //Declare EditText
        UserNameIP = (EditText) findViewById(R.id.UserNameIP);
        PasswordIP = (EditText) findViewById(R.id.PasswordIP);

        //Declare Buttons
        LoginButton = (Button) findViewById(R.id.LoginButton);
        ResetButton = (Button) findViewById(R.id.ResetButton);
        Register = (Button) findViewById(R.id.Register);
        LogoutButton = (Button) findViewById(R.id.LogoutButton);

        //Action Listeners
        LoginButton.setOnClickListener(MainActivity.this);
        ResetButton.setOnClickListener(MainActivity.this);
        Register.setOnClickListener(MainActivity.this);
        LogoutButton.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.LoginButton:

                break;

            case R.id.ResetButton:

                break;


            case R.id.Register:
                Intent intent = new Intent(MainActivity.this, NewUser.class);
                startActivity(intent);
                break;

            case R.id.LogoutButton:

                break;
        }
    }
}
