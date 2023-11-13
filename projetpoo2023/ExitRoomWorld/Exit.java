/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.ExitRoomWorld;

/**
 *
 * @author USER
 */
public abstract class Exit {
    private Room room1;
    private Room room2;
    
     public Exit(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    //on appelle cette methode pour sortir d'un "pièce" du monde
    public abstract void useExit();
}
