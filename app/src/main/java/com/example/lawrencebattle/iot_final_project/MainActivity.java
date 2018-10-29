package com.example.lawrencebattle.iot_final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView SenseView;
    public EditText UserNameIP,PasswordIP;
    public Button LoginButton,ResetButton,Register,LogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declare Buttons
        LoginButton=(Button) findViewById(R.id.LoginButton);
        ResetButton=(Button) findViewById(R.id.ResetButton);
        Register= (Button) findViewById(R.id.Register);
        LogoutButton=(Button) findViewById(R.id.LogoutButton);

        //Declare EditText
        UserNameIP = (EditText) findViewById(R.id.UserNameIP);
        PasswordIP = (EditText) findViewById(R.id.PasswordIP);


    }
}
