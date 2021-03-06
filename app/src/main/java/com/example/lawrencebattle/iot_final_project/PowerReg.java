package com.example.lawrencebattle.iot_final_project;

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

import java.util.HashMap;
import java.util.Map;

import static com.example.lawrencebattle.iot_final_project.Constants.*;

public class PowerReg extends AppCompatActivity implements View.OnClickListener {

    public TextView RegisterPage;
    public EditText FullName, NewUser,NewPassword,Email,PhoneNumber;
    public Button NewRegister, Back;
    public ProgressDialog dialog; // Used for my dialog to user on registration

    String Url ="http://10.220.1.111/registerUser_Pow.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_reg);
        dialog = new ProgressDialog(this);

        RegisterPage = (TextView) findViewById(R.id.NewRegister);

        //Declare EditText
        FullName = (EditText) findViewById(R.id.FullName);
        NewUser = (EditText) findViewById(R.id.NewUser);
        NewPassword = (EditText) findViewById(R.id.NewPassword);
        Email = (EditText) findViewById(R.id.Email);
        PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);

        //Declare Buttons
        NewRegister = (Button) findViewById(R.id.NewRegister);
        Back = (Button) findViewById(R.id.Back);



        //Action Listeners
        NewRegister.setOnClickListener((View.OnClickListener) PowerReg.this);
        Back.setOnClickListener((View.OnClickListener) PowerReg.this);



    }

    //Function to Register User into Database
    private void registerUser(){



        //Used trim to remove any whitespace.
        final String email = Email.getText().toString().trim();
        final String password = NewPassword.getText().toString().trim();
        final String name = FullName.getText().toString().trim();
        final String username = NewUser.getText().toString().trim();
        final String phone = PhoneNumber.getText().toString().trim();
        //  String confirmation = ConfirmPassword.getText().toString().trim();
        //boolean confirmed = false; // make sure the passwords match


        // while(!confirmation.equals(password)){
        //  Toast.makeText(getApplicationContext(), "Password does not match.", Toast.LENGTH_SHORT).show();

        //}


        //Since this is a network request and will take time to register. I will display a Progess message to user.

       dialog.setMessage("Registering user....");
        dialog.show();

        RequestQueue requestQueue = Volley.newRequestQueue(PowerReg.this);



        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                Url,
                new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {
                        //Will hide progress message if successful
                        dialog.dismiss();

                        Toast.makeText(getApplicationContext(),"in here func",Toast.LENGTH_LONG).show();

                        //Pass JSON inside this method on response

                        try {
                            JSONObject jsonObject = new JSONObject(response); // passing in JSON Object

                            Toast.makeText(getApplicationContext(),jsonObject.getString("message"),Toast.LENGTH_LONG).show();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //Will hide Progress message if error is found
                        dialog.hide();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }){

            //Put all parameters that need to be sent in a hashmap
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params= new HashMap<>();
                params.put("username", username);
                params.put("password", password);
                params.put("name", name);
                params.put("email", email);
                params.put("phone", phone);
                return params;
            }
        };

        requestQueue.add(stringRequest);
        //   RequestHandler.getInstance(this).addToRequestQueue(stringRequest);
    }


    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.NewRegister:
                registerUser();
                Intent newRegisterIntent = new Intent(PowerReg.this, MainActivity.class);
                startActivity(newRegisterIntent);
                break;


            case R.id.Back:
                Intent intent = new Intent(PowerReg.this, Switch.class);
                startActivity(intent);
                break;
        }
    }
}
