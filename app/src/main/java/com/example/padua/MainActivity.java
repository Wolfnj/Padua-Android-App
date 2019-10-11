package com.example.padua;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /***
     * This method is activated when the user clicks on the Register button
     * @param view
     */
    public void register(View view){

        Intent startRegisterActivity = new Intent(MainActivity.this, RegisterActivity.class);

        startActivity(startRegisterActivity);

    }

    /**
     * This method is activated when the user clicks on the LogIn button
     * @param view
     */
    public void logIn(View view){

        Intent startLogInActivity = new Intent(MainActivity.this, LoginActivity.class);

        startActivity(startLogInActivity);


    }
}
