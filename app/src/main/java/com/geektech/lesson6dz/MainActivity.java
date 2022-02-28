package com.geektech.lesson6dz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text2;
    private EditText login;
    private EditText password;
    private Button btn;
    private LinearLayout viewContainer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        password = findViewById(R.id.pass);
        btn = findViewById(R.id.btn);
        viewContainer = findViewById(R.id.view_container);
        text2 = findViewById(R.id.text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login.getText().toString().equals("admin")&&
                        password.getText().toString().equals("admin")) {
                    text2.setVisibility(View.GONE);
                    login.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    btn.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}