package com.game;

import java.util.Random;

/**
 * Name : Gagandeep Singh
 * Student ID: 201906363
 * Date Submitted: March 20, 2021
 * Class IN2203 G1
 * Name of assignment 1: The Gambling Game
 */
public class Game {
	Random rand = new Random();
	int ComputerGuess = -1;

	public void PlayGame() {
		System.out.println("Guess a number from 1 to 100");
		System.out.println("And I will guess a number too");
		System.out.println("If your guess is within 10 of my guess: then you win . Else I will win!\n");

		ComputerGuess = ComputerGuess();
		// Testing
		// System.out.println("Computer Guess is: " + ComputerGuess);
	}

	public int ComputerGuess() {
		int programGuess = rand.nextInt(100);
		return programGuess;
	}
	
	public int getComputerGuess () {
		return this.ComputerGuess;
	}
}
