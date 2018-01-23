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
public class SequenceDemo {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LastDigitDistribution dist1 = new LastDigitDistribution();
        dist1.process(new SquareSequence(), 1000);
        dist1.display();
        
        System.out.println();
        
        LastDigitDistribution dist3 = new LastDigitDistribution();
        dist3.process(new PrimeSequence(), 1000);
        dist3.display();
        
        System.out.println();
        
        MySequence seq = new MySequence();
        seq.add(147);
        seq.add(173);
        seq.add(249);
        seq.add(372);
        seq.add(422);
        seq.add(547);
        seq.add(233);
        seq.add(211);
        seq.add(111);
        seq.add(122);
        LastDigitDistribution dist4 = new LastDigitDistribution();
        dist4.process(seq);
        dist4.display();
        
        System.out.println();
        
        FirstDigitDistribution dist5 = new FirstDigitDistribution();
        seq.reset();
        dist5.process(seq);
        dist5.display();
    }
    
}
