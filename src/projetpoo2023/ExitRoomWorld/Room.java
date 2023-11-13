/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.ExitRoomWorld;

import projetpoo2023.ExitRoomWorld.Exit;
import projetpoo2023.Character.Character;
import projetpoo2023.Item.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
//Le monde contiendra differentes parties dont il faudra sortir ou non et seront representé par la classe Room
public class Room {
    private String name;
    private List<Item> items;
    private List<Character> characters;
    private List<Chest> chests;
    private List<Exit> exits;
    
    public Room(String n){
        this.name = n;
        this.characters = new ArrayList<>();
        this.items = new ArrayList<>();
        this.chests = new ArrayList<>();
        this.exits = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    //Trouver un coffre en particulier dans la pièce 
    public Chest findChestByNumber(int chestNumber) {
        for (Chest chest : chests) {
            if (chest.getNumber() == chestNumber) {
                return chest;
            }
        }
        return null;
    }
}
