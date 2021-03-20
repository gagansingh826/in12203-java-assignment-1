package com.game;

import java.util.Scanner;

/**
 * Name : Gagandeep Singh
 * Student ID: 201906363
 * Date Submitted: March 20, 2021
 * Class IN2203 G1
 * Name of assignment 1: The Gambling Game
 */
class Player {
	int playerGuess;
	int numOfTries = 5;
	int computerGuess;
	Scanner sc = new Scanner(System.in);

	public Player (int compGuess) {
		this.computerGuess = compGuess;
	}

	public void startPlaying() {
		// Get User Input. Give user 5 tries
		System.out.println("You'll get 5 tries to guess the number");
		while (numOfTries > 0) {
			numOfTries--;
			getUserInput();
			findWinner();
		}
		sc.close();
	}
	
	public void getUserInput() {
		System.out.println("Please enter your guess. Any number between 0 and 100");
		playerGuess = sc.nextInt();
		if (playerGuess > 100 || playerGuess <= 0) {
			System.out.println("Plese make sure the number is between 0 and 100");
			getUserInput();
		}
	}
	
	public void findWinner() {
		if (Math.abs(computerGuess - playerGuess) <= 10) {
			System.out.println("Congrats! You won.");
			System.exit(0);
		} else {
			System.out.println("Try again. Number of tries left: " + numOfTries);
		}
	}
}