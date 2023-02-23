/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salecommisions;
    import java.util.Scanner;

public class SaleCommisions {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[] salaryRanges = new int[9];
double sales;
System.out.print("Enter an employee's weekly sales (control-d to end): ");
 while (input.hasNext()) {
 sales = input.nextDouble();
int salary = (int) (200 + sales * 0.09);
if (salary >= 1000) {
salaryRanges[8]++;
} else {
salaryRanges[salary / 100]++;
}
System.out.print("Enter an employee's weekly sales (control-d to end): ");
}
System.out.println("\nEmployees in salary range:");
System.out.printf("$%d-$%d: %d\n", 200, 299, salaryRanges[0]);
for (int i = 1; i < 8; i++) {
System.out.printf("$%d-$%d: %d\n", i * 100 + 200, i * 100 + 299, salaryRanges[i]);
}
System.out.printf("$%d and over: %d\n", 1000, salaryRanges[8]);
    }
}

      
