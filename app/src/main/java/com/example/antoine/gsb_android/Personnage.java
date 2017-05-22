package com.example.antoine.gsb_android;


/**
 * Created by AntoineAraujo on 18/05/2017.
 */


    //feu = papier
    // vent   = caillou
    //eau = ciseaux


public class Personnage {
    private int vie = 100;
    private int force;
    private int money;

    public int getVie(){
        return vie;
    }
    public int getForce(){
        return force;
    }
    public int getMoney(){ return money;}

    public int setMoney(int pmoney){
        money = pmoney;
        return money;
    }
}
