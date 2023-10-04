package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoorLockActivity extends Activity {

    private Button Alerte, Success;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doorlock);

        Alerte= findViewById(R.id.message_btn);
        Success= findViewById(R.id.success);


        Alerte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        DoorLockActivity.this, Doorlockfail.class);
                startActivity(intent);
            }
        });

        Success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        DoorLockActivity.this, DoorlockSuccess.class);

                startActivity(intent);

            }
        });
    }
}
