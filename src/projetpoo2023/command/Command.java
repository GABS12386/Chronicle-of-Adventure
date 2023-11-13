/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023.command;

import java.util.Scanner;
import projetpoo2023.Character.Hero;
import projetpoo2023.Character.Pnj;
import projetpoo2023.ExitRoomWorld.Chest;
import projetpoo2023.ExitRoomWorld.Room;
import projetpoo2023.ExitRoomWorld.World;
import projetpoo2023.GameConsole;
import static projetpoo2023.GameConsole.clearConsole;
import static projetpoo2023.GameConsole.handleCommand;
import static projetpoo2023.GameConsole.printHeading;
import static projetpoo2023.GameConsole.readInt;
import projetpoo2023.Item.Bag;
import projetpoo2023.Item.Item;
import projetpoo2023.Item.Sword;
import projetpoo2023.Item.Weapon;

/**
 *
 * @author USER
 */
public enum Command implements CommandAction{    
    
 GO {
        @Override
        public void performAction() {
            System.out.println("You chose to go somewhere.");
        }
    },
    HELP {
        @Override
        public void performAction() {
            System.out.println("You asked for help.");
            System.out.println("The available commands are: ");
            for (Command command : Command.values()) {
                System.out.print(command + " ");
            }
            System.out.println();
        }
    },
    LOOK {
        @Override
        public void performAction() {
            System.out.println("You look around.");
           
        }
    },
    TAKE {
        @Override
        public void performAction() {
            System.out.println("You try to take something.");
        // Demander à l'utilisateur de saisir ROOM        
        // Demander à l'utilisateur de saisir la cible et l'item

        Command targetCommand = GameConsole.readCommand("Enter target (CHEST/BAG): ");
       // String itemName = scanner.next(); //a revoir pour que ce soit un type Item
        
         // Exécuter la commande correspondante
            switch (targetCommand) {
                case CHEST:
                // Demander à l'utilisateur le numéro de la salle
                Scanner scanner = new Scanner(System.in);
                Command c = GameConsole.readCommand("Enter ROOM");
                c = ROOM;
                if(c != ROOM){
                    System.out.println("Invalid target. Use 'room' ");
                }
                    System.out.println("You take an item in a chest");
                    
                    break;
                case BAG:
                    //GameConsole.handleTakeFromBag(itemName);
                    System.out.println("You take an item in a bag");
                    break;
                default:
                    System.out.println("Invalid target. Use 'chest' or 'bag'.");
            }
            
        }
    },
    QUIT {
        @Override
        public void performAction() {
            /*GameConsole.clearConsole();
            printHeading("Are you sure to quit the game ?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No I change my choice");
            int input = readInt("-> ",2);
            if(input == 1){
            hero = null;
            clearConsole();
            GameConsole.startGame();*/
        }
    },
    USE {
        @Override
        public void performAction() {
            System.out.println("You try to use something.");
            
        }
    },
    TALK_WITH {
        @Override
        public void performAction() {
            System.out.println("You try to talk with someone.");
            
        }
    },
    ATTACK {
        @Override
        public void performAction() {
            System.out.println("You try to attack.");
            /*Hero hero = new Hero();
            Pnj pnj = new Pnj() {};
            Weapon weapon = new Sword() {};
            
            // Appeler la méthode d'attaque du héros
            hero.attack(pnj, weapon);
            
            System.out.println("You attack the enemy with " + weapon.getName() + ". Enemy's HP: " + pnj.getHp());*/
        }
    },
    EAT {
        @Override
        public void performAction() {
            System.out.println("You try to eat something.");
            
        }
    },
    ROOM {
         @Override
        public void performAction() {
            System.out.println("This is a ROOM");
        }  
        
    },

    CHEST {
        @Override
    public void performAction() {
        System.out.println("You try to interact with the chest.");

        // Demander à l'utilisateur le numéro de la salle
        Scanner scanner = new Scanner(System.in);
        Command c = GameConsole.readCommand("Enter ROOM");
        c = ROOM;
        if(c != ROOM){
            System.out.println("Invalid target. Use 'room' ");
        }
        
    }
    },
    BAG {
        @Override
        public void performAction() {
            System.out.println("You try to interact with your bag.");
        }
    };

    // Implémentez la méthode performAction pour la commande par défaut
    @Override
    public void performAction() {
        System.out.println("Default action.");
    }

    public boolean requiresItem() {
        return true; 
    }
    
}
