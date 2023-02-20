/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.displaydigits;

/**
 *
 * @author ayub
 */
    import java.util.Scanner;

public class NumberClass {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

boolean playAgain = true;
        
while (playAgain) {
int numberToGuess = (int) (Math.random() * 1000) + 1;
int guessCount = 0;
int guess = 0;
            
System.out.println("Guess a number between 1 and 1000: ");
            
while (guess != numberToGuess) {
System.out.print("Enter your guess: ");
guess = input.nextInt();
guessCount++;
                
if (guess < numberToGuess) {
System.out.println("Too low. Try again.");
} else if (guess > numberToGuess) {
System.out.println("Too high. Try again.");
}
}
            
System.out.println("Congratulations. You guessed the number!");
     
System.out.print("Do you want to play again? (Y/N): ");
String playAgainInput = input.next();
playAgain = playAgainInput.equalsIgnoreCase("Y");
        }
    }
}


