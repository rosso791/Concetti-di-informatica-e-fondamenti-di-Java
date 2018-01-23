/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bag;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Bag {
    
    ArrayList<Item> ite;
    
    public Bag(){
        ite = new ArrayList<>();
    }
    
    
    
    public int count (String itemName){
        int count =0;
        for (Item i : ite){
            if(i.getName().equals(itemName)){
                count += i.getCount();
            }
        }
        return count;
    }

    void add(String itemName) {
     ite.add(new Item(itemName,1));
    }
    
    class Item{
        
        String item;
        int count;
        
        public Item(String item, int count){
            this.item = item;
            this.count = count;     
        }
        
        public String getName(){
            return item;
        }
        
        public int getCount(){
            return count;
        }
        
    }
    
}
