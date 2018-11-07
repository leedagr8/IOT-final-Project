package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;




public class NewUser extends AppCompatActivity implements View.OnClickListener {

    public TextView RegisterPage;
    public EditText FullName, NewUser, NewPassword, ConfirmPassword, Email, PhoneNumber;
    public Button NewRegister, Back, Register;
    public CheckBox Consumer, PowerUtility, UtilityCompany;

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

        //check box
        Consumer = (CheckBox) findViewById(R.id.Consumer);
        PowerUtility = (CheckBox) findViewById(R.id.PowerUtility);
        UtilityCompany = (CheckBox) findViewById(R.id.UtilityCompany);


        //Action Listeners
        NewRegister.setOnClickListener((View.OnClickListener) NewUser.this);
        Back.setOnClickListener((View.OnClickListener) NewUser.this);
        Consumer.setOnClickListener((View.OnClickListener) NewUser.this);
        PowerUtility.setOnClickListener((View.OnClickListener) NewUser.this);
        UtilityCompany.setOnClickListener((View.OnClickListener) NewUser.this);


    }


    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.NewRegister:
                Intent newRegisterIntent = new Intent(NewUser.this, NewUser.class);
                startActivity(newRegisterIntent);
                break;


            case R.id.Back:
                Intent intent = new Intent(NewUser.this, MainActivity.class);
                startActivity(intent);
                break;

            Consumer.performClick();
            if (Consumer.isChecked()) {

            } else if (PowerUtility.isChecked()) {

            } else if (UtilityCompany.isChecked())


                ;


        }
    }
}