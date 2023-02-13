/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invoice;

/**
 *
 * @author ayub
 */
public class Invoice {
    
    public Invoice (String PartNumber, String PartDescription, int ItemQuantity, double PricePerItem)
    {
        this.PartNumber = PartNumber;
        this.PartDescription= PartDescription;
if (ItemQuantity > 0) 
{
    this.ItemQuantity = ItemQuantity;
    
} 
else 
{
    this.ItemQuantity = 0;
    
}
    if (PricePerItem > 0.0)
    {
        this.PricePerItem = PricePerItem;
       
    }
    else {
        this.PricePerItem = 0.0;
    }
        
    }

    public void setPartNumber(String PartNumber) {
        this.PartNumber = PartNumber;
    }

    public void setPartDescription(String PartDescription) {
        this.PartDescription = PartDescription;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }

    public void setPricePerItem(double PricePerItem) {
        this.PricePerItem = PricePerItem;
    }

    public String getPartNumber() {
        return PartNumber;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public int getItemQuantity() {
        return ItemQuantity;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    
    
    private String PartNumber;
    private String PartDescription;
    private int ItemQuantity;
    private double PricePerItem;
    
    
}
