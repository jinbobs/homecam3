package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeCamActivity extends AppCompatActivity {
    private Button Move, Ctv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Move = findViewById(R.id.move_btn);
        Ctv = findViewById(R.id.cctv_btn);


        Move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeCamActivity.this, MoveActivity.class);
                startActivity(intent);
            }
        });

        Ctv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        HomeCamActivity.this, StreamingActivity.class);

                startActivity(intent);

            }
        });
    }
}
