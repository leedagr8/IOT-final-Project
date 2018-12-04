package com.example.lawrencebattle.iot_final_project;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;




public class util_login extends AppCompatActivity implements View.OnClickListener {
    public TextView SenseView;
    public Text password2, username2;
    public Button login2;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_util_login);

        //Declare TextView
        SenseView = (TextView) findViewById(R.id.SenseView);

        //Declare EditText
        //removed this from homep page
        // UserNameIP = (EditText) findViewById(R.id.UserNameIP);
        //PasswordIP = (EditText) findViewById(R.id.PasswordIP);

        //Declare Buttons
        login2 = (Button) findViewById(R.id.login2);



        //Action Listeners
        login2.setOnClickListener(util_login.this);


        //progress dialog
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");


    }


    private void userLogin(){
        //final String username = UserNameIP.getText().toString().trim();
        // final String password = PasswordIP.getText().toString().trim();

        progressDialog.show();

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
                params.put("username", Username);
                params.put("password", Password);
                return params;
            }
        };

        //  RequestHandler.getInstance(this).addToRequestQueue(stringRequest);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.login2:


                Intent intent8 = new Intent(getApplicationContext(), power_utility.class);
                startActivity(intent8);
                break;




        }
    }
}
