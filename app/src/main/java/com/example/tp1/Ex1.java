package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Ex1 extends AppCompatActivity {

    private static int comp = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText(""+comp);
        findViewById(R.id.showT).setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Hello Toast! "+comp, Toast.LENGTH_SHORT).show());
        findViewById(R.id.countT).setOnClickListener(view -> textView.setText(String.valueOf(++comp)));

    }
}