/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

/**
 *
 * @author ayub
 */
public class InvoiceTest {
    public static void main(String[] args) { 
        Invoice invoice = new Invoice ( "450", "Hammer",2,15.0);
        
        System.out.println ( " Part Number: " + invoice.getPartNumber());
            System.out.println( " Part Description: " + invoice.getPartDescription());
                System.out.println("Item Quantity: " + invoice.getItemQuantity());
                System.out.println("Price per Item: $" + invoice.getPricePerItem());
                System.out.println( "Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
