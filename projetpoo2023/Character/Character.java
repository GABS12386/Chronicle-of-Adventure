/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.Character;

import projetpoo2023.Item.Weapon;


/**
 *
 * @author USER
 */
public abstract class  Character implements Attack{
    private String name;
    private int hp;
    private int mana;
    private final static int DEFAULT_H = 50;
    private final static int DEFAULT_M = 1;
    private final static String DEFAULT_NAME = "Character";
    
    public Character(){
        this.name = DEFAULT_NAME;
        this.hp=DEFAULT_H;
        this.mana=DEFAULT_M;

    }
    
    public Character(String n){
        this.name = n;
        this.hp=DEFAULT_H;
        this.mana=DEFAULT_M;

    }

    //SETTER ET GETTER
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public void setHp(int health){
        this.hp = health;
    }
    
    public int getMana(){
        return this.mana;
    }
    
    public void setMana(int m){
        this.mana = m;
    }
    
    //Verifie si le character est mort
    public boolean isDead(){
        boolean dead = false;
        if(this.hp<=0){
            System.out.println(this.name + "is dead!");
            dead = true;
        }
        return dead;
    }
    
    @Override
    public void attack(Character c,Weapon w){
        System.out.println("Attack default");
    }
}
