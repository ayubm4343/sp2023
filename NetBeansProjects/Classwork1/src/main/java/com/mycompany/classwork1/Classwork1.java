/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork1;

import java.util.Scanner;


public class Classwork1{
    
    public static void main(String [] args ) {
        Scanner Scc = new Scanner (System.in);
        System.out.print("Enter your 5 digit number :");
        int num = Scc.nextInt();
        
        int num1 = num /10000;
        int num2 = (num%10000)/1000;
        int num3 = (num%1000)/100;
        int num4 = (num%100)/10;
        int num5 = num % 10;
        
      System.out.println(num1 + "   " + num2 + "   " + num3 + "   " + num4 + "   " + num5);

    }
}