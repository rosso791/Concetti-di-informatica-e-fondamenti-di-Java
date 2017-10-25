/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author Federico
 */
public class CounterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter conta = new Counter();
        conta.setLimit(4);
        conta.click();
        System.out.println(conta.getValue());
        conta.click();
        System.out.println(conta.getValue());
        conta.undo();
        System.out.println(conta.getValue());
        conta.click();
        System.out.println(conta.getValue());
        conta.click();
        System.out.println(conta.getValue());
        conta.click();
        System.out.println(conta.getValue());
        conta.click();
        System.out.println(conta.getValue());
        
    }
    
}
