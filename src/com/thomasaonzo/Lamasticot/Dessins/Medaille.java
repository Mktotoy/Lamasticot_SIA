package com.thomasaonzo.Lamasticot.Dessins;

/**
 * Created by thaonzo on 24/03/2017.
 */
public class Medaille {

    private int maValeur;
    private String maCouleur;

    public Medaille() {
    }

    public Medaille(int value) {
        this.maValeur = value;
    }

    public Medaille(int maValeur, String maCouleur) {
        this.maValeur = maValeur;
        this.maCouleur = maCouleur;
    }

    public int getMaValeur() {
        return maValeur;
    }

    public void setMaValeur(int maValeur) {
        this.maValeur = maValeur;
    }

    public String getMaCouleur() {
        return maCouleur;
    }

    public void setMaCouleur(String maCouleur) {
        this.maCouleur = maCouleur;
    }


}
