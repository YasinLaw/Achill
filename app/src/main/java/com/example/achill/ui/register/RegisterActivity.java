package com.example.achill.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.achill.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText register_username;
    private EditText register_password;
    private EditText register_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent intent = getIntent();
        register_username = findViewById(R.id.register_username);
        register_password = findViewById(R.id.register_password);
        register_mail = findViewById(R.id.register_mail);
        if (intent != null) {
            register_username.setText(intent.getStringExtra("username"));
            register_password.setText(intent.getStringExtra("password"));
        }
    }

    public void registerOnClick(View view) {

    }
}
