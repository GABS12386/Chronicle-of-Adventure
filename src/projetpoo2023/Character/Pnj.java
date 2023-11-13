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
public abstract class Pnj extends Character{
    
    private final static int DEFAULT_MANA = 0;
    private final static int DEFAULT_HP = 100;
    private final static String DEFAULT_NAME = "PNJ";
    
    public Pnj() {
        super.setName(DEFAULT_NAME);
        super.setMana(DEFAULT_MANA);
        super.setHp(DEFAULT_HP);
    }
    
    //Attaquer un ennemi
    @Override
    public void attack(Character c,Weapon w) {
        //il ne peut attaquer que le hero 
        if(c instanceof Hero){
        int new_hp = c.getHp() - w.getDamage();
        c.setHp(new_hp);
        }
    }
}
