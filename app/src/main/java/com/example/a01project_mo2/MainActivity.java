package com.example.a01project_mo2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        btnWelcome = findViewById(R.id.btnWelcome);

        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(
                            MainActivity.this,
                            "لطفاً نام خود را وارد کنید",
                            Toast.LENGTH_SHORT
                    ).show();
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            name + " خوش اومدی به این برنامه",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}