package com.example.lawrencebattle.iot_final_project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

<<<<<<< HEAD
    public Button ContinueButton;

=======
    public TextView SenseView;
   // public EditText UserNameIP, PasswordIP;
    public Button Continue;
    private ProgressDialog progressDialog;
>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        //Declare Button
        ContinueButton = (Button) findViewById(R.id.Continue);
=======
        //Declare TextView
        SenseView = (TextView) findViewById(R.id.SenseView);

        //Declare EditText
        //removed this from homep page
       // UserNameIP = (EditText) findViewById(R.id.UserNameIP);
        //PasswordIP = (EditText) findViewById(R.id.PasswordIP);

        //Declare Buttons
        Continue = (Button) findViewById(R.id.Continue);



        //Action Listeners
        Continue.setOnClickListener(MainActivity.this);


        //progress dialog
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");
>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32

        //Action Listener
        ContinueButton.setOnClickListener(MainActivity.this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.Continue:

               Intent intent = new Intent(MainActivity.this, Switch.class);
                startActivity(intent);
               break;

        }
    }
}
