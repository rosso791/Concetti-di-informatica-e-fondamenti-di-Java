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
public class LastDigitDistribution {
private int[] counters;


   /**
      Constructs a distribution whose counters are set to zero.
   */
   public LastDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */


   /**
      Displays the counter values of this distribution.
   */
   public void display()
   {
      for (int i = 0; i < counters.length; i++)
      {
         System.out.println(i + ": " + counters[i]);
      }
   }   

    void process(Sequence seq, int valueToProcess) {
       for (int i = 1; i <= valueToProcess; i++)
      {
         int value = seq.next();
         int lastDigit = value % 10;
         counters[lastDigit]++;
      }
    }
    
    void process(Sequence seq){
        while(seq.hasNext()){
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }
}
