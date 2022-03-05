package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EX3 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
        checkBox = findViewById(R.id.E3Q1R1);
        checkBox2 = findViewById(R.id.E3Q1R2);
        checkBox3 = findViewById(R.id.E3Q1R3);
        checkBox4 = findViewById(R.id.E3Q1R4);

        radioGroup = findViewById(R.id.Rd1);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(selectedId);

        findViewById(R.id.buttonClose).setOnClickListener(view -> System.exit(0));
        findViewById(R.id.buttonNext).setOnClickListener(view ->{
            Intent intent = new Intent(getBaseContext(), EX3_P2.class);
            intent.putExtra("EX3Q1R", (CharSequence) new StringBuilder()
                    .append(checkBox.isChecked()?checkBox.getText()+",":"")
                    .append(checkBox2.isChecked()?checkBox2.getText()+",":"")
                    .append(checkBox3.isChecked()?checkBox3.getText()+",":"")
                    .append(checkBox4.isChecked()?checkBox4.getText()+",":""));
            intent.putExtra("EX3Q2R", (String) radioButton.getText());
            startActivity(intent);
        } );
    }
}