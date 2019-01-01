package com.example.lawrencebattle.iot_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.PrintWriter;
import java.net.Socket;

public class alarmSystem extends AppCompatActivity implements View.OnClickListener{

    public Button On1,On2, Off1, Off2, Back;
    String ipAddress = "192.168.1.57";
    String port = "5560";
    private Socket client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_system);

        // button
        On1 = (Button) findViewById(R.id.On1);
        On2 = (Button) findViewById(R.id.On2);
        Off1 = (Button) findViewById(R.id.Off1);
        Off2 = (Button) findViewById(R.id.Off2);
        Back = (Button) findViewById(R.id.Back);

        //listeners
        On1.setOnClickListener(alarmSystem.this);
        On2.setOnClickListener(alarmSystem.this);
        Off1.setOnClickListener(alarmSystem.this);
        Off2.setOnClickListener(alarmSystem.this);
        Back.setOnClickListener(alarmSystem.this);


    }

    @Override
    public void onClick(View v) {


        if(v == On1){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        client = new Socket(ipAddress, Integer.parseInt(port));
                        //Send message to server
                        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
                        printWriter.write("on"); // send the message to raspberry pi
                        printWriter.flush();
                        printWriter.close();
                        client.close();
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            }).start();

            Toast.makeText(alarmSystem.this,"Alarmup is on", Toast.LENGTH_SHORT).show();
        }
        if(v == On2){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        client = new Socket(ipAddress, Integer.parseInt(port));
                        //Send message to server
                        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
                        printWriter.write("oN"); // send the message to raspberry pi
                        printWriter.flush();
                        printWriter.close();
                        client.close();
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            }).start();


            Toast.makeText(getApplicationContext(),"Alarmdown is on", Toast.LENGTH_LONG).show();
        }
        if(v == Off1){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        client = new Socket(ipAddress, Integer.parseInt(port));
                        //Send message to server
                        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
                        printWriter.write("off"); // send the message to raspberry pi
                        printWriter.flush();
                        printWriter.close();
                        client.close(); //close my client
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            Toast.makeText(getApplicationContext(),"Alarm up is off", Toast.LENGTH_LONG).show();
        }
        if(v == Off2){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        client = new Socket(ipAddress, Integer.parseInt(port));
                        //Send message to server
                        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
                        printWriter.write("Off"); // send the message to raspberry pi
                        printWriter.flush();
                        printWriter.close();
                        client.close(); //close my client
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            Toast.makeText(getApplicationContext(),"Alarmdown is off", Toast.LENGTH_LONG).show();
        }
        if(v == Back){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        client = new Socket(ipAddress, Integer.parseInt(port));
                        //Send message to server
                        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
                        printWriter.write("stop"); // send the message to raspberry pi
                        printWriter.flush();
                        printWriter.close();
                        client.close(); //close my client
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            Intent intent = new Intent(getApplicationContext(), home_main.class);
            startActivity(intent);

        }
    }
}
