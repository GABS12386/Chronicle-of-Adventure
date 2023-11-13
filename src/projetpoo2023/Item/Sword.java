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
public class Sword extends Weapon{
    
    private final static int SWORD_DAMAGE = 10;
    private final static String SWORD_NAME = "Sword";
    private final static int SWORD_CAPACITY = 20;
    
    public Sword(){
        super.setName(SWORD_NAME);
        super.setDamage(SWORD_DAMAGE);
        super.setVolume(SWORD_CAPACITY);
    }
    
}
