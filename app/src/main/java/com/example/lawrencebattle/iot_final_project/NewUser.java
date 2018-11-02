package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;



public class NewUser extends AppCompatActivity {

    public TextView RegisterPage;
    public EditText FullName, NewUser,NewPassword,ConfirmPassword,Email,PhoneNumber;
    public Button NewRegister, Back, Register;
    public CheckBox Consumer,PowerUtility,UtilityCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);

        RegisterPage = (TextView) findViewById(R.id.RegisterPage);

        //Declare EditText
        FullName = (EditText) findViewById(R.id.FullName);
        NewUser = (EditText) findViewById(R.id.NewUser);
        NewPassword = (EditText) findViewById(R.id.NewPassword);
        ConfirmPassword = (EditText) findViewById(R.id.ConfirmPassword);
        Email = (EditText) findViewById(R.id.Email);
        PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);

        //Declare Buttons
        NewRegister = (Button) findViewById(R.id.NewRegister);
        Register = (Button) findViewById(R.id.Register);
        Back = (Button) findViewById(R.id.Back);


        //Action Listeners
        NewRegister.setOnClickListener((View.OnClickListener) NewUser.this);
        Register.setOnClickListener((View.OnClickListener) NewUser.this);
        Back.setOnClickListener((View.OnClickListener) NewUser.this);
        Consumer.setOnClickListener((View.OnClickListener) NewUser.this);
        PowerUtility.setOnClickListener((View.OnClickListener) NewUser.this);
        UtilityCompany.setOnClickListener((View.OnClickListener) NewUser.this);


    }


    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.NewRegister:
                //  Intent intent = new Intent(MainActivity.this, NewUser.class);
                // startActivity(intent);
                // break;


          /*  case R.id.Register:

            {

            }
            break;


           case R.id.Consumer:
                Intent intent = new Intent(NewUser.this, NewUser.class);
                startActivity(intent);
                break;

            case R.id.PowerUtility:
                Intent intent = new Intent(NewUser.this, NewUser.class);
                startActivity(intent);
                break;

            case R.id.UtilityCompany:
                Intent intent = new Intent(NewUser.this, NewUser.class);
                startActivity(intent);
                break;*/

            case R.id.Back:
                Intent intent = new Intent(NewUser.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
