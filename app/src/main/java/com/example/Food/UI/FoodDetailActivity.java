package com.example.Food.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private TextView ing;
    private TextView nom;
    private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        int id = Integer.parseInt(getIntent().getStringExtra("id"));
        fs = FoodService.getInstance();
        image = findViewById(R.id.photo);
        ing = findViewById(R.id.ing);
        nom = findViewById(R.id.nom);
        button = findViewById(R.id.buttonDelete);

        Food f = fs.findById(id);
       if(f!=null){ Glide.with(getApplicationContext())
                .load(f.getPhoto())
                .centerCrop()
                .into(image);
        desc = findViewById(R.id.desc);
        desc.setText(f.getDesc());
        nom.setText(f.getNom());
           ing.setText(f.getIng());
        button.setOnClickListener(view -> {fs.delete(f);
            startActivity(
                    new Intent(getApplicationContext(),FoodListActivity.class));});
       }
    }

    @Override
    public void onBackPressed() {
        startActivity(
                new Intent(getApplicationContext(),FoodListActivity.class));
    }
}