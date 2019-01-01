package com.example.lawrencebattle.iot_final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
import org.w3c.dom.Text;

import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.Map;


public class HomeLogin extends AppCompatActivity implements View.OnClickListener {
<<<<<<< HEAD

public EditText UserName, Password;
=======
public TextView SenseView;
public EditText Password, Username;
>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32
public Button Login;
private ProgressDialog progressDialog;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_login);

<<<<<<< HEAD
        // EditText
         UserName = (EditText) findViewById(R.id.Username);
         Password = (EditText) findViewById(R.id.Password);
=======
        //Declare TextView
        SenseView = (TextView) findViewById(R.id.SenseView);

        //Declare EditText
        //removed this from homep page
        // UserNameIP = (EditText) findViewById(R.id.UserNameIP);
        //PasswordIP = (EditText) findViewById(R.id.PasswordIP);

        //Declare Buttons
        Login = (Button) findViewById(R.id.Login);


        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);

>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32

        //Login Button
        Login= (Button) findViewById(R.id.Login);

<<<<<<< HEAD
        //Action Listener
        Login.setOnClickListener(HomeLogin.this);
=======
        //Action Listeners
        Login.setOnClickListener(HomeLogin.this);

>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32

        //progress dialog
        progressDialog = new ProgressDialog(this);



        }


private void userLogin(){
        final String username = UserName.getText().toString().trim();
         final String password = Password.getText().toString().trim();

        progressDialog.setMessage("Please wait...");

        progressDialog.show();


        RequestQueue requestQueue = Volley.newRequestQueue(HomeLogin.this);


        StringRequest stringRequest = new StringRequest( //used to send post method
        Request.Method.POST,
        Constants.URL_LOGIN,
        new Response.Listener<String>() {
@Override
public void onResponse(String response) {
        progressDialog.dismiss();
        try {
        JSONObject obj = new JSONObject(response);
        if (!obj.getBoolean("error")) {
        SharedPrefManager.getInstance(getApplicationContext())
        .userLogin(
        //     obj.getInt("id"),
        obj.getString("username"),
        obj.getString("email")
        );
        Toast.makeText(
        getApplicationContext(),
        obj.getString("User login successful"),
        Toast.LENGTH_LONG
        ).show();
        } else {
        Toast.makeText(
        getApplicationContext(),
        obj.getString("message"),
        Toast.LENGTH_LONG
        ).show();
        }
        }catch (JSONException e){
        e.printStackTrace();
        }
        }
        },
        new Response.ErrorListener() {
@Override
public void onErrorResponse(VolleyError error) {
        progressDialog.dismiss();

        Toast.makeText(
        getApplicationContext(),
        error.getMessage(),
        Toast.LENGTH_LONG
        ).show();
        }
        }

        ){
@Override
protected Map<String, String> getParams() throws AuthFailureError {
        Map<String,String> params = new HashMap<>();
        params.put("username", Username.getText().toString());
        params.put("password", Password.getText().toString());
        return params;
        }
        };

        requestQueue.add(stringRequest);

        }

@Override
public void onClick(View v) {
        switch (v.getId()) {

        case R.id.Login:
<<<<<<< HEAD
        userLogin();

        Intent intent = new Intent(getApplicationContext(), home_main.class);
=======


        Intent intent = new Intent(getApplicationContext(), home_user.class);
>>>>>>> 6902bbabe9fe9d620c41de9fe960be55863e5f32
        startActivity(intent);
        break;




        }
        }
}
