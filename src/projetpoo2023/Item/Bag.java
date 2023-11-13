/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.Item;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Bag {
    
    private List<Item> items;
    private int capacity;
    private int current_capacity_used;
    private final static int MAX_CAPACITY = 200; //volume max du sac
    private final static int DEFAULT_USE = 0; //volume utilisé dans le sac
    
    public Bag(){
        
        this.items=new ArrayList<>();
        this.capacity = MAX_CAPACITY;
        this.current_capacity_used = DEFAULT_USE;
        
    }
    
    //Vérifie si le sac est vide
    public boolean bagIsEmpty(){
        
        boolean empty = false;
        if(items.isEmpty()){
            empty = true;
            System.out.println("You're bag is empty!");
        }
        return empty;
    }
    
    //Affiche les items contenus dans le sac
    public void enumItems(){
        System.out.println("Your bag contains : ");
        for(Item i : this.items){
            System.out.println(i.getName());
        }
        System.out.println("---------------------");
    }
    
    //Verifie si le sac est plein 
    public boolean bagisFull(){
        
        boolean full = false;
        if(this.current_capacity_used >= this.capacity){
            
            full = true;
            System.out.println("Your bag is full! You cannot add new items to it.");
            
        }
        return full;
    }
    
    //Ajouter un item dans le sac
    public void addItem(Item i){
        //On verifie que le sac n'est pas plein et que l'ajout de l'item ne depassera pas la capacité max du sac
        if(this.bagisFull() == false && (this.current_capacity_used + i.getVolume()) <= this.capacity){
            
            this.items.add(i);
            this.capacity = this.capacity + i.getVolume();
        }
    }
    
    //Enlever un item du sac
    public void remItem(Item item){
        for (int i = 0; i < this.items.size();i++) {
            
            if(items.get(i).equals(item)){
                items.remove(i);
                System.out.println("The item " + item.getName() + " has been successfully removed from the bag");
                break;
            }
        }
        
        if(!items.contains(item)){
            System.out.println("The item is not in the bag");
        }
    }
    
    //prendre un item dans le sac
     public void takeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("You took the item " + item.getName() + " from your bag.");
        } else {
            System.out.println("This item is not in your bag.");
        }
    }
}
