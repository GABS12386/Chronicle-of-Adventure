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
public abstract class Item {
    private String name;
    private int volume;
    private final static String DEFAULT_NAME = "Item";
    private final static int DEFAULT_VOLUME = 1;
    
    public Item(){
        this.name =DEFAULT_NAME;
        this.volume=DEFAULT_VOLUME;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
