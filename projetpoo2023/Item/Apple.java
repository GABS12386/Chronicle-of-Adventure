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
public class Apple extends Food{
    
    private final static String NAME = "Apple";
    private final static int CAPACITY = 3;
    
    public Apple() {
        super.setName(NAME);
        super.setVolume(CAPACITY);
    }

}
