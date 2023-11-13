/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023;

/**
 *
 * @author USER
 */

//Cette classe sert pour les le texte des differentes parties de l'histoire
public class Story {
    
    public static void printIntro(){
        
        GameConsole.clearConsole();
        GameConsole.printSeparator(20);
        System.out.println("STORY");
        GameConsole.printSeparator(10);
        System.out.println("You're lying on the ground and waked up slowly");
        GameConsole.anythingToContinue();
    }
    
}
