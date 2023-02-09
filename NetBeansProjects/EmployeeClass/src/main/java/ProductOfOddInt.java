/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayub
 */
public class ProductOfOddInt {
    public static void main(String[] args) {
int product = 1;

  for (int i = 1;
      i <= 15; i++) 
  {
 if (i % 2 != 0) {
 product *= i;
            }
        }

        System.out.println("The product of the odd integers from 1 to 15 is: " + product);
    }
}