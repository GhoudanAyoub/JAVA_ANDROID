package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.TP2.TP2_EX1;
import com.example.tp1.EX3;
import com.example.tp1.Ex1;
import com.example.tp1.Ex2;
import com.example.tp1.R;
import com.example.tp1.TR1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.buttonTP1EX1).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Ex1.class)));
        findViewById(R.id.buttonTP1EX2).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Ex2.class)));
        findViewById(R.id.buttonTP1EX3).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), EX3.class)));
        findViewById(R.id.buttonTP1TR1).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), TR1.class)));
        findViewById(R.id.buttonTP2EX1).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), TP2_EX1.class)));
    }
}