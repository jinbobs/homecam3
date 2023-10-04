package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends Activity {

    private EditText etId, etPass, etPassCk, etName,etPhone;
    private Button btnRegister, validateButton, faceButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); // XML 레이아웃 파일을 activity_register.xml로 변경

        etId = (EditText) findViewById(R.id.et_id);
        etPass = (EditText) findViewById(R.id.et_pass);
        etPassCk = (EditText) findViewById(R.id.et_passck);
        etName = (EditText) findViewById(R.id.et_name);
        etPhone = (EditText) findViewById(R.id.et_phone);
        btnRegister = (Button) findViewById(R.id.btn_register);
        validateButton = (Button) findViewById(R.id.validateButton);
        faceButton = (Button) findViewById(R.id.FaceButton);
        faceButton = (Button) findViewById(R.id.FaceButton);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                // 여기에 회원가입 버튼을 눌렀을 때 수행할 작업을 추가하세요.
                // 예를 들어, 사용자가 입력한 정보를 가져와서 회원가입 절차를 수행하거나, 회원가입 화면을 닫을 수 있습니다.
                Toast.makeText(RegisterActivity.this, "회원가입 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}