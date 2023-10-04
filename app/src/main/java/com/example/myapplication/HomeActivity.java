package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private Button HomeCam, DoorLock, User;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HomeCam = findViewById(R.id.Homecambutton);
        DoorLock = (Button) findViewById(R.id.Doorlockbutton);
        User = findViewById(R.id.Userbutton);


        HomeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeActivity.this, HomeCamActivity.class);
                startActivity(intent);
            }
        });

        DoorLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeActivity.this, DoorLockActivity.class);

                startActivity(intent);

            }
        });
        User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeActivity.this, UserActivity.class);
            }


        });
    }
}
