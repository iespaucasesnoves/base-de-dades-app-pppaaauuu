package com.example.alumne.basedades2;

public class Ingredient {
    private String nom;
    private boolean queda;
    private boolean compra;
    private boolean basic;

    public Ingredient(String nom1){
        this.nom = nom1;
        this.queda = true;
        this.basic = false;
        this.compra = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isQueda() {
        return queda;
    }

    public void setQueda(boolean queda) {
        this.queda = queda;
    }

    public boolean isCompra() {
        return compra;
    }

    public void setCompra(boolean compra) {
        this.compra = compra;
    }

    public boolean isBasic() {
        return basic;
    }

    public void setBasic(boolean basic) {
        this.basic = basic;
    }




}