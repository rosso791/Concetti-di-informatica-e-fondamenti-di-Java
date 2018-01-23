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
public class SquareSequence implements Sequence{
    private int n;

   public int next()
   {
      n++;
      return n * n; 
   }
   
   public boolean hasNext(){
       return true;
   }
}
