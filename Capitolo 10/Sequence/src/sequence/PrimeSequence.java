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
public class PrimeSequence implements Sequence {
    
    private int n;
    
    public boolean isPrime (int n){
        for (int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int nextPrime(int n){
        for(int i=n+1; true; i++) {
            if(isPrime(i)==true) return i;
        }
    }
    
    
    
    @Override
    public int next(){
        n++;
        return nextPrime(n);
    }
    
    public boolean hasNext(){
        return true;
    }
    
}
