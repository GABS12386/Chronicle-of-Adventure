/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023;

import java.util.Scanner;
import projetpoo2023.Character.Hero;
import projetpoo2023.ExitRoomWorld.Chest;
import projetpoo2023.ExitRoomWorld.Room;
import projetpoo2023.ExitRoomWorld.World;
import static projetpoo2023.ExitRoomWorld.World.getTheWorld;
import projetpoo2023.Item.Bag;
import projetpoo2023.Item.Item;
import projetpoo2023.command.Command;
import static projetpoo2023.command.Command.QUIT;

/**
 *
 * @author USER
 */
public class GameConsole {
   static Scanner scanner = new Scanner(System.in);
    private static boolean isGameRunning = true;
    static Hero hero;
    
    //Methode pour avoir le choix de l'utilisateur
    public static int readInt(String prompt,int userChoices){
        int input;
        
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }
    
    // Méthode pour obtenir une saisie utilisateur depuis la console
    public static Command readCommand(String prompt) {
    Command inputCommand = null;

    do {
        System.out.println(prompt);
        try {
            String userInput = scanner.next().toUpperCase(); // Convertir en majuscules pour être insensible à la casse
            inputCommand = Command.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid command. Please enter a valid command!");
        }
    } while (inputCommand == null);

    return inputCommand;
    }
    
    // Méthode pour simuler le vidage de la console
    public static void clearConsole(){
        for(int i = 0; i < 100 ; i++){
            System.out.println();
        }
    }
    
   // Méthode pour imprimer un séparateur de longueur n
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
        }
    }
    
    // Méthode pour imprimer un en-tête
    public static void printHeading(String title){
        printSeparator(1);
        System.out.println("=============================");
        System.out.println(title);
        System.out.println("=============================");
        printSeparator(3);
    }
    
    // Méthode pour arrêter le jeu jusqu'à ce que l'utilisateur entre quelque chose
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    } 
    
    //Methode pour executer la commande tapée
    public static void handleCommand(Command command) {
    command.performAction();
    }  
    
    // Méthode pour commencer le jeu
    public static void startGame(){
        boolean nameSet = false;
        String name;
        clearConsole();
        printHeading("WELCOME TO ADVENTURE");
        printSeparator(1);
        System.out.println("Game developped by : \nRANDRIANARIDERA Gabriel\nRAFAELIMANANA Deraniana\nZANG Jean ");
        printSeparator(1);
        System.out.println("To play the game, type short phrases into the commande line below");
        System.out.println("If you tape the word LOOK, the game gives you a description of your environment");
        System.out.println("You can tape HELP to see all valid statements you can write into the command line");
        
        //titre du jeu 
        anythingToContinue();
        do{
            clearConsole();
            printHeading("What's you're name?");
            name = scanner.next();
            //on demande au joueur si il a fait le bon choix
            clearConsole();
            printHeading("Your name is " + name + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No,I want to change my name");
            int input = readInt("-> ",2);
            if(input == 1)
                printHeading("Welcome in Eldorancia " + name + " try to escape to win the game!");
                nameSet = true;
        }while(!nameSet);
        
        //creer un nouveau joueur
        hero = new Hero(name);
        
        isGameRunning = true;
        
        gameLoop();
    }
    
    //Methode pour continuer la journee
    public static void continueJourney(){
        
        Command userCommand = readCommand("Enter a command:");
        GameConsole.handleCommand(userCommand);
        GameConsole.anythingToContinue();
        
    }
    
    //les info de notre personnage
    public static void characterInfo(){
        clearConsole();
        printHeading("HERO INFO");
        hero.statHero();
        
        anythingToContinue();
    }
    
   //Afficher le menu
    public static void printMenu(){
        clearConsole();
        printHeading("MENU");
        System.out.println("Choose an action : ");
        printSeparator(1);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character info");
        System.out.println("Exit Game");
    }
    
    //game loop
    public static void gameLoop(){
        while(isGameRunning){
            printMenu();
            int input = readInt("->", 3);
            if(input == 1){
                continueJourney();
            }else if(input == 2){
                characterInfo();
            }else{
                isGameRunning = false;
            }
        } 
    }
    
    //Boolean pour la fin du jeu (rajouter les autres conditions)
    public static boolean endGame(){
        boolean end = true;
        while(hero.getHp()>0){
            end = false;
        }
        return end;
    }
    

    

    
}
