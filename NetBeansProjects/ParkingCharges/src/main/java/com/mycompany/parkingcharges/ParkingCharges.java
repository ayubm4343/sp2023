/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.parkingcharges;

/**
 *
 * @author ayub
 * 
 */
import java.util.Scanner;

public class ParkingCharges {

public static double CalculateCharges(double parkedhours)
{
double Charge = 2.00;
if ( parkedhours > 3) {
double extrahours = parkedhours - 3;
double extrahoursfee = extrahours * 0.50;
Charge = Charge + extrahoursfee;
}
if (Charge > 10.00){
Charge = 10.00;
}
return Charge;
}
public static void  main (String[] args) {
Scanner input = new Scanner (System.in);
double Receipts = 0;      
while (true) { 
System.out.print("Enter the hours parked ( Enter -1 to stop ): ");
double parkedhours = input.nextDouble();
if ( parkedhours == -1){
break;
}
double Charge = CalculateCharges(parkedhours);
Receipts += Charge;
}
System.out.printf("Total receipts: $%.2f%n", Receipts);
    }
}
