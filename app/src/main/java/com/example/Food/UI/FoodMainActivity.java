package com.example.Food.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tp1.R;

public class FoodMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_main);
        new Handler().postDelayed(() -> startActivity(new Intent(getApplicationContext(),FoodListActivity.class)) ,1000);
    }
}