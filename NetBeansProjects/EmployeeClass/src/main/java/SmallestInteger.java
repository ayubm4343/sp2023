/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayub
 */
    import java.util.Scanner;

public class SmallestInteger {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer? ");
        int numberOfInt = input.nextInt();

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfInt; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int currentNumber = input.nextInt();

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        System.out.println("And the smallest number is: " + smallest);
    }
}

