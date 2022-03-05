package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;
import java.util.StringTokenizer;

public class EX3_P2 extends AppCompatActivity {

    private TextView textView;
    private String val="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_p2);
        textView = findViewById(R.id.textView15);
        String EX3Q1R = getIntent().getStringExtra("EX3Q1R");
        String EX3Q2R = getIntent().getStringExtra("EX3Q2R");
        StringTokenizer st = new StringTokenizer(EX3Q1R,",");
        while (st.hasMoreTokens())
            val+=st.nextToken()+"\n";
        textView.setText(val+"\n"+EX3Q2R);
    }
}