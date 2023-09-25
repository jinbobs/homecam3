package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity {


    private EditText etId, etPass;
    private Button btnLogin, btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = (EditText) findViewById(R.id.et_id);
        etPass =  (EditText) findViewById(R.id.et_pass);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);


        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent(
                        MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent intent = new Intent(
                        MainActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });
    }
}