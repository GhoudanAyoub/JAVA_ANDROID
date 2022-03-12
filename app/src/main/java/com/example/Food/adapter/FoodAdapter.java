package com.example.Food.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.Food.beans.Food;
import com.example.Food.service.FoodService;
import com.example.tp1.R;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private List<Food> Foods;
    private LayoutInflater inflater;
    private Activity context;

    public FoodAdapter(Activity activity) {
        context = activity;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setFoodList(List<Food> Foods){
        this.Foods =Foods;
    }

    @Override
    public int getCount() {
        return Foods.size();
    }

    @Override
    public Object getItem(int position) {
        return Foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.food_item, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView quantite = convertView.findViewById(R.id.quantite);
        ImageView photo = convertView.findViewById(R.id.photo);

        idf.setText(Foods.get(position).getId()+"");
        nom.setText(Foods.get(position).getNom());
        quantite.setText(Foods.get(position).getQuantite()+" Min");
        Glide.with(context)
                .load(Foods.get(position).getPhoto())
                .centerCrop()
                .into(photo);
        return convertView;
    }
}
