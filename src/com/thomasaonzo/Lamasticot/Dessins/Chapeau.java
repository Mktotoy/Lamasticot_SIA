package com.thomasaonzo.Lamasticot.Dessins;

/**
 * Write a description of class Chapeau here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chapeau
{
    private String maCouleur;

    /**
     * Constructor for objects of class Chapeau
     */
    public Chapeau()
    {
        maCouleur = "Noir";
    }

    public Chapeau(String maCouleur) {
        this.maCouleur = maCouleur;
    }

    public String getMaCouleur(){
        return this.maCouleur;
    }

    public void setMaCouleur(String maCouleur) {
        this.maCouleur = maCouleur;
    }
}
