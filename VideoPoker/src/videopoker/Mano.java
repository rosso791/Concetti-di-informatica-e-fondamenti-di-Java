/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videopoker;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Mano {
    
   public ArrayList<Card> mano;
   public int[] scarti = new int[5];
   public int[] tenute = new int[5];
   
   public Mano(){
       mano = new ArrayList<>();
   }
   
   public void addCarta(Card e) throws Exception{
       if(mano.size()>=5)
            throw new Exception("Hand is full");
        mano.add(e);
       
   }
   
   public Card getCard(int i){
       return mano.get(i);
   }
   
   public void removeCard(int i){
       mano.remove(i);
   }
   
   public ArrayList<Card> getCards(){
        return (ArrayList<Card>)mano.clone();
   }
   

   public void ordina(){
      mano.sort((Card c1, Card c2)->{
          int v1 = c1.getNumber();
          int v2 = c2.getNumber();
          if (v1 < v2) return -1;
            if (v1 > v2) return 1;
            return 0;
          
      });
    }
   
   public boolean isCouple(){
       Card prev = mano.get(0);
       
       for(int i = 1; i<5; i++){
           Card att = mano.get(i);

           if (prev.getNumber() == att.getNumber() ){
               return true;
           }
           prev = mano.get(i);
       }
       return false;
   }
   
   public boolean isTris(){
       int count = 0;
       Card prev = mano.get(0);
       
       for(int i = 1; i<5; i++){
           Card att = mano.get(i);

           if (prev.getNumber() == att.getNumber() ){
               count++;
           }
           prev = mano.get(i);
       }
       return count==3;
   }
   
   public boolean doppiaCoppia(){
       
   }
   
    
}
