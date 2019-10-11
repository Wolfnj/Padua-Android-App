package com.example.padua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void registerADevice(View view){

        Intent startRegisterDeviceActivity = new Intent(LoginActivity.this, RegisterDeviceActivity.class);

        startActivity(startRegisterDeviceActivity);

    }



    public void myDevices(View view){

        Intent startMyDevicesActivity = new Intent(LoginActivity.this, DevicesActivity.class);

        startActivity(startMyDevicesActivity);

    }


}
