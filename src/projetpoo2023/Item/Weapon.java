/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.Item;

/**
 *
 * @author USER
 */
public abstract class Weapon extends Item{
    
    private int damage;
    private final static int DEFAULT_DAMAGE = 1;
    private final static String DEFAULT_NAME = "Weapon";
    private final static int CAPACITY = 10;
    
    
    public Weapon(){
        super.setName(DEFAULT_NAME);
        super.setVolume(CAPACITY);
        this.damage = DEFAULT_DAMAGE;
    }
    
    // Constructeur avec le nom de l'arme
    public Weapon(String name) {
        super.setName(name);
        super.setVolume(CAPACITY);
        this.damage = DEFAULT_DAMAGE;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public void setDamage(int d){
        this.damage = d;
    }
    
    public void weaponStat(){
        System.out.println("---------------------");
        System.out.println("NAME : " + super.getName());
        System.out.println("DAMAGE : " + this.damage);
        System.out.println("---------------------");        
    }
    
}
