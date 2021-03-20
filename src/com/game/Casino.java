/**
 * 
 */
package com.game;
import java.util.Scanner;
/**
 * @author Gagandeep Singh
 *
 */
public class Casino {
	Game game = new Game();
	Scanner sc = new Scanner(System.in);
	char choice = 'a';
	
	public void startNewGame () {
		System.out.println("*******************************");
		System.out.println("**   Welcome to the Casino   **");
		System.out.println("*******************************");
		do{
			System.out.println("Would you like to play a game? (y/n)");
			choice = sc.next().charAt(0);
			sc.nextLine();
			choice = Character.toLowerCase(choice);
			if (choice == 'n') {
				System.out.println("Good bye!!");
				break;
			} else {
				if (choice == 'y') {
					System.out.println("Let's get started!!\n");
					// Use the game object to start game
					game.PlayGame();
					// Create a new player object and pass computerGuess from game Object in the player constructor
					Player player = new Player(game.getComputerGuess());
					player.startPlaying();
				} else {
					System.out.println("Please make sure you enter a valid choice!");
				}
			}
		} while(true);
		sc.close();
	}
}
