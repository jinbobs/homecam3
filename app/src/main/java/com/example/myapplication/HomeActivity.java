package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {
    private Button HomeCam, DoorLock, User;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeCam = findViewById(R.id.Homecambutton);
        DoorLock = (Button) findViewById(R.id.Doorlockbutton);


        HomeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, HomeCamActivity.class);
                startActivity(intent);
            }
        });

        DoorLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, DoorLockActivity.class);

                startActivity(intent);

            }
        });
    }
}
        /*User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this,UserActivity.class);

                startActivity(intent);

            }
        });
    }
}*/
