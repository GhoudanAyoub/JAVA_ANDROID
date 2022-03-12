package com.example.Food.UI;

import static com.example.Food.data.FoodData.foodList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.Food.adapter.FoodAdapter;
import com.example.Food.beans.Food;
import com.example.Food.service.FoodService;
import com.example.tp1.R;

public class FoodListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView liste;
    private FoodAdapter foodAdapter;
    private FoodService fs = FoodService.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        liste  =  findViewById(R.id.liste);
        foodAdapter = new FoodAdapter(this);
        InitList();

    }
    public void InitList(){
        foodAdapter.setFoodList(foodList);
        fs.create(foodList);
        liste.setAdapter(foodAdapter);
        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        final TextView id = view.findViewById(R.id.idf);
        startActivity(
                new Intent(getApplicationContext(),FoodDetailActivity.class)
                        .putExtra("id", id.getText().toString()));
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();

        foodAdapter.setFoodList(null);
        foodAdapter.setFoodList(foodList);
    }
}