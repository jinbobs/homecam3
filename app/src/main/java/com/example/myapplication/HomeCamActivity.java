package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeCamActivity extends Activity {

    private Button btnmotion,btnlivecam ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homecam);
        btnmotion = (Button) findViewById(R.id.message_btn);
        btnlivecam=  (Button) findViewById(R.id.movement_btn2);

        btnmotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent(
                        HomeCamActivity.this, homecamimageActivity.class);
                startActivity(intent);
            }
        });

        btnlivecam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent intent = new Intent(
                        HomeCamActivity.this,homecameracctvActivity.class);
                startActivity(intent);

            }
        });
    };
}
