package com.example.Food.beans;

public class Food {

    private  int id;
    private String nom;
    private int quantite;
    private String photo;
    private String desc;

    private static int comp;

    public Food() {
    }

    public Food(String nom, int quantite, String photo, String desc) {
        this.id = ++comp;
        this.nom = nom;
        this.quantite = quantite;
        this.photo = photo;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
