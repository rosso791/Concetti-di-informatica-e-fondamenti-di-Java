/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Federico
 */
public class Store {
    
    private class Pair {
      public String key;
      public Comparable value;
 
      public Pair(String key, Comparable value){
         this.key = key;
         this.value = value;
      }
   }

    ArrayList<Pair> data = new ArrayList();
    
    public Pair find(String key){
        for (Pair app : data){
            if(app.key.equals(key)){
                return app;
            }
            
        }
        return null;
    }
    
    public Store store(String key, Comparable value){
        Pair p = find(key);
        if(p== null){
            Pair app = new Pair(key,value);
            data.add(app);
            
        }
        else{
            p.value = value;
        }
        return this;
    } 
    
    public Comparable get(String key){
        Pair p = find(key);
        if (p != null){
            return null;
        }
        else{
            return p.value;
        }
            
    }
    

   public String toString(){
      String s = "";
      return data.stream().map((p) -> p.key+":\t"+p.value+"\t").reduce(s, String::concat);
   } 
 
   public static Comparator<Store> getKeyComparator(String key){
      return (s1,s2)->{return s1.get(key).compareTo(s2.get(key));};
   }
    
}
