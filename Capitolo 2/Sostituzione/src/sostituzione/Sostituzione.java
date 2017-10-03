/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sostituzione;

/**
 *
 * @author Federico
 */
public class Sostituzione {

    public static void main(String[] args) {
       String prova = "Missisipi";
       prova = prova.replace("i", "ii");
       System.out.println(prova);
       System.out.print("La stringa è lunga : ");
       System.out.println(prova.length());
       prova = prova.replace("s", "ss");
       System.out.println(prova);
       System.out.print("La stringa è lunga : ");
       System.out.println(prova.length()); 
    }
    
}
