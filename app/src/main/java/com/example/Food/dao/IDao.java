package com.example.Food.dao;

import com.example.Food.beans.Food;

import java.util.List;

public interface IDao<T>{
    void create(List <T> o);
    boolean update(T o);
    boolean delete(T o);
    T findById(int id);
    List<T> findAll();
}
