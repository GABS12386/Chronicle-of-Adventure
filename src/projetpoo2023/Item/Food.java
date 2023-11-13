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
public abstract class Food extends Item {
    
    private final static String DEFAULT_NAME = "Food";
    private final static int CAPACITY = 5;
    //manger donne ou enleve des hp ou des points de mana
    private int hp_food;
    private int mana_food;
    private final static int DEFAULT_HP = 1;
    private final static int DEFAULT_MANA = 1;
    
    
}
