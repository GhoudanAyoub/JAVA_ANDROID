package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class TR1 extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr1);
        textView = findViewById(R.id.editTextTextPersonName5);
        textView2 = findViewById(R.id.editTextTextPersonName6);
        textView3 = findViewById(R.id.editTextTextPersonName7);
        textView4 = findViewById(R.id.editTextTextPersonName8);
        spinner = findViewById(R.id.spinner);
        findViewById(R.id.buttonSend).setOnClickListener(view -> {
            Intent intent = new Intent(getBaseContext(), TR1_P2.class);
            intent.putExtra("DataList", (CharSequence) new StringBuilder()
                    .append(getString(R.string.FullName)+" "+textView.getText()+",")
                    .append(getString(R.string.Email)+" "+textView2.getText()+",")
                    .append(getString(R.string.Adresse)+" "+textView3.getText()+",")
                    .append(getString(R.string.Phone)+" "+textView4.getText()+",")
                    .append(getString(R.string.ville)+" "+spinner.getSelectedItem().toString()+","));
            startActivity(intent);
        });
    }
}