/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

/**
 *
 * @author Federico
 */
public class FirstDigitDistribution {
    private int[] counters;
    
    public FirstDigitDistribution(){
        counters = new int[10];
    }

    public int contacifre(int n) {
        int count = 0;
        if (n==0){
            return 1;
        }
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    
    public void process(Sequence seq, int valueToProcess){
        for (int i = 1; i<=valueToProcess; i++){
            int values = seq.next();
            int cifre = (int) Math.pow(10, contacifre(values)-1);
            int first = values/cifre;
            counters[first]++;
        }
    }
    
    public void process(Sequence seq){
        
        while(seq.hasNext()){
            int values = seq.next();
            int cifre = (int) Math.pow(10, contacifre(values)-1);
            int first = values/cifre;
            counters[first]++;
        }
    }
    
    public void display(){
        for(int i = 0; i<10; i++){
            System.out.println(i+":  "+ counters[i]);
        }
    }

    
    
}
