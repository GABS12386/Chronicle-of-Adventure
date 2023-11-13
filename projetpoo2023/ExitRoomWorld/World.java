/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.ExitRoomWorld;

import projetpoo2023.ExitRoomWorld.Room;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class World {
    
    private final static World THE_WORLD = new World();
    private List<Room> rooms;
    private final String name; //le nom du monde ne pourra etre changé
    private final static String NAME = "Eldorancia";
    
    public World(){
        this.rooms = new ArrayList<>();
        this.name = NAME;
    }
    
    public static World getTheWorld() {
        return THE_WORLD;
    }
    
    public String getNameWorld(){
        return this.name;
    }
    
    //Trouver un piece dans la liste du monde 
    public Room findRoom(Room targetRoom) {
        for (Room room : this.rooms) {
            if (room.equals(targetRoom)) {
                return room;
            }
        }
        System.out.println("This room doesn't exist in this world");
        return null;
    }

    
    //Ajouter une "piece" au monde
    public void addRoom(Room r){
        this.rooms.add(r);
        System.out.println("The room has been added successfully");       
    }
    
    //Afficher les "pieces" du monde
    public void enumRooms(){
        System.out.println("Rooms in the World : ");
        for(Room r : this.rooms){
            System.out.println(r.getName());
        }
        System.out.println("---------------");
    }
}
