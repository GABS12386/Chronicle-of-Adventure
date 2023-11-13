/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.Character;

import projetpoo2023.Item.Bag;
import projetpoo2023.Item.Weapon;

/**
 *
 * @author USER
 */
public class Hero extends Character{
    
    private final static int DEFAULT_MANA = 10;
    private final static int DEFAULT_HP = 100;
    private final Bag bag;
    private final static String DEFAULT_NAME = "Hero";

    public Hero(String name){
        super.setName(name);
        super.setMana(DEFAULT_MANA);
        super.setHp(DEFAULT_HP);
        this.bag = new Bag();
    }
   
    
    //Pour le début du jeu 
    @Override
    public void setName(String n){
        
        super.setName(n);
        System.out.println("Hi " + this.getName());
    }
    
        //Stat du perso
    public void statHero(){
        System.out.println("------------------");
        System.out.println("NAME : " + super.getName());
        System.out.println("HP : " + super.getHp());
        System.out.println("MANA : " + super.getMana());
        System.out.println("------------------");
    }

    //Attaquer un ennemi
    @Override
    public void attack(Character c,Weapon w) {
        int new_hp = c.getHp() - w.getDamage();
        c.setHp(new_hp);
    }
    
    
    
}
