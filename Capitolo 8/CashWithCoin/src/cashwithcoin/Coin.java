/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashwithcoin;

/**
 *
 * @author Federico
 */
public class Coin {
   private double value;
   private String name;
   
   public Coin (double aValue, String aName){
       value=aValue;
       name=aName;
   }
   
   public Coin(){
       
   }
   
   public double getValue(){
       return value;
   }
   
   public String getName(){
       return name;
   }
   
   public void setValue(double aValue){
       value=aValue;
   }
   
   public void setName (String aName){
       name=aName;
   }
    
}
