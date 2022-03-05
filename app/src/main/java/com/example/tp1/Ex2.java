package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Ex2 extends AppCompatActivity {
    private CheckBox checkBox;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private EditText editText3;
    private EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
        checkBox = findViewById(R.id.checkBox);
        textView = findViewById(R.id.textView7);
        textView2 = findViewById(R.id.textView8);
        textView3 = findViewById(R.id.textView9);
        editText3 = findViewById(R.id.editTextTextPersonName3);
        editText4 = findViewById(R.id.editTextTextPersonName4);
        findViewById(R.id.calcul).setOnClickListener(view -> {
            Double Ib=Double.parseDouble(String.valueOf(editText3.getText()))*2;
            Double Is=checkBox.isChecked()?((Double.parseDouble(String.valueOf(editText4.getText()))*50)/100):(Double.parseDouble(String.valueOf(editText4.getText()))*50);

            textView.setText(new StringBuilder().append(getString(R.string.IBase)).append(Ib.toString()).toString());
            textView2.setText(new StringBuilder().append(getString(R.string.ISup)).append(Is).toString());
            textView3.setText(new StringBuilder().append(getString(R.string.Itotal)).append((Ib + Is)).toString());
        });
    }
}