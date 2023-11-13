/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.ExitRoomWorld;

import java.util.ArrayList;
import java.util.List;
import projetpoo2023.Item.Item;

/**
 *
 * @author USER
 */
//Dans les coffres on pourra trouver des items 

public class Chest {
    
    private List<Item> listItem;
    private int number ;
    private final static int DEFAULT_NUMBER = 0;
    
    public Chest(){
        this.listItem = new ArrayList<>();
        this.number = DEFAULT_NUMBER;
    }
    
    public Chest(int n){
        this.listItem = new ArrayList<>();
        this.number = n;
    }
    
    //Prendre un item dans le coffre
    public void takeItem(Item item) {
        if (listItem.contains(item)) {
            listItem.remove(item);
            System.out.println("You took the item: " + item.getName());
        } else {
            System.out.println("This item is not in the chest.");
        }
    }
    
    //Afficher les items contenus dans le coffre
     public void displayItems() {
        if (listItem.isEmpty()) {
            System.out.println("The chest is empty.");
        } else {
            System.out.println("Items in the chest:");
            for (Item item : listItem) {
                System.out.println("- " + item.getName());
            }
        }
    }
     
     //Afficher le numéro du coffre pour l'identifier 
     public int getNumber(){
         return this.number;
     }
     
     //Changer l'identidiant du coffre
     public void setNumber(int n){
         this.number = n;
     }
    
}
