/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Store> list = new ArrayList<>();
        list.add((new Store()).store("Name","Mario").store("Age",40).store("Job","Plumber" ));
        list.add((new Store()).store("Name","Luigi").store("Age",40).store("Job","Plumber" ));
        list.add((new Store()).store("Name","Peach").store("Age",30).store("Job","Princess"));
        list.add((new Store()).store("Name","Toad" ).store("Age",10).store("Job","Mushroom"));
        
        list.sort(Store.getKeyComparator("Name"));
        list.forEach((s) -> { System.out.println(s); });
        System.out.println("---------------------------------");
 
        list.sort(Store.getKeyComparator("Age"));
        list.forEach((s) -> { System.out.println(s); });
        System.out.println("---------------------------------");
 
        list.sort(Store.getKeyComparator("Job"));
        list.forEach((s) -> { System.out.println(s); });
        System.out.println("---------------------------------");
    }
    
}
