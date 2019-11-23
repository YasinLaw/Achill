package com.example.achill.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.achill.R;
import com.example.achill.ui.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText login_username;
    private EditText login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_username = findViewById(R.id.login_username);
        login_password = findViewById(R.id.login_password);
    }

    public void registerOnClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        if (login_username.getText() != null) {
            intent.putExtra("username", login_username.getText().toString());
        }
        if (login_password.getText() != null) {
            intent.putExtra("password", login_password.getText().toString());
        }
        startActivity(intent);
    }

    public void loginOnClick(View view) {
    }
}
