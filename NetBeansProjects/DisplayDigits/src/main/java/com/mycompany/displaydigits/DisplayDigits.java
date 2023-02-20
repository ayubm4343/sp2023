/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displaydigits;

/**
 *
 * @author ayub
 */
 import java.util.Scanner;

public class DisplayDigits {
 public static int quotient(int a, int b) {
return a / b;
}

public static int remainder(int a, int b) {
return a % b;
}

public static void displayDigits(int number) {
int divisor = 10000;
while (divisor >= 1) {
int digit = quotient(number, divisor);
System.out.print(digit + " ");
number = remainder(number, divisor);
divisor = quotient(divisor, 10);
}
System.out.println();
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer between 1 and 99999: ");
int number = input.nextInt();
displayDigits(number);
 }
}


    

