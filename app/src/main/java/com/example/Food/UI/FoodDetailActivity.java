package com.example.Food.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.Food.beans.Food;
import com.example.Food.service.FoodService;
import com.example.tp1.R;

public class FoodDetailActivity extends AppCompatActivity {

    private FoodService fs;
    private ImageView image;
    private TextView desc;
    private TextView nom;
    private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        Food f = getIntent().getParcelableExtra("id");
        fs = FoodService.getInstance();
        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);
        button = findViewById(R.id.buttonDelete);

       if(f!=null){ Glide.with(getApplicationContext())
                .load(f.getPhoto())
                .centerCrop()
                .into(image);
        desc = findViewById(R.id.desc);
        desc.setText(f.getDesc());
        nom.setText(f.getNom());
        button.setOnClickListener(view -> {fs.delete(f);super.onBackPressed();});
       }
    }
}