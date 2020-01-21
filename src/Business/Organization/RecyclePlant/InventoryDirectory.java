/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.RecyclePlant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANKIT
 */
public class InventoryDirectory {
    private static List<EndProduct> inventoryList = new ArrayList<>();
    
    static {
    EndProduct inventory1 = new EndProduct("Paper", 3, "Toilet Paper",1);
    EndProduct inventory2 = new EndProduct("Crystal", "Steel", 5, 3, "water proof shoes",1);
    EndProduct inventory3 = new EndProduct("Tin", "Copper",  2, 3, "Rods",1);
    EndProduct inventory4 = new EndProduct("Plastic Bottles", "", 4, 6, "T-shirts",1);
    EndProduct inventory5 = new EndProduct("High-Density Polyethylene","Rubber",10,20,"Sunglasses",1);
    EndProduct inventory6 = new EndProduct("Broken Glass",10,"Bangles",1);
    EndProduct inventory7=  new EndProduct("Polyethylene Terephthalate",8,"food pacakaging",1);
    EndProduct inventory8 = new EndProduct("Polyethylene 1.5mm","Polypropylene",7,0,"bottles",1);
    EndProduct inventory9 = new EndProduct("Polystyrene",1,"cup",1);
    EndProduct inventory10 =new EndProduct("batteires",2,"plastic pellets",1);
    EndProduct inventory11 =new EndProduct("kitchen scrap ",3,"compost",1);
    EndProduct inventory12= new EndProduct("copper ","aluminium",10,0,"gunmetals",1);
    EndProduct inventory13 =new EndProduct("Paper 1mm ",10,"Books",1);
    
      inventoryList.add(inventory1);
      inventoryList.add(inventory2);
      inventoryList.add(inventory3);
      inventoryList.add(inventory3);
      inventoryList.add(inventory4);
      inventoryList.add(inventory5);
      inventoryList.add(inventory6);
      inventoryList.add(inventory7);
      inventoryList.add(inventory8);
      inventoryList.add(inventory9);
      inventoryList.add(inventory10);
      inventoryList.add(inventory11);
      inventoryList.add(inventory12);
      inventoryList.add(inventory13);
//      inventoryList.add(inventory14);
//      inventoryList.add(inventory15);
      
    }
    
    
    public InventoryDirectory(){
       
    }

    public static List<EndProduct> getInventoryList() {
        return inventoryList;
    }

    public static void setInventoryList(List<EndProduct> inventoryList) {
        InventoryDirectory.inventoryList = inventoryList;
    }
  
    public EndProduct addProduct(EndProduct inventory){
        inventoryList.add(inventory);
        return inventory;
    }
   

    
   

   
    
    
      
    
    
    
    
}
