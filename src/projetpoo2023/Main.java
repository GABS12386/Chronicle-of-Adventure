/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo2023;

import projetpoo2023.Character.Hero;
import static projetpoo2023.GameConsole.readCommand;
import projetpoo2023.Item.Apple;
import projetpoo2023.Item.Bag;
import projetpoo2023.command.Command;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameConsole.printHeading("Test commands methods");
        
        boolean v = true;
        GameConsole.startGame();
        //GameConsole.characterInfo();
        while(v){
            //Rajouter les condition pour finir le jeu
        Command userCommand = readCommand("Enter a command:");
        GameConsole.handleCommand(userCommand);
         //GameConsole.quitGame(userCommand);
        GameConsole.anythingToContinue();
        }
    }
    
}
