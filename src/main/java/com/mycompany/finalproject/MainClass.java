package com.mycompany.finalproject;
import java.util.Scanner;
import java.util.Random;

/*

Requirements:

- The ability to create instances of the Player objects with their proper info (20%)

- The ability to randomly generate a trick for a player (15%)

- The ability to randomly decide if the trick was landed successfully for a player (15%)

- The ability to show the current points (letters each player has got) (20%)

- The ability to store the current points of each player and both players info on disk and in a file (30%)

BONUS (50 points each):

- Support for three players: two offenders and one defender. A letter is assigned the trick is landed by any of the offenders 
after missed by the defender

- Some sort of a graphical interface

*/

public class MainClass {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        String input;
        String roll = "y";
        String view = "v";
        String quit = "q";
        int pop;
        int turn;
        int spin;
        int tricks;
        final String WIN = "SK8";
        
        
        System.out.println("---------------------------");
        System.out.println("WELCOME TO SK8 DICE!");
        System.out.println("---------------------------\n");
        System.out.println("The skaters competing are: \n");
        
        Player1 playerOne = new Player1();
        System.out.println("Player 1: " + playerOne.name);
        System.out.println("Stance: " + playerOne.stance + "\n");
        
        Player2 playerTwo = new Player2();
        System.out.println("Player 2: " + playerTwo.name);
        System.out.println("Stance: " + playerTwo.stance + "\n");
        System.out.println("---------------------------\n");
        
        System.out.println("Tony goes first. \n");
        System.out.println("You have 3 options: ");
        System.out.println("(r)oll the dice,");
        System.out.println("(v)iew the current letters,");
        System.out.println("(q)uit playing...");
        System.out.println("Please make your choice by typing " + "a corresponding letter on the next line: ");
        input = keyboard.nextLine();
            
            while(input.equalsIgnoreCase("r"))
            {
                
                System.out.println("\nRolling! The trick is as follows: \n");
                
                pop = rand.nextInt(3);
                turn = rand.nextInt(2);
                spin = rand.nextInt(2);
                tricks = rand.nextInt(3);
                
                switch (pop)
                {
                    case 0:
                        System.out.println("Fakie...");
                        break;
                    case 1:
                        System.out.println("Nollie...");
                        break;
                    default:
                        System.out.println("Switch...");
                        break;
                }
                
                switch (turn)
                {
                    case 0:
                        System.out.println("Backside...");
                        break;
                    default:
                        System.out.println("Frontside...");
                        break;
                }
                
                switch (spin)
                {
                    case 0:
                        System.out.println("180...");
                        break;
                    default:
                        System.out.println("360...");
                        break;
                }
                
                switch (tricks)
                {
                    case 0:
                        System.out.println("Kickflip...");
                        break;
                    case 1:
                        System.out.println("Heelflip...");
                        break;
                    default:
                        System.out.println("Pop-shuvit...");
                        break;
                    
                }
                
                System.out.println("\n");
                
                System.out.println("Attempt the trick by pressing enter: ");
                input = keyboard.nextLine();
                
                LandFall landFall = new LandFall();
                System.out.println(landFall.chance());
                    
            }
            
            if(input.equalsIgnoreCase("q"))
            {
                
                System.out.println("Thank you for playing!");
                
            }
            
    }
    
}
