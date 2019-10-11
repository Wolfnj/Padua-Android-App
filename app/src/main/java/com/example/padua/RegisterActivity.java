package com.example.padua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.padua.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


    /***
     * This method is activated when the user presses the "REGISTER ACCOUNT" button
     * @param view
     */
    public void registerAccount(View view){
        Intent goBackToMain = new Intent(RegisterActivity.this, MainActivity.class);

        startActivity(goBackToMain);
    }

}
