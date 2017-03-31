package com.thomasaonzo.Lamasticot.Dessins;

import java.util.ArrayList;

/**
 * Write a description of class Lamasticot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lamasticot
{
    // 0 pour une fille 1 pour un garcon
    private int monSexe;
    //Couleur du lamasticot
    private String maCouleur;
    //son chapeau
    private Chapeau monChapeau;
    //ses médailles
    private ArrayList<Medaille> mesMedailles;

    /**
     * Constructor for objects of class Lamasticot
     */
    public Lamasticot()
    {
        // initialise instance variables
        monSexe = 0;
        maCouleur = "jaune";
        monChapeau = null;
        mesMedailles = new ArrayList<Medaille>();
    }

    @Override
    public String toString() {
        return "Lamasticot{" +
                "monSexe=" + monSexe +
                ", maCouleur='" + maCouleur + '\'' +
                ", monChapeau=" + monChapeau +
                ", mesMedailles=" + mesMedailles +
                '}';
    }

    public void ajoutMedaille(Medaille m){
        this.mesMedailles.add(m);
    }

    public Medaille voirMedaille(int i){
        return this.mesMedailles.get(i);
    }

    public String getTextSexe(){
        if(this.monSexe == 0)
            return "Fille";
        else
            return "Garçon";
    }

    public String commentEstMonChapeau(){
        if(this.monChapeau !=null)
            return "Mon chapeau est "+ this.monChapeau.getMaCouleur();
        else
            return "Je n'ai pas de chapeau";
    }

    public int getMonSexe() {
        return monSexe;
    }

    public void setMonSexe(int monSexe) {
        this.monSexe = monSexe;
    }

    public String getMaCouleur() {
        return maCouleur;
    }

    public void setMaCouleur(String maCouleur) {
        this.maCouleur = maCouleur;
    }

    public Chapeau getMonChapeau() {
        return monChapeau;
    }

    public void setMonChapeau(Chapeau monChapeau) {
        this.monChapeau = monChapeau;
    }

    public ArrayList<Medaille> getMesMedailles() {
        return mesMedailles;
    }

    public void setMesMedailles(ArrayList<Medaille> mesMedailles) {
        this.mesMedailles = mesMedailles;
    }
}
