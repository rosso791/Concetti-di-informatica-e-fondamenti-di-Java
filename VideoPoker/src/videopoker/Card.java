/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videopoker;

/**
 *
 * @author Federico
 */
public class Card {
    
    
    public static enum Suit { Cuori, Quadri, Fiori, Picche }; 
    String seme;
    int number;
    
    public Card (String seme, int number ){
        if(number>=0 && number <=13){
            this.seme = seme;
            this.number = number;
        }
        else{
            throw new IllegalArgumentException("Card value must be between 1 and 13"); 
        }
        
    }
    
    public String getSeme(){
        return seme;
    }
    
    public int getNumber(){
        return number;
    }
    
    @Override
    public boolean equals (Object o){
        Card e = (Card) o;
        return e.seme.equals(this.seme) && e.number == this.number;
    }
}
