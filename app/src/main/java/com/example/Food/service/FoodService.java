package com.example.Food.service;


import java.util.ArrayList;
import java.util.List;
import com.example.Food.beans.Food;
import com.example.Food.dao.IDao;

public class FoodService implements IDao<Food> {
    private List <Food> Foods;
    private static FoodService instance;

    private FoodService() {
        this.Foods = new ArrayList<>();
    }

    public static FoodService getInstance() {
        if(instance == null)
            instance =  new FoodService();
        return instance;
    }

    @Override
    public void create(List <Food> o) {
        Foods=o;
    }

    @Override
    public boolean update(Food o) {
        return false;
    }

    @Override
    public boolean delete(Food o) {
        Foods.remove(o);
        return true;
    }

    @Override
    public Food findById(int id) {
        for(Food f : Foods){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    @Override
    public List<Food> findAll() {
        return Foods;
    }
}
