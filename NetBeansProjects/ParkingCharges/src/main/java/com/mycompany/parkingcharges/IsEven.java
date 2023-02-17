/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingcharges;

/**
 *
 * @author ayub
 */
import java.util.Scanner;

public class IsEven {
public static boolean isEven(int value) {
return value % 2 == 0;
    }
    
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a value or press 'E' to exit: ");
        
 String input = scanner.nextLine();
 while (!input.equalsIgnoreCase("E")) {
 try {
 int value = Integer.parseInt(input);
 String result = isEven(value) ? "even" : "odd";
 System.out.printf("%d is %s%n", value, result);
 } catch (NumberFormatException e) {
 System.out.println("Error, please enter a valid value. Ex. 6, 3, 23, 563");
 }
            
System.out.print("Enter a value or press 'E' to exit: ");
input = scanner.nextLine();
}
        
    }
}
