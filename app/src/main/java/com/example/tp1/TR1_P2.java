package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.StringTokenizer;

public class TR1_P2 extends AppCompatActivity {

    private TextView textView;
    private String val="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr1_p2);
        textView = findViewById(R.id.textView18);
        String DataList = getIntent().getStringExtra("DataList");
        StringTokenizer st = new StringTokenizer(DataList,",");
        while (st.hasMoreTokens())
            val+=st.nextToken()+"\n";
        textView.setText(val);
    }
}