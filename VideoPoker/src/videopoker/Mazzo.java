/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videopoker;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Federico
 */
public class Mazzo {
    
    public ArrayList<Card> mazzo;
   
    
    public Mazzo(){
        mazzo = new ArrayList<>();
        for (int i = 1; i<=13; i++){
            mazzo.add(new Card("Cuori", i));
            mazzo.add(new Card("Quadri", i));
            mazzo.add(new Card("Fiori", i));
            mazzo.add(new Card("Picche", i));
        }
    }
    
    public Card estrai(){
        return mazzo.remove(0);
    }
    
    public void mescola(){
        Collections.shuffle(mazzo);
    }
    
}
